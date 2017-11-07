package com.github.blog.sundarsy.springdatarestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class SpringdatarestdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatarestdemoApplication.class, args);
	}
}
