package com.silk.EurekaDemo_Consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "EurekaDemo-client")
public interface EurekaDemo_Remote {
	
	@RequestMapping(value = "/printSth")
	public String printSth(@RequestParam(value = "name")String name);
	
}
