package com.creditApi.creditapi.Entity;

public  class  BaseResponse {
    private  String applicationId;
    private int responseCode;
    private  String responseMessage;
    private String responseStatus;

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public BaseResponse(String applicationId, int responseCode, String responseMessage, String responseStatus) {
        this.applicationId = applicationId;
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.responseStatus = responseStatus;
    }

    public BaseResponse() {
    }
}
