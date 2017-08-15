package com.silk.EurekaDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class EurekaDemoApplication {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping("/test")
	public String printService() {
		String services = "Services: " + discoveryClient.getServices();
		System.out.println(services);
		return services;
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaDemoApplication.class, args);
	}
}
