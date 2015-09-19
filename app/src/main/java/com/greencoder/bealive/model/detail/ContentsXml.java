package com.greencoder.bealive.model.detail;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ContentsXml {

    @SerializedName("contentType")
    @Expose
    private String contentType;
    @SerializedName("lastModified")
    @Expose
    private Long lastModified;
    @SerializedName("length")
    @Expose
    private Long length;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * @return The contentType
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * @param contentType The contentType
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * @return The lastModified
     */
    public Long getLastModified() {
        return lastModified;
    }

    /**
     * @param lastModified The lastModified
     */
    public void setLastModified(Long lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * @return The length
     */
    public Long getLength() {
        return length;
    }

    /**
     * @param length The length
     */
    public void setLength(Long length) {
        this.length = length;
    }

    /**
     * @return The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

}