package com.creditApi.creditapi.web;

import com.creditApi.creditapi.Entity.*;
import com.creditApi.creditapi.service.CreditAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CreditResource {
    private final Logger log = LoggerFactory.getLogger(CreditResource.class);

    private CreditAPI creditAPI;

    public CreditResource(CreditAPI creditAPI) {
        this.creditAPI = creditAPI;
    }
    @RequestMapping(value = "/transferCredit", method = RequestMethod.POST, produces="application/json")
    public ResponseEntity<String> TransferCredit(@RequestBody TransferCreditReq transferCreditReq){
        String json = creditAPI.getEbsRsponse("transferCredit",transferCreditReq);
         return ResponseEntity.ok().body(json) ;
    }
    @RequestMapping(value = "/isAlive", method = RequestMethod.POST, produces="application/json")
    public  ResponseEntity<String> EchoTest(@RequestBody Echo echo){
        String json = creditAPI.getEbsRsponse("isAlive",echo);
        return ResponseEntity.ok().body(json);
    }

    @RequestMapping(value = "/TransactionStatus", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<String > TransactionStatus (@RequestBody TransactionStatusReq transactionStatusReq){

        String json = creditAPI.getEbsRsponse("getTransactionStatus",transactionStatusReq);
        return  ResponseEntity.ok().body(json);

    }
    @RequestMapping(value = "/CustomerInfo",method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<String> CustomerInfo (@RequestBody CustomerInfoReq customerInfoReq){
        log.info("REST request to save Transactions : {}", customerInfoReq);
        String json = creditAPI.getEbsRsponse("getCustomerInfo",customerInfoReq);
        return ResponseEntity.ok().body(json);
    }
}
