package com.test.productcategory.ProductPriceReductionApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import com.test.productcategory.ProductPriceReductionApp.config.ProductConfig;
import com.test.productcategory.ProductPriceReductionApp.service.ProductServiceCommand;
import com.test.productcategory.ProductPriceReductionApp.transformers.RespTransformer;

@SpringBootApplication
@EnableAutoConfiguration
@EnableHystrixDashboard
@EnableCircuitBreaker
@ComponentScan("com.test.productcategory.ProductPriceReductionApp")
public class ProductPriceReductionAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductPriceReductionAppApplication.class, args);
	}
	
	  @Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }
	   
	   @Bean 
	   public ProductServiceCommand productServiceCommand(){
		   return new ProductServiceCommand(); 
	   }
	   
	   @Bean
	   public ProductConfig productConfig(){
		   return new ProductConfig();
	   }
	   
	   @Bean
	   public RespTransformer respTransformer(){
		   return new RespTransformer();
	   }

}

