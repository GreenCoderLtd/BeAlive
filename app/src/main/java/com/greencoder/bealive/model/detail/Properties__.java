package com.greencoder.bealive.model.detail;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Properties__ {

    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("eventsource")
    @Expose
    private String eventsource;
    @SerializedName("eventsourcecode")
    @Expose
    private String eventsourcecode;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("tsunamiFlag")
    @Expose
    private String tsunamiFlag;
    @SerializedName("utcOffset")
    @Expose
    private String utcOffset;

    /**
     *
     * @return
     * The country
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country
     * The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     *
     * @return
     * The eventsource
     */
    public String getEventsource() {
        return eventsource;
    }

    /**
     *
     * @param eventsource
     * The eventsource
     */
    public void setEventsource(String eventsource) {
        this.eventsource = eventsource;
    }

    /**
     *
     * @return
     * The eventsourcecode
     */
    public String getEventsourcecode() {
        return eventsourcecode;
    }

    /**
     *
     * @param eventsourcecode
     * The eventsourcecode
     */
    public void setEventsourcecode(String eventsourcecode) {
        this.eventsourcecode = eventsourcecode;
    }

    /**
     *
     * @return
     * The location
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return
     * The state
     */
    public String getState() {
        return state;
    }

    /**
     *
     * @param state
     * The state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     *
     * @return
     * The tsunamiFlag
     */
    public String getTsunamiFlag() {
        return tsunamiFlag;
    }

    /**
     *
     * @param tsunamiFlag
     * The tsunamiFlag
     */
    public void setTsunamiFlag(String tsunamiFlag) {
        this.tsunamiFlag = tsunamiFlag;
    }

    /**
     *
     * @return
     * The utcOffset
     */
    public String getUtcOffset() {
        return utcOffset;
    }

    /**
     *
     * @param utcOffset
     * The utcOffset
     */
    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }

}