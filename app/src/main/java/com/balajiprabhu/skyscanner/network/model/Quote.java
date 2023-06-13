
package com.balajiprabhu.skyscanner.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Quote {

    @SerializedName("QuoteId")
    @Expose
    private Integer quoteId;
    @SerializedName("MinPrice")
    @Expose
    private Integer minPrice;
    @SerializedName("Direct")
    @Expose
    private Boolean direct;
    @SerializedName("OutboundLeg")
    @Expose
    private OutboundLeg outboundLeg;
    @SerializedName("QuoteDateTime")
    @Expose
    private String quoteDateTime;

    public Integer getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(Integer quoteId) {
        this.quoteId = quoteId;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

    public Boolean getDirect() {
        return direct;
    }

    public void setDirect(Boolean direct) {
        this.direct = direct;
    }

    public OutboundLeg getOutboundLeg() {
        return outboundLeg;
    }

    public void setOutboundLeg(OutboundLeg outboundLeg) {
        this.outboundLeg = outboundLeg;
    }

    public String getQuoteDateTime() {
        return quoteDateTime;
    }

    public void setQuoteDateTime(String quoteDateTime) {
        this.quoteDateTime = quoteDateTime;
    }

}
