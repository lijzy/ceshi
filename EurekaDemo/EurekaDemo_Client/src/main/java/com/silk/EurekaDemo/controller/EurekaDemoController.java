package com.silk.EurekaDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaDemoController {
	
	@RequestMapping("/printSth")
	public String printInfo(@RequestParam String name) {
		return "Hello," + name + ",i'm silk.";
	}
}

