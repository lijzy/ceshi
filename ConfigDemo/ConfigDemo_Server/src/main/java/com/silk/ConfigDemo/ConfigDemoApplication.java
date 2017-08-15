package com.silk.ConfigDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigDemoApplication.class, args);
	}
}
