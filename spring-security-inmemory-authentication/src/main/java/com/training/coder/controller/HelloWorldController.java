/**
 * 
 */
package com.training.coder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kaustavbasu
 *
 */
@RestController
public class HelloWorldController {

	@GetMapping("/")
	private String HelloWorld() {
		return "Hello World from In memory Authentication";
	}

	@GetMapping("/user")
	private String HelloWorldUser() {
		return "Hello World User from In memory Authentication";
	}

	@GetMapping("/admin")
	private String HelloWorldAdmin() {
		return "Hello World Admin from In memory Authentication";
	}

}
