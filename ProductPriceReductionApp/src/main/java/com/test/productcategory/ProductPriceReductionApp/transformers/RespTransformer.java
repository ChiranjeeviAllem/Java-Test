package com.test.productcategory.ProductPriceReductionApp.transformers;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.test.productcategory.ProductPriceReductionApp.config.ProductConfig;
import com.test.productcategory.ProductPriceReductionApp.constants.ProductConstants;
import com.test.productcategory.ProductPriceReductionApp.model.ColorSwatch;
import com.test.productcategory.ProductPriceReductionApp.model.Price;
import com.test.productcategory.ProductPriceReductionApp.model.Products;
import com.test.productcategory.ProductPriceReductionApp.model.ProductsContainer;
import com.test.productcategory.ProductPriceReductionApp.model.response.ColorSwatches;
import com.test.productcategory.ProductPriceReductionApp.model.response.ProductResponse;

/**
 * @author Chiranjeevi Allem
 *
 */
public class RespTransformer {

	@Autowired
	private ProductConfig productConfig;

	/**
	 * Transform response.
	 *
	 * @param labelType
	 *            the label type
	 * @param listAllProducts
	 *            the list all products
	 */
	public List<ProductResponse> transformResponse(String labelType, ProductsContainer listAllProducts) {
		List<ProductResponse> responseProductList = new ArrayList<>();
		List<Products> productList = null;
		if (listAllProducts != null && !CollectionUtils.isEmpty(listAllProducts.getProducts())) {
			// filter the products if price is not available
			productList = listAllProducts.getProducts().stream().filter(Objects::nonNull).filter(
					products -> products.getPrice() != null && !StringUtils.isEmpty(products.getPrice().getWas()))
					.collect(Collectors.toList());
			ProductResponse productResponse = null;
			ColorSwatches colorSwatches = null;
			// Iterate the productList for calculating the price reduction
			for (Products product : productList) {
				productResponse = new ProductResponse();
				productResponse.setProductId(product.getProductId());
				productResponse.setTitle(product.getTitle());
				if (product.getColorSwatches() != null) {
					List<ColorSwatches> colorSwatchesList = new ArrayList<>();
					for (ColorSwatch cs : product.getColorSwatches()) {
						colorSwatches = new ColorSwatches();
						colorSwatches.setColor(cs.getColor());
						colorSwatches.setRgbColor(productConfig.getHexCodeMap().get(cs.getBasicColor()));
						colorSwatches.setSkuid(cs.getSkuId());
						colorSwatchesList.add(colorSwatches);
					}
					productResponse.setColorSwatches(colorSwatchesList);
				}
				if (!(product.getPrice().getNow() instanceof String)) {
					LinkedHashMap nowpriceMap=(LinkedHashMap) product.getPrice().getNow();
					product.getPrice().setNow(nowpriceMap.get("to"));					
				}
				String nowAsString = String.valueOf(product.getPrice().getNow());
				productResponse.setNowPrice(getNowPrice(nowAsString));
				productResponse.setPriceLabel(getPriceLabel(product.getPrice(), labelType));
				productResponse.setPriceReduction(showPercDisCount(product.getPrice()));
				responseProductList.add(productResponse);
			}
		}
		// Added for sorting based on price reduction
		responseProductList.sort(new Comparator<ProductResponse>() {
			@Override
			public int compare(ProductResponse p1, ProductResponse p2) {
				return p2.getPriceReduction().compareTo(p1.getPriceReduction());
			}
		});

		return responseProductList;
	}

	/**
	 * Gets the price label.
	 *
	 * @param price
	 *            the price
	 * @param labelType
	 *            the label type
	 * @return the price label
	 */
	private String getPriceLabel(Price price, String labelType) {
		switch (labelType) {
		case ProductConstants.SHOWWASNOW:
			return ProductConstants.WAS + " " + getNowPrice(price.getWas()) + ", " + ProductConstants.NOW + " "
					+ getNowPrice((String) price.getNow());
		case ProductConstants.SHOWWASTHENNOW:
			return getShowWasNowPrice(price);
		case ProductConstants.SHOWPERCDSCOUNT:
			return showPercDisCount(price) + "% off - " + ProductConstants.NOW + " " + (String) price.getNow();
		default:
			return "Was " + getNowPrice(price.getWas()) + ", now " + getNowPrice((String) price.getNow());
		}

	}

	/**
	 * Gets the show was now price.
	 *
	 * @param price the price
	 * @return the show was now price
	 */
	private String getShowWasNowPrice(Price price) {
		String then = null;
		if (!StringUtils.isEmpty(price.getThen2())) {
			then = price.getThen2();
		} else if (!StringUtils.isEmpty(price.getThen1())) {
			then = price.getThen1();
		}
		if (then != null) {
			return ProductConstants.WAS + " " + getNowPrice(price.getWas()) + ", " + ProductConstants.THEN + " "
					+ getNowPrice(then) + ", " + ProductConstants.NOW + getNowPrice((String) price.getNow());
		} else {
			return ProductConstants.WAS + " " + getNowPrice(price.getWas()) + ", " + ProductConstants.NOW + " "
					+ getNowPrice((String) price.getNow());
		}
	}

	/**
	 * Show perc dis count.
	 *
	 * @param price
	 *            the price
	 * @return the float
	 */
	public double showPercDisCount(Price price) {
		float differencePrice = Float.parseFloat(price.getWas()) - Float.parseFloat((String) price.getNow());
		float totalPrice = Float.parseFloat(price.getWas()) + Float.parseFloat((String) price.getNow());
		return Math.round(Math.abs(differencePrice / totalPrice * 100));
	}

	/**
	 * Use case : nowPrice<String> which is the price.now represented as a
	 * string, including the currency, e.g. “£1.75”. For values that are
	 * integer, if they are less £10 return a decimal price, otherwise show an
	 * integer price, e.g. “£2.00” or “£10”
	 * 
	 * @param nowAsString
	 */
	private String getNowPrice(String nowAsString) {
		StringBuilder nowPrice = new StringBuilder(ProductConstants.GBP_SYMBOL);
		String formattedNowPrice = null;
		if (!StringUtils.isEmpty(nowAsString)) {
			Double nowAsInt = Double.valueOf(nowAsString);
			if (nowAsInt < 10) {
				DecimalFormat df = new DecimalFormat("#.00");
				formattedNowPrice = df.format(nowAsInt);
			} else {
				formattedNowPrice = nowAsString;
			}
		}
		return nowPrice.append(formattedNowPrice).toString();
	}

}
