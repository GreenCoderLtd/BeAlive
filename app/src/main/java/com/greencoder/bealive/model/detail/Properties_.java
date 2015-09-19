package com.greencoder.bealive.model.detail;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Properties_ {

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

}