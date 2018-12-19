
package com.test.productcategory.ProductPriceReductionApp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "priceMatched",
    "offer",
    "customPromotionalMessage",
    "bundleHeadline",
    "customSpecialOffer"
})
public class PromoMessages {

    @JsonProperty("priceMatched")
    private String priceMatched;
    @JsonProperty("offer")
    private String offer;
    @JsonProperty("customPromotionalMessage")
    private String customPromotionalMessage;
    @JsonProperty("bundleHeadline")
    private String bundleHeadline;
    @JsonProperty("customSpecialOffer")
    private CustomSpecialOffer customSpecialOffer;

    @JsonProperty("priceMatched")
    public String getPriceMatched() {
        return priceMatched;
    }

    @JsonProperty("priceMatched")
    public void setPriceMatched(String priceMatched) {
        this.priceMatched = priceMatched;
    }

    @JsonProperty("offer")
    public String getOffer() {
        return offer;
    }

    @JsonProperty("offer")
    public void setOffer(String offer) {
        this.offer = offer;
    }

    @JsonProperty("customPromotionalMessage")
    public String getCustomPromotionalMessage() {
        return customPromotionalMessage;
    }

    @JsonProperty("customPromotionalMessage")
    public void setCustomPromotionalMessage(String customPromotionalMessage) {
        this.customPromotionalMessage = customPromotionalMessage;
    }

    @JsonProperty("bundleHeadline")
    public String getBundleHeadline() {
        return bundleHeadline;
    }

    @JsonProperty("bundleHeadline")
    public void setBundleHeadline(String bundleHeadline) {
        this.bundleHeadline = bundleHeadline;
    }

    @JsonProperty("customSpecialOffer")
    public CustomSpecialOffer getCustomSpecialOffer() {
        return customSpecialOffer;
    }

    @JsonProperty("customSpecialOffer")
    public void setCustomSpecialOffer(CustomSpecialOffer customSpecialOffer) {
        this.customSpecialOffer = customSpecialOffer;
    }

}
