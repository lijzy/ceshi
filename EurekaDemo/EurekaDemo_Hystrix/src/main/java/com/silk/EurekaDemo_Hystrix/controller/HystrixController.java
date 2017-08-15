package com.silk.EurekaDemo_Hystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.silk.EurekaDemo_Hystrix.service.Hystrix_Remote;

@RestController
public class HystrixController {
	@Autowired
	Hystrix_Remote hystrix_Remote;
	
	@RequestMapping("printSth/{name}")
	public String test(@PathVariable("name") String name) {
		return hystrix_Remote.pringSth(name);
	}
}

