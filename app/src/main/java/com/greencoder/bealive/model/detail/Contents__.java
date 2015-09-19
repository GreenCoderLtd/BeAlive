package com.greencoder.bealive.model.detail;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Contents__ {

    @SerializedName("contents.xml")
    @Expose
    private ContentsXml contentsXml;
    @SerializedName("quakeml.xml")
    @Expose
    private QuakemlXml quakemlXml;

    /**
     * @return The contentsXml
     */
    public ContentsXml getContentsXml() {
        return contentsXml;
    }

    /**
     * @param contentsXml The contents.xml
     */
    public void setContentsXml(ContentsXml contentsXml) {
        this.contentsXml = contentsXml;
    }

    /**
     * @return The quakemlXml
     */
    public QuakemlXml getQuakemlXml() {
        return quakemlXml;
    }

    /**
     * @param quakemlXml The quakeml.xml
     */
    public void setQuakemlXml(QuakemlXml quakemlXml) {
        this.quakemlXml = quakemlXml;
    }

}