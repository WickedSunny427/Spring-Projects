package com.emexo.security.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.emexo.security.models.User;

@Service
public class UserService {
	List<User> list = new ArrayList<>();

	//Initialize Some Users
	public UserService() {
		 list.add(new User("ram", "ram", "ram@gmail.com"));
		 list.add(new User("laxman", "laxman", "laxman@gmail.com"));
	}
	
	//Get All users
	public List<User> getAllUsers() {
		return this.list;
	}
	
	//Get User by name
	public User getUserByName(String username) {
		return this.list.stream().filter(user->user.getUsername().equals(username)).findAny().orElse(null);//Java 8 get gives Optional of User.
	}
	
	//Add User
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
}
