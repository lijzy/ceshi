package com.silk.EurekaDemo_Hystrix.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class Hystrix_RemoteImpl implements Hystrix_Remote {
	@Override
	public String pringSth(@RequestParam(value = "name") String name) {
		return "hello, " + name + ",this is fallback message.";
	}
}

