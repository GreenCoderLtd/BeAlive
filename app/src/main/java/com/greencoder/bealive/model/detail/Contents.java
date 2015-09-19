package com.greencoder.bealive.model.detail;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Contents {

    @SerializedName("geoserve.json")
    @Expose
    private GeoserveJson geoserveJson;

    /**
     * @return The geoserveJson
     */
    public GeoserveJson getGeoserveJson() {
        return geoserveJson;
    }

    /**
     * @param geoserveJson The geoserve.json
     */
    public void setGeoserveJson(GeoserveJson geoserveJson) {
        this.geoserveJson = geoserveJson;
    }

}
