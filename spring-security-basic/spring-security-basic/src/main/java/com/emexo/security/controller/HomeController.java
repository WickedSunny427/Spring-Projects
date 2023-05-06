package com.emexo.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/security")
@RestController
public class HomeController {

	// Accessible by All
	@GetMapping("/home")
	public String getHomePage() {
		return ("<h2>Home Page Welcome !!!</h2>");
	}

	// Accessible by User Only
	@GetMapping("/user")
	public String getUserPage() {
		return ("<h2>User Page Welcome !!!</h2>");
	}

	// Accessible by Admin Only
	@GetMapping("/admin")
	public String getAdminPage() {
		return ("<h2>Admin Page Welcome !!!</h2>");
	}
}
