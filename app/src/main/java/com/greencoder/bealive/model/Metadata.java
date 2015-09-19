package com.greencoder.bealive.model;

import java.util.HashMap;
import java.util.Map;

public class Metadata {

    private Long generated;
    private String url;
    private String title;
    private Long status;
    private String api;
    private Long count;

    /**
     *
     * @return
     * The generated
     */
    public Long getGenerated() {
        return generated;
    }

    /**
     *
     * @param generated
     * The generated
     */
    public void setGenerated(Long generated) {
        this.generated = generated;
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
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The status
     */
    public Long getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The api
     */
    public String getApi() {
        return api;
    }

    /**
     *
     * @param api
     * The api
     */
    public void setApi(String api) {
        this.api = api;
    }

    /**
     *
     * @return
     * The count
     */
    public Long getCount() {
        return count;
    }

    /**
     *
     * @param count
     * The count
     */
    public void setCount(Long count) {
        this.count = count;
    }



}