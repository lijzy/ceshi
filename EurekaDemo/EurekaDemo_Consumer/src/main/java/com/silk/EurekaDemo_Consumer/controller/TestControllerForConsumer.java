package com.silk.EurekaDemo_Consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.silk.EurekaDemo_Consumer.service.EurekaDemo_Remote;

@RestController
public class TestControllerForConsumer {
	@Autowired
	EurekaDemo_Remote eurekaDemo_Remote;
	
	@RequestMapping("/printSth/{name}")
	public String printSomeWords(@PathVariable("name") String name) {
		return eurekaDemo_Remote.printSth(name);
	}
}
