package com.creditApi.creditapi.Entity;

public class TransactionStatusReq  extends BaseRequest{

    private  String originalTransactionId;
    private String sourceTransactionId;

    public TransactionStatusReq(String applicationId, String originalTransactionId, String sourceTransactionId) {
        super(applicationId);
        this.originalTransactionId = originalTransactionId;
        this.sourceTransactionId = sourceTransactionId;
    }

    public TransactionStatusReq(String applicationId) {
        super(applicationId);
    }

    public TransactionStatusReq() {
    }

    public String getOriginalTransactionId() {
        return originalTransactionId;
    }

    public void setOriginalTransactionId(String originalTransactionId) {
        this.originalTransactionId = originalTransactionId;
    }

    public String getSourceTransactionId() {
        return sourceTransactionId;
    }

    public void setSourceTransactionId(String sourceTransactionId) {
        this.sourceTransactionId = sourceTransactionId;
    }
}
