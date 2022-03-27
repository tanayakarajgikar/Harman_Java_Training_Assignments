package com.bookapp.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(path = "home")
	public String home() {
		return "home";
	}
	@GetMapping(path = "admin")
	public String adminHome() {
		return "admin";
	}
	@GetMapping(path = "mgr")
	public String mgrHome() {
		return "mgr";
	}
	@GetMapping(path = "emp")
	public String empHome() {
		return "emp";
	}
	
}
