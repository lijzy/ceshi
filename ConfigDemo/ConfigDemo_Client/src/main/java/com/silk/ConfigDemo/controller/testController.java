package com.silk.ConfigDemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	@Value("${info}")
	private String infoFromGit;
	
	@RequestMapping("/test")
	public String home() {
		return infoFromGit;
	}
}
