package com.test.productcategory.ProductPriceReductionApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.productcategory.ProductPriceReductionApp.model.ProductsContainer;
import com.test.productcategory.ProductPriceReductionApp.model.response.ProductResponse;
import com.test.productcategory.ProductPriceReductionApp.transformers.RespTransformer;

/**
 * @author Chiranjeevi Allem
 *
 */
@Service
public class ProductServiceImpl implements ProductService {
	
	
	
	
	@Autowired
	private ProductServiceCommand productServiceCommand;
	
	@Autowired
	private RespTransformer respTransformer;

	/* (non-Javadoc)
	 * @see com.zensar.service.ProductService#getAllProducts(java.lang.String)
	 */
	@Override
	public List<ProductResponse> getAllProducts(String labelType) {
	
		ProductsContainer listAllProducts = productServiceCommand.listAllProducts();     
	      
	      return respTransformer.transformResponse(labelType, listAllProducts);
		
		
	}

	
		

}
