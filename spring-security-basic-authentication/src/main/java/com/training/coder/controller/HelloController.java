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
public class HelloController {
	
	@GetMapping("/hello")
	public String helloWorld()
	{
		return "HelloWorld from Spring Basic Security Configuration";
	}

}
