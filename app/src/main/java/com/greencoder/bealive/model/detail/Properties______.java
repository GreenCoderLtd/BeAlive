package com.greencoder.bealive.model.detail;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Properties______ {

    @SerializedName("addon-code")
    @Expose
    private String addonCode;
    @SerializedName("addon-type")
    @Expose
    private String addonType;
    @SerializedName("eventsource")
    @Expose
    private String eventsource;
    @SerializedName("eventsourcecode")
    @Expose
    private String eventsourcecode;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("version")
    @Expose
    private String version;

    /**
     *
     * @return
     * The addonCode
     */
    public String getAddonCode() {
        return addonCode;
    }

    /**
     *
     * @param addonCode
     * The addon-code
     */
    public void setAddonCode(String addonCode) {
        this.addonCode = addonCode;
    }

    /**
     *
     * @return
     * The addonType
     */
    public String getAddonType() {
        return addonType;
    }

    /**
     *
     * @param addonType
     * The addon-type
     */
    public void setAddonType(String addonType) {
        this.addonType = addonType;
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
     * The text
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @param text
     * The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The version
     */
    public String getVersion() {
        return version;
    }

    /**
     *
     * @param version
     * The version
     */
    public void setVersion(String version) {
        this.version = version;
    }

}