package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
	
	// method for first rest service
		@GetMapping("/lookup")
		public String helloRestService() {

			return "My first REST Service-->BOA";
		}
}
