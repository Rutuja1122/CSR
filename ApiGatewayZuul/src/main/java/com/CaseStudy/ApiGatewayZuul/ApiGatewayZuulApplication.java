package com.CaseStudy.ApiGatewayZuul;

import org.springframework.boot.SpringApplication;

import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ApiGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayZuulApplication.class, args);
	}

}
