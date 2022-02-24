package com.creditApi.creditapi.Entity;


public class TransferCreditReq extends BaseRequest {
    private String sourceId;
    private int sourceTransactionId;
    private String sourceTransactionDateTime;
    private String destinationType;
    private String destinationId;
    private String tranCurrency;
    private Double tranAmount;

    public TransferCreditReq(String applicationId, String sourceId, int sourceTransactionId,
                             String sourceTransactionDateTime, String destinationType, String destinationId,
                             String tranCurrency, Double tranAmount) {
        super(applicationId);
        this.sourceId = sourceId;
        this.sourceTransactionId = sourceTransactionId;
        this.sourceTransactionDateTime = sourceTransactionDateTime;
        this.destinationType = destinationType;
        this.destinationId = destinationId;
        this.tranCurrency = tranCurrency;
        this.tranAmount = tranAmount;
    }

    public TransferCreditReq() {
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public int getSourceTransactionId() {
        return sourceTransactionId;
    }

    public void setSourceTransactionId(int sourceTransactionId) {
        this.sourceTransactionId = sourceTransactionId;
    }

    public String getSourceTransactionDateTime() {
        return sourceTransactionDateTime;
    }

    public void setSourceTransactionDateTime(String sourceTransactionDateTime) {
        this.sourceTransactionDateTime = sourceTransactionDateTime;
    }

    public String getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public String getTranCurrency() {
        return tranCurrency;
    }

    public void setTranCurrency(String tranCurrency) {
        this.tranCurrency = tranCurrency;
    }

    public Double getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(Double tranAmount) {
        this.tranAmount = tranAmount;
    }

    /**
     * "sourceId": "4501938000000684",
     *     "sourceTransactionId": 12566,
     *     "sourceTransactionDateTime": "230222032036",
     *     "destinationType": "CARD",
     *
     *     "destinationId": "7222451030032359428",
     *     "tranCurrency": "SDG",
     *     "tranAmount": 100.00
     **/
}
