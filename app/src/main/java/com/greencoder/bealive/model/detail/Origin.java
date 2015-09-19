
package com.greencoder.bealive.model.detail;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Origin {

    @SerializedName("indexid")
    @Expose
    private String indexid;
    @SerializedName("indexTime")
    @Expose
    private Long indexTime;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("updateTime")
    @Expose
    private Long updateTime;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("properties")
    @Expose
    private Properties____ properties;
    @SerializedName("preferredWeight")
    @Expose
    private Long preferredWeight;
    @SerializedName("contents")
    @Expose
    private Contents__ contents;

    /**
     *
     * @return
     * The indexid
     */
    public String getIndexid() {
        return indexid;
    }

    /**
     *
     * @param indexid
     * The indexid
     */
    public void setIndexid(String indexid) {
        this.indexid = indexid;
    }

    /**
     *
     * @return
     * The indexTime
     */
    public Long getIndexTime() {
        return indexTime;
    }

    /**
     *
     * @param indexTime
     * The indexTime
     */
    public void setIndexTime(Long indexTime) {
        this.indexTime = indexTime;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

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
     * The code
     */
    public String getCode() {
        return code;
    }

    /**
     *
     * @param code
     * The code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     *
     * @return
     * The source
     */
    public String getSource() {
        return source;
    }

    /**
     *
     * @param source
     * The source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     *
     * @return
     * The updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     *
     * @param updateTime
     * The updateTime
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     *
     * @return
     * The status
     */
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *
     * @return
     * The properties
     */
    public Properties____ getProperties() {
        return properties;
    }

    /**
     *
     * @param properties
     * The properties
     */
    public void setProperties(Properties____ properties) {
        this.properties = properties;
    }

    /**
     *
     * @return
     * The preferredWeight
     */
    public Long getPreferredWeight() {
        return preferredWeight;
    }

    /**
     *
     * @param preferredWeight
     * The preferredWeight
     */
    public void setPreferredWeight(Long preferredWeight) {
        this.preferredWeight = preferredWeight;
    }

    /**
     *
     * @return
     * The contents
     */
    public Contents__ getContents() {
        return contents;
    }

    /**
     *
     * @param contents
     * The contents
     */
    public void setContents(Contents__ contents) {
        this.contents = contents;
    }

}