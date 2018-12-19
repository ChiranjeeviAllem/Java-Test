package com.test.productcategory.ProductPriceReductionApp.model.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductResponse {
	
	 private String productId;
	 
	 private String title;
	 
	 private List<ColorSwatches> colorSwatches;
	 
	 private String nowPrice;
	 
	 private String priceLabel;
	 
	 @JsonIgnore
	 private Double priceReduction;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	

	public String getNowPrice() {
		return nowPrice;
	}

	public void setNowPrice(String nowPrice) {
		this.nowPrice = nowPrice;
	}

	public String getPriceLabel() {
		return priceLabel;
	}

	public void setPriceLabel(String priceLabel) {
		this.priceLabel = priceLabel;
	}

	public List<ColorSwatches> getColorSwatches() {
		return colorSwatches;
	}

	public void setColorSwatches(List<ColorSwatches> colorSwatches) {
		this.colorSwatches = colorSwatches;
	}

	public Double getPriceReduction() {
		return priceReduction;
	}

	public void setPriceReduction(Double priceReduction) {
		this.priceReduction = priceReduction;
	}
	 
	 
	 
	 

}
