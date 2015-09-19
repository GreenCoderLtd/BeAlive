package com.greencoder.bealive.model.detail;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Contents_ {

    @SerializedName("nearby-cities.inc.html")
    @Expose
    private NearbyCitiesIncHtml nearbyCitiesIncHtml;
    @SerializedName("nearby-cities.json")
    @Expose
    private NearbyCitiesJson nearbyCitiesJson;

    /**
     * @return The nearbyCitiesIncHtml
     */
    public NearbyCitiesIncHtml getNearbyCitiesIncHtml() {
        return nearbyCitiesIncHtml;
    }

    /**
     * @param nearbyCitiesIncHtml The nearby-cities.inc.html
     */
    public void setNearbyCitiesIncHtml(NearbyCitiesIncHtml nearbyCitiesIncHtml) {
        this.nearbyCitiesIncHtml = nearbyCitiesIncHtml;
    }

    /**
     * @return The nearbyCitiesJson
     */
    public NearbyCitiesJson getNearbyCitiesJson() {
        return nearbyCitiesJson;
    }

    /**
     * @param nearbyCitiesJson The nearby-cities.json
     */
    public void setNearbyCitiesJson(NearbyCitiesJson nearbyCitiesJson) {
        this.nearbyCitiesJson = nearbyCitiesJson;
    }

}