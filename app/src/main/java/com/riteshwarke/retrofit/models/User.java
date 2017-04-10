package com.riteshwarke.retrofit.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ritesh Warke on 08/04/17.
 */

public class User {
    @SerializedName("mobile_no")
    private String no;

    @SerializedName("name")
    private String name;

    @SerializedName("email")
    private String email;

    @SerializedName("user_role")
    private String role;

    @SerializedName("gcm_id")
    private String gcmId;

    @SerializedName("long")
    private String lng;

    @SerializedName("lat")
    private String lat;

    @SerializedName("locality")
    private String locality;

    @SerializedName("platform")
    private String platform;

    @SerializedName("demo_id")
    private String demoId;

    @SerializedName("device_id")
    private String deviceId;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGcmId() {
        return gcmId;
    }

    public void setGcmId(String gcmId) {
        this.gcmId = gcmId;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getDemoId() {
        return demoId;
    }

    public void setDemoId(String demoId) {
        this.demoId = demoId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
