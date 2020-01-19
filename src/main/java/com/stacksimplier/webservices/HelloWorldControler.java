package com.stacksimplier.webservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldControler {

	
	//@RequestMapping(method = RequestMethod.GET, path = "/helloworld")
	@GetMapping("/holloworld")
	public String helloWord() {
		return "Hello World";
	}
	
	@GetMapping("/userbean")
	public UserDetails getUserDetails() {
		return new UserDetails("Hsiaol", "Davis", "new York");
	}
}
