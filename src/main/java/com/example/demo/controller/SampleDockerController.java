package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleDockerController {

	@RequestMapping(value = "/getDocker")
	public String getDocker() {
		System.out.println("Inside my docker controller");
		return "Hello sanghapal Welcome to docker";
	}
}
