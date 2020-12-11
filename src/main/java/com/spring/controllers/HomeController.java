package com.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String getHome() {
		System.out.println("Here");
		return "home";
	}
	
	@GetMapping("/")
	public String welcome() {
	    return "index";
	}
}
