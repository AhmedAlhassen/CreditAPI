package com.creditApi.creditapi.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class CustomerInfoReq extends BaseRequest{


    /**
     * "UUID":"1553c47f-c6ce-460b-a64e-f122c20ff16d",
     * "tranDateTime": "230222031902",
     * "PAN": "9888061010278131317"
     */
    @JsonProperty("UUID")
    private String UUID;
    private String tranDateTime;
    @JsonProperty("PAN")
    private String PAN;

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getTranDateTime() {
        return tranDateTime;
    }

    public void setTranDateTime(String tranDateTime) {
        this.tranDateTime = tranDateTime;
    }

    public String getPAN() {
        return PAN;
    }

    public void setPAN(String PAN) {
        this.PAN = PAN;
    }
}
