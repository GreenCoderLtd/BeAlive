package com.greencoder.bealive.model;

//json to pojo converted from http://www.jsonschema2pojo.org/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class EarthQuackSummary {

    private String type;
    private Metadata metadata;
    private List<Feature> features = new ArrayList<Feature>();
    private List<Double> bbox = new ArrayList<Double>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     *
     * @param metadata
     * The metadata
     */
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     *
     * @return
     * The features
     */
    public List<Feature> getFeatures() {
        return features;
    }

    /**
     *
     * @param features
     * The features
     */
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    /**
     *
     * @return
     * The bbox
     */
    public List<Double> getBbox() {
        return bbox;
    }

    /**
     *
     * @param bbox
     * The bbox
     */
    public void setBbox(List<Double> bbox) {
        this.bbox = bbox;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}