
package com.test.productcategory.ProductPriceReductionApp.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Products {

    @JsonProperty("productId")
    private String productId;
    @JsonProperty("type")
    private String type;
    @JsonProperty("title")
    private String title;
    @JsonProperty("code")
    private String code;
    @JsonProperty("averageRating")
    private Float averageRating;
    @JsonProperty("reviews")
    private Integer reviews;
    @JsonProperty("price")
    private Price price;
    @JsonProperty("image")
    private String image;
    @JsonProperty("additionalServices")
    private List<Object> additionalServices = null;
    @JsonProperty("displaySpecialOffer")
    private String displaySpecialOffer;
    @JsonProperty("promoMessages")
    private PromoMessages promoMessages;
    @JsonProperty("nonPromoMessage")
    private String nonPromoMessage;
    @JsonProperty("defaultSkuId")
    private String defaultSkuId;
    @JsonProperty("colorSwatches")
    private List<ColorSwatch> colorSwatches = null;
    @JsonProperty("colorSwatchSelected")
    private Integer colorSwatchSelected;
    @JsonProperty("colorWheelMessage")
    private String colorWheelMessage;
    @JsonProperty("outOfStock")
    private Boolean outOfStock;
    @JsonProperty("emailMeWhenAvailable")
    private Boolean emailMeWhenAvailable;
    @JsonProperty("availabilityMessage")
    private String availabilityMessage;
    @JsonProperty("compare")
    private Boolean compare;
    @JsonProperty("fabric")
    private String fabric;
    @JsonProperty("swatchAvailable")
    private Boolean swatchAvailable;
    @JsonProperty("categoryQuickViewEnabled")
    private Boolean categoryQuickViewEnabled;
    @JsonProperty("swatchCategoryType")
    private String swatchCategoryType;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("ageRestriction")
    private Integer ageRestriction;
    @JsonProperty("isInStoreOnly")
    private Boolean isInStoreOnly;
    @JsonProperty("isMadeToMeasure")
    private Boolean isMadeToMeasure;
    @JsonProperty("isBundle")
    private Boolean isBundle;
    @JsonProperty("isProductSet")
    private Boolean isProductSet;
    @JsonProperty("promotionalFeatures")
    private List<Object> promotionalFeatures = null;
    @JsonProperty("features")
    private List<Object> features = null;
    @JsonProperty("dynamicAttributes")
    private DynamicAttributes dynamicAttributes;
    @JsonProperty("directorate")
    private String directorate;
    @JsonProperty("releaseDateTimestamp")
    private Integer releaseDateTimestamp;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Float averageRating) {
        this.averageRating = averageRating;
    }

    public Integer getReviews() {
        return reviews;
    }

    public void setReviews(Integer reviews) {
        this.reviews = reviews;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Object> getAdditionalServices() {
        return additionalServices;
    }

    public void setAdditionalServices(List<Object> additionalServices) {
        this.additionalServices = additionalServices;
    }

    public String getDisplaySpecialOffer() {
        return displaySpecialOffer;
    }

    public void setDisplaySpecialOffer(String displaySpecialOffer) {
        this.displaySpecialOffer = displaySpecialOffer;
    }

    public PromoMessages getPromoMessages() {
        return promoMessages;
    }

    public void setPromoMessages(PromoMessages promoMessages) {
        this.promoMessages = promoMessages;
    }

    public String getNonPromoMessage() {
        return nonPromoMessage;
    }

    public void setNonPromoMessage(String nonPromoMessage) {
        this.nonPromoMessage = nonPromoMessage;
    }

    public String getDefaultSkuId() {
        return defaultSkuId;
    }

    public void setDefaultSkuId(String defaultSkuId) {
        this.defaultSkuId = defaultSkuId;
    }

    public List<ColorSwatch> getColorSwatches() {
        return colorSwatches;
    }

    public void setColorSwatches(List<ColorSwatch> colorSwatches) {
        this.colorSwatches = colorSwatches;
    }

    public Integer getColorSwatchSelected() {
        return colorSwatchSelected;
    }

    public void setColorSwatchSelected(Integer colorSwatchSelected) {
        this.colorSwatchSelected = colorSwatchSelected;
    }

    public String getColorWheelMessage() {
        return colorWheelMessage;
    }

    public void setColorWheelMessage(String colorWheelMessage) {
        this.colorWheelMessage = colorWheelMessage;
    }

    public Boolean getOutOfStock() {
        return outOfStock;
    }

    public void setOutOfStock(Boolean outOfStock) {
        this.outOfStock = outOfStock;
    }

    public Boolean getEmailMeWhenAvailable() {
        return emailMeWhenAvailable;
    }

    public void setEmailMeWhenAvailable(Boolean emailMeWhenAvailable) {
        this.emailMeWhenAvailable = emailMeWhenAvailable;
    }

    public String getAvailabilityMessage() {
        return availabilityMessage;
    }

    public void setAvailabilityMessage(String availabilityMessage) {
        this.availabilityMessage = availabilityMessage;
    }

    public Boolean getCompare() {
        return compare;
    }

    public void setCompare(Boolean compare) {
        this.compare = compare;
    }

    public String getFabric() {
        return fabric;
    }

    @JsonProperty("fabric")
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public Boolean getSwatchAvailable() {
        return swatchAvailable;
    }

    public void setSwatchAvailable(Boolean swatchAvailable) {
        this.swatchAvailable = swatchAvailable;
    }

    public Boolean getCategoryQuickViewEnabled() {
        return categoryQuickViewEnabled;
    }

    public void setCategoryQuickViewEnabled(Boolean categoryQuickViewEnabled) {
        this.categoryQuickViewEnabled = categoryQuickViewEnabled;
    }

    public String getSwatchCategoryType() {
        return swatchCategoryType;
    }

    public void setSwatchCategoryType(String swatchCategoryType) {
        this.swatchCategoryType = swatchCategoryType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(Integer ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public Boolean getIsInStoreOnly() {
        return isInStoreOnly;
    }

    public void setIsInStoreOnly(Boolean isInStoreOnly) {
        this.isInStoreOnly = isInStoreOnly;
    }

    @JsonProperty("isMadeToMeasure")
    public Boolean getIsMadeToMeasure() {
        return isMadeToMeasure;
    }

    @JsonProperty("isMadeToMeasure")
    public void setIsMadeToMeasure(Boolean isMadeToMeasure) {
        this.isMadeToMeasure = isMadeToMeasure;
    }

    @JsonProperty("isBundle")
    public Boolean getIsBundle() {
        return isBundle;
    }

    @JsonProperty("isBundle")
    public void setIsBundle(Boolean isBundle) {
        this.isBundle = isBundle;
    }

    @JsonProperty("isProductSet")
    public Boolean getIsProductSet() {
        return isProductSet;
    }

    @JsonProperty("isProductSet")
    public void setIsProductSet(Boolean isProductSet) {
        this.isProductSet = isProductSet;
    }

    @JsonProperty("promotionalFeatures")
    public List<Object> getPromotionalFeatures() {
        return promotionalFeatures;
    }

    @JsonProperty("promotionalFeatures")
    public void setPromotionalFeatures(List<Object> promotionalFeatures) {
        this.promotionalFeatures = promotionalFeatures;
    }

    @JsonProperty("features")
    public List<Object> getFeatures() {
        return features;
    }

    @JsonProperty("features")
    public void setFeatures(List<Object> features) {
        this.features = features;
    }

    @JsonProperty("dynamicAttributes")
    public DynamicAttributes getDynamicAttributes() {
        return dynamicAttributes;
    }

    @JsonProperty("dynamicAttributes")
    public void setDynamicAttributes(DynamicAttributes dynamicAttributes) {
        this.dynamicAttributes = dynamicAttributes;
    }

    @JsonProperty("directorate")
    public String getDirectorate() {
        return directorate;
    }

    @JsonProperty("directorate")
    public void setDirectorate(String directorate) {
        this.directorate = directorate;
    }

    @JsonProperty("releaseDateTimestamp")
    public Integer getReleaseDateTimestamp() {
        return releaseDateTimestamp;
    }

    @JsonProperty("releaseDateTimestamp")
    public void setReleaseDateTimestamp(Integer releaseDateTimestamp) {
        this.releaseDateTimestamp = releaseDateTimestamp;
    }

}
