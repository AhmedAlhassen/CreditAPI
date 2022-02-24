package com.creditApi.creditapi.Entity;


import io.swagger.v3.oas.annotations.media.Schema;

public  class BaseRequest {
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private  String  applicationId;

    public BaseRequest(String applicationId) {
        this.applicationId = applicationId;
    }

    public BaseRequest() {
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }
}
