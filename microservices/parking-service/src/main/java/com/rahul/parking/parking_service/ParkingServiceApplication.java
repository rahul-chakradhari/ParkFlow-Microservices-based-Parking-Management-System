package com.rahul.parking.parking_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ParkingServiceApplication {

	@LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
		//implementing timeout functionality
		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
		clientHttpRequestFactory.setConnectTimeout(5000);
		return new RestTemplate(clientHttpRequestFactory);
	}


	public static void main(String[] args) {
		SpringApplication.run(ParkingServiceApplication.class, args);
	}

}
