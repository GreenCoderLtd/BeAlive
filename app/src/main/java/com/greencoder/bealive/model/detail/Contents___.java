package com.greencoder.bealive.model.detail;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Contents___ {

    @SerializedName("contents.xml")
    @Expose
    private ContentsXml_ contentsXml;
    @SerializedName("quakeml.xml")
    @Expose
    private QuakemlXml_ quakemlXml;

    /**
     * @return The contentsXml
     */
    public ContentsXml_ getContentsXml() {
        return contentsXml;
    }

    /**
     * @param contentsXml The contents.xml
     */
    public void setContentsXml(ContentsXml_ contentsXml) {
        this.contentsXml = contentsXml;
    }

    /**
     * @return The quakemlXml
     */
    public QuakemlXml_ getQuakemlXml() {
        return quakemlXml;
    }

    /**
     * @param quakemlXml The quakeml.xml
     */
    public void setQuakemlXml(QuakemlXml_ quakemlXml) {
        this.quakemlXml = quakemlXml;
    }

}