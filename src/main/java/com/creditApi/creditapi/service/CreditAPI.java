package com.creditApi.creditapi.service;


import com.creditApi.creditapi.Entity.BaseRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
public class CreditAPI {
    private final Logger log = LoggerFactory.getLogger(CreditAPI.class);

    ClientHttpRequestFactory factory = new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory());

    RestTemplate restTemplate = new RestTemplate(factory);

     @Value("${baseurl}")
    private String uri ;
    // static
    // {

    //     System.setProperty("javax.net.ssl.keyStore",  "Corporate_Keystore.jks.old");
    //     System.setProperty("javax.net.ssl.keyStorePassword", "nexttech");
    //     javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
    //             new javax.net.ssl.HostnameVerifier(){

    //                 public boolean verify(String hostname,
    //                                       javax.net.ssl.SSLSession sslSession) {
    //                     return true;
    //                 }
    //             });
    // }

    public CreditAPI() {
        restTemplate.setInterceptors(Collections.singletonList(new RequestResponseLoggingInterceptor()));
    }

    public String getEbsRsponse(String webServiceName , BaseRequest reqObject){
        return restTemplate.postForObject(uri+"/"+webServiceName, reqObject,String.class);
    }
}
