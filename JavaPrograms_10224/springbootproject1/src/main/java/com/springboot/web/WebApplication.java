package com.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebApplication {
	//@GetMapping		//Select the records
	//@PostMapping	//Insert the record
	//@PutMapping		//Update the record
	//@DeleteMapping 	//Delete the record
	
	@GetMapping("/hello")
	public String Hello() {
		return "Hello World";
	}
}
