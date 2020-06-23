package com.motif.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class HelloSpringBoot {

	@RequestMapping("/hello")
	public String sayHello() {
		return "hello SpringBoot";
	}
}
