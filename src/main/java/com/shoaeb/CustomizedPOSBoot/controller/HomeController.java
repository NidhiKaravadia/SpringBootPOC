package com.shoaeb.CustomizedPOSBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String getHomePage()
	{
		return "I am home Page";
	}
	
}
