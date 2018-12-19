
package com.test.productcategory.ProductPriceReductionApp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "facetId",
    "label",
    "qty",
    "color",
    "colorSwatchUrl",
    "isSelected",
    "seoUrlParts"
})
public class Detail {

    @JsonProperty("facetId")
    private String facetId;
    @JsonProperty("label")
    private String label;
    @JsonProperty("qty")
    private String qty;
    @JsonProperty("color")
    private String color;
    @JsonProperty("colorSwatchUrl")
    private String colorSwatchUrl;
    @JsonProperty("isSelected")
    private String isSelected;
    @JsonProperty("seoUrlParts")
    private String seoUrlParts;

    @JsonProperty("facetId")
    public String getFacetId() {
        return facetId;
    }

    @JsonProperty("facetId")
    public void setFacetId(String facetId) {
        this.facetId = facetId;
    }

    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    @JsonProperty("qty")
    public String getQty() {
        return qty;
    }

    @JsonProperty("qty")
    public void setQty(String qty) {
        this.qty = qty;
    }

    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(String color) {
        this.color = color;
    }

    @JsonProperty("colorSwatchUrl")
    public String getColorSwatchUrl() {
        return colorSwatchUrl;
    }

    @JsonProperty("colorSwatchUrl")
    public void setColorSwatchUrl(String colorSwatchUrl) {
        this.colorSwatchUrl = colorSwatchUrl;
    }

    @JsonProperty("isSelected")
    public String getIsSelected() {
        return isSelected;
    }

    @JsonProperty("isSelected")
    public void setIsSelected(String isSelected) {
        this.isSelected = isSelected;
    }

    @JsonProperty("seoUrlParts")
    public String getSeoUrlParts() {
        return seoUrlParts;
    }

    @JsonProperty("seoUrlParts")
    public void setSeoUrlParts(String seoUrlParts) {
        this.seoUrlParts = seoUrlParts;
    }

}
