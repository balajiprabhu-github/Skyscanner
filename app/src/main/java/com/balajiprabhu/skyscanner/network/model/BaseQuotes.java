
package com.balajiprabhu.skyscanner.network.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BaseQuotes {

    @SerializedName("Quotes")
    @Expose
    private List<Quote> quotes = null;
    @SerializedName("Places")
    @Expose
    private List<Place> places = null;
    @SerializedName("Carriers")
    @Expose
    private List<Carrier> carriers = null;
    @SerializedName("Currencies")
    @Expose
    private List<Currency> currencies = null;

    public List<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    public List<Carrier> getCarriers() {
        return carriers;
    }

    public void setCarriers(List<Carrier> carriers) {
        this.carriers = carriers;
    }

    public List<Currency> getCurrencies() {
        return currencies;
    }

    public void setCurrencies(List<Currency> currencies) {
        this.currencies = currencies;
    }

}
