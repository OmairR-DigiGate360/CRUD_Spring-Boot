package com.omair.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.omair.entity.User;
import com.omair.services.UserService;

@RestController
public class Controller {
	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	@GetMapping("/users")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable("id") Integer userId) {
		return userService.getUserById(userId);
	}
	@DeleteMapping("/users/{id}")
	public String deleteUserById(@PathVariable("id") Integer userId) {
		userService.deleteUserById(userId);
		return "User Deleted Successfully...";
	}
	@PutMapping("/users/{id}")
	public User updateUserById(@PathVariable("id") Integer userId, @RequestBody User user) {
		return userService.updateUserById(userId, user);
	}
	@GetMapping("/users/name/{name}")
	public List<User>getUserByName(@PathVariable("name") String name) {
		return userService.getUserByName(name);
	}
	@GetMapping("/users/email/{email}")
	public List<User>getAllUserByEmail(@PathVariable("email") String email) {
		return userService.getAllUserByEmail(email);
	}
	
	@PostMapping("/users/find")
	public List<User> findUserBySearch(@RequestBody User user) {
		return userService.findUserBySearch(user);
	}
}
