package com.instagram.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstagramPostController {

	@GetMapping("/getpost")
	public String getpost(@RequestParam String username)
	{
		return "The post of " + username;
	}
	
}
