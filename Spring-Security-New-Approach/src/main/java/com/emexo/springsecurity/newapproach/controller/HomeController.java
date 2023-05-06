package com.emexo.springsecurity.newapproach.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	@GetMapping("/normal")
	public ResponseEntity<String> normalUser() {
		return ResponseEntity.ok("Hello !! Normal User...");
	}

	@GetMapping("/admin")
	public ResponseEntity<String> adminlUser() {
		return ResponseEntity.ok("Hello !! Admin User...");
	}

	@GetMapping("/public")
	public ResponseEntity<String> PublicUser() {
		return ResponseEntity.ok("Hello !! Public User...");
	}

}
