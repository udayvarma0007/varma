package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Controller {
	@GetMapping("/greet")
	public String greeting() {
	return "Hii";
	}

}
