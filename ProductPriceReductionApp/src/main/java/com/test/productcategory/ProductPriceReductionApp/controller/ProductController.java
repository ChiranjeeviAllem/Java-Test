/**
 * 
 */
package com.test.productcategory.ProductPriceReductionApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.productcategory.ProductPriceReductionApp.constants.ProductConstants;
import com.test.productcategory.ProductPriceReductionApp.model.response.ProductResponse;
import com.test.productcategory.ProductPriceReductionApp.service.ProductService;

/**
 * @author Chiranjeevi Allem
 *
 */
@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	

	/**
	 * Gets the Products based on lable type.
	 *
	 * @param labelType the label type
	 * @return the message
	 */
	@GetMapping(value="/v1/products",produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<ProductResponse> getAllProducts(@RequestParam(required=false,defaultValue = ProductConstants.SHOWWASNOW) String labelType){
		//No validation required as labelType will be showwasnow by default.  
		return productService.getAllProducts(labelType);
		
	}

}
