package com.hicogroup.restfulwebservices;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller handling HTTP requests
@RestController
@CrossOrigin(origins="http://localhost:3000")
public class HelloWorldController {
	//Get
	//URI - /hello-world
	//method - "Hello World"
	@GetMapping(path = "/hello-world/{username}")
	public HelloWorldBean helloWorld(@PathVariable String username) {
		return new HelloWorldBean(String.format("%s", username));
	}
}
