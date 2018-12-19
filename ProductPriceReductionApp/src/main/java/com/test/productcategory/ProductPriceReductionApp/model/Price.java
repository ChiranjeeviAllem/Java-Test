
package com.test.productcategory.ProductPriceReductionApp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Price {

    @JsonProperty("was")
    private String was;
    
    @JsonProperty("then1")
    private String then1;
    
    @JsonProperty("then2")
    private String then2;
    
    @JsonProperty("now")
    private Object now;
    
    @JsonProperty("uom")
    private String uom;
    
    @JsonProperty("currency")
    private String currency;

    public String getWas() {
        return was;
    }

    public void setWas(String was) {
        this.was = was;
    }

    public String getThen1() {
        return then1;
    }

    public void setThen1(String then1) {
        this.then1 = then1;
    }

    public String getThen2() {
        return then2;
    }

    public void setThen2(String then2) {
        this.then2 = then2;
    }

    public Object getNow() {
        return now;
    }

    public void setNow(Object now) {
        this.now = now;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
