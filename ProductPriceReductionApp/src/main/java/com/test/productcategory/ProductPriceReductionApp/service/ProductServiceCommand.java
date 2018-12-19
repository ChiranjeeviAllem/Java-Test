package com.test.productcategory.ProductPriceReductionApp.service;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.test.productcategory.ProductPriceReductionApp.config.ProductConfig;
import com.test.productcategory.ProductPriceReductionApp.model.ProductsContainer;

/**
 * @author Chiranjeevi Allem
 *
 */
public class ProductServiceCommand {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ProductConfig productConfig;

	/**
	 * List all products.
	 *
	 * @return the response entity
	 */
	@HystrixCommand(groupKey = "PRODUCT_GROUP", threadPoolKey = "PRODUCT_THREAD_POOL", commandKey = "PRODUCT_COMMAND_KEY", fallbackMethod = "listAllProductsFallback")
	public ProductsContainer listAllProducts() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<>(headers);
		String url = new StringBuffer(productConfig.getDomain()).append(productConfig.getUri())
				.append(productConfig.getApikey()).toString();
		ResponseEntity<ProductsContainer> exchange = getRestTemplate(productConfig.getConnectionTimeout()).exchange(url,
				HttpMethod.GET, entity, ProductsContainer.class);
		return exchange.getBody();
	}

	public ProductsContainer listAllProductsFallback(Throwable failure) {
		System.out.println(failure);
		return null;
	}

	/**
	 * Gets the rest template.
	 *
	 * @param connectTimeout
	 *            the connect timeout
	 * @return the rest template
	 */
	public RestTemplate getRestTemplate(int connectTimeout) {

		SimpleClientHttpRequestFactory requestFactory = (SimpleClientHttpRequestFactory) this.restTemplate
				.getRequestFactory();
		requestFactory.setConnectTimeout(connectTimeout);
		requestFactory.setReadTimeout(productConfig.getReadTimeout());
		if (productConfig.isProxyRequired()) {
			Proxy proxy = new Proxy(Type.HTTP,
					new InetSocketAddress(productConfig.getProxyHost(), productConfig.getProxyPort()));
			requestFactory.setProxy(proxy);
		}
		return restTemplate;

	}

}
