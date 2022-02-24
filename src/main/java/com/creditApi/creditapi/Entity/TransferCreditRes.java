package com.creditApi.creditapi.Entity;

public class TransferCreditRes extends  BaseResponse {
    private  String tranCurrency;
    private String RRN;
    private int  transactionId;
    private int tranFee;
    private String tranDateTime;
    private String sourceId;
    private String destinationType;
    private  int sourceTransactionId;
    private  String destinationId;
    private Double tranAmount;
    private  String sourceTransactionDateTime;

    public TransferCreditRes() {
    }

    public TransferCreditRes(String tranCurrency, String RRN, int transactionId,
                             int tranFee, String tranDateTime, String sourceId, String destinationType,
                             int sourceTransactionId,
                             String destinationId, Double tranAmount, String sourceTransactionDateTime) {
        this.tranCurrency = tranCurrency;
        this.RRN = RRN;
        this.transactionId = transactionId;
        this.tranFee = tranFee;
        this.tranDateTime = tranDateTime;
        this.sourceId = sourceId;
        this.destinationType = destinationType;
        this.sourceTransactionId = sourceTransactionId;
        this.destinationId = destinationId;
        this.tranAmount = tranAmount;
        this.sourceTransactionDateTime = sourceTransactionDateTime;
    }

    public String getTranCurrency() {
        return tranCurrency;
    }

    public void setTranCurrency(String tranCurrency) {
        this.tranCurrency = tranCurrency;
    }

    public String getRRN() {
        return RRN;
    }

    public void setRRN(String RRN) {
        this.RRN = RRN;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getTranFee() {
        return tranFee;
    }

    public void setTranFee(int tranFee) {
        this.tranFee = tranFee;
    }

    public String getTranDateTime() {
        return tranDateTime;
    }

    public void setTranDateTime(String tranDateTime) {
        this.tranDateTime = tranDateTime;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    public int getSourceTransactionId() {
        return sourceTransactionId;
    }

    public void setSourceTransactionId(int sourceTransactionId) {
        this.sourceTransactionId = sourceTransactionId;
    }

    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public Double getTranAmount() {
        return tranAmount;
    }

    public void setTranAmount(Double tranAmount) {
        this.tranAmount = tranAmount;
    }

    public String getSourceTransactionDateTime() {
        return sourceTransactionDateTime;
    }

    public void setSourceTransactionDateTime(String sourceTransactionDateTime) {
        this.sourceTransactionDateTime = sourceTransactionDateTime;
    }
}

/**{
 "tranCurrency": "SDG",
 "RRN": "14196790",
 "responseCode": 0,-
 "transactionId": 14155864,
 "tranFee": 0,
 "applicationId": "EDB",-
 "tranDateTime": "230222032726",
 "sourceId": "4501938000000684",
 "responseMessage": "Approved",-
 "destinationType": "CARD",
 "sourceTransactionId": 12566,
 "tranAmount": 100,
 "responseStatus": "Successful",-
 "destinationId": "722245*****9428",
 "sourceTransactionDateTime": "230222032036"
 }**/