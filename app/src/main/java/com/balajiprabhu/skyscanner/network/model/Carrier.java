
package com.balajiprabhu.skyscanner.network.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Carrier {

    @SerializedName("CarrierId")
    @Expose
    private Integer carrierId;
    @SerializedName("Name")
    @Expose
    private String name;

    public Integer getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(Integer carrierId) {
        this.carrierId = carrierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
