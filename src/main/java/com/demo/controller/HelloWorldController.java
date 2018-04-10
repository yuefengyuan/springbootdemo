package com.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alex
 */

@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}

}