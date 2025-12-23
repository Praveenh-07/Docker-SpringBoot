package com.in28min.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	@GetMapping("/")
	public String helloWorld() {
		return "{\"message\":\"Welcome to Docker Praveen-maven plugin\"}";
	}

}
