package com.test.productcategory.ProductPriceReductionApp.config;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Chiranjeevi Allem
 *
 */
public class ProductConfig {
	
	@Value("${jl.domain}")	
	private String domain;
	
	@Value("${jl.uri}")
	private String uri;
	
	@Value("${jl.api.key}")
	private String apikey;
	
	@Value("${jl.proxy.required}")
	private boolean proxyRequired;
	
	@Value("${jl.proxy.host}")
	private String proxyHost;
	
	@Value("${jl.proxy.port}")
	private int proxyPort;
	
	
	@Value("${jl.service.connectionTimeout}")
	private int connectionTimeout;
	
	
	@Value("${jl.service.readtimeout}")
	private int readTimeout;
	
	 @Value("#{${HexCodeMap}}")
	 private Map<String, String> hexCodeMap;
	
			
	
	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getApikey() {
		return apikey;
	}

	public void setApikey(String apikey) {
		this.apikey = apikey;
	}

	public boolean isProxyRequired() {
		return proxyRequired;
	}

	public void setProxyRequired(boolean proxyRequired) {
		this.proxyRequired = proxyRequired;
	}

	public String getProxyHost() {
		return proxyHost;
	}

	public void setProxyHost(String proxyHost) {
		this.proxyHost = proxyHost;
	}

	public int getProxyPort() {
		return proxyPort;
	}

	public void setProxyPort(int proxyPort) {
		this.proxyPort = proxyPort;
	}

	public int getConnectionTimeout() {
		return connectionTimeout;
	}

	public void setConnectionTimeout(int connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
	}

	public int getReadTimeout() {
		return readTimeout;
	}

	public void setReadTimeout(int readTimeout) {
		this.readTimeout = readTimeout;
	}

	public Map<String, String> getHexCodeMap() {
		return hexCodeMap;
	}

	public void setHexCodeMap(Map<String, String> hexCodeMap) {
		this.hexCodeMap = hexCodeMap;
	}


}
