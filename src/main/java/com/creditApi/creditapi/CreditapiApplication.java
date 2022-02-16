package com.creditApi.creditapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CreditapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditapiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate(clientHttpRequestFactory());

	}

	private ClientHttpRequestFactory clientHttpRequestFactory() {
		HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
		factory.setReadTimeout(2000);
		factory.setConnectTimeout(2000);
		return factory;
	}
}
