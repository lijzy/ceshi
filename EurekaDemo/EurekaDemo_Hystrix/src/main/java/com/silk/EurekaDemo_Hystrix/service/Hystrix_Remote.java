package com.silk.EurekaDemo_Hystrix.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "EurekaDemo-client", fallback = Hystrix_RemoteImpl.class)
public interface Hystrix_Remote {
	@RequestMapping(value = "/printSth")
	public String pringSth(@RequestParam(value = "name") String name);
}


