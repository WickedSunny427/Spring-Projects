package com.emexo.security.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emexo.security.models.User;
import com.emexo.security.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;

	// Get all Users
	@GetMapping("/")
	public List<User> getAllUsers() {
		return this.userService.getAllUsers();
	}

	// Get Single user by name
	@GetMapping("/{username}")
	public User UserByName(@PathVariable("username") String username) {
		return this.userService.getUserByName(username);
	}

	// Add User
	@PostMapping("/")
	public User addUser(@RequestBody User user) {
		return this.userService.addUser(user);
	}
}
