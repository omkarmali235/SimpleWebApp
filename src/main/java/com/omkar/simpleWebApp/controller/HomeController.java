package com.omkar.simpleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller  // it will return page
@RestController // it will return data
public class HomeController {
	
	@RequestMapping("/")
//	@ResponseBody //it will return data 
	public String greet() {
		return "Welcome to WebPage!!";
	}
	
	
	@RequestMapping("/about")
	public String about() {
		return "This is all About";
	}
}
