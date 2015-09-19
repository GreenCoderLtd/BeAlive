package com.greencoder.bealive.model.detail;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Products {

    @SerializedName("general-link")
    @Expose
    private List<GeneralLink> generalLink = new ArrayList<GeneralLink>();
    @SerializedName("geoserve")
    @Expose
    private List<Geoserve> geoserve = new ArrayList<Geoserve>();
    @SerializedName("nearby-cities")
    @Expose
    private List<NearbyCity> nearbyCities = new ArrayList<NearbyCity>();
    @SerializedName("origin")
    @Expose
    private List<Origin> origin = new ArrayList<Origin>();
    @SerializedName("phase-data")
    @Expose
    private List<PhaseDatum> phaseData = new ArrayList<PhaseDatum>();
    @SerializedName("scitech-link")
    @Expose
    private List<ScitechLink> scitechLink = new ArrayList<ScitechLink>();

    /**
     *
     * @return
     * The generalLink
     */
    public List<GeneralLink> getGeneralLink() {
        return generalLink;
    }

    /**
     *
     * @param generalLink
     * The general-link
     */
    public void setGeneralLink(List<GeneralLink> generalLink) {
        this.generalLink = generalLink;
    }

    /**
     *
     * @return
     * The geoserve
     */
    public List<Geoserve> getGeoserve() {
        return geoserve;
    }

    /**
     *
     * @param geoserve
     * The geoserve
     */
    public void setGeoserve(List<Geoserve> geoserve) {
        this.geoserve = geoserve;
    }

    /**
     *
     * @return
     * The nearbyCities
     */
    public List<NearbyCity> getNearbyCities() {
        return nearbyCities;
    }

    /**
     *
     * @param nearbyCities
     * The nearby-cities
     */
    public void setNearbyCities(List<NearbyCity> nearbyCities) {
        this.nearbyCities = nearbyCities;
    }

    /**
     *
     * @return
     * The origin
     */
    public List<Origin> getOrigin() {
        return origin;
    }

    /**
     *
     * @param origin
     * The origin
     */
    public void setOrigin(List<Origin> origin) {
        this.origin = origin;
    }

    /**
     *
     * @return
     * The phaseData
     */
    public List<PhaseDatum> getPhaseData() {
        return phaseData;
    }

    /**
     *
     * @param phaseData
     * The phase-data
     */
    public void setPhaseData(List<PhaseDatum> phaseData) {
        this.phaseData = phaseData;
    }

    /**
     *
     * @return
     * The scitechLink
     */
    public List<ScitechLink> getScitechLink() {
        return scitechLink;
    }

    /**
     *
     * @param scitechLink
     * The scitech-link
     */
    public void setScitechLink(List<ScitechLink> scitechLink) {
        this.scitechLink = scitechLink;
    }

}