package com.test.productcategory.ProductPriceReductionApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.productcategory.ProductPriceReductionApp.model.response.ProductResponse;

@Service
public interface ProductService {
	
	/**
	 * Gets the all products.
	 *
	 * @param labelType the label type
	 * @return the all products
	 */
	public List<ProductResponse> getAllProducts(String labelType);

}
