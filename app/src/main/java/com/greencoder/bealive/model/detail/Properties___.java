

package com.greencoder.bealive.model.detail;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Properties___ {

    @SerializedName("eventsource")
    @Expose
    private String eventsource;
    @SerializedName("eventsourcecode")
    @Expose
    private String eventsourcecode;

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

}