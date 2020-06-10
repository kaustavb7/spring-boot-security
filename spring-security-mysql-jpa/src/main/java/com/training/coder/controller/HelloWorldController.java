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
		return "Hello World from JPA MYSQL Authentication";
	}

	@GetMapping("/user")
	private String HelloWorldUser() {
		return "Hello World User from JPA MYSQL Authentication";
	}

	@GetMapping("/admin")
	private String HelloWorldAdmin() {
		return "Hello World Admin from JPA MYSQL Authentication";
	}

}
