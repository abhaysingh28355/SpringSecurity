package com.SpringSecurity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringSecurity.Model.User;
import com.SpringSecurity.Services.userservices;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	public userservices userservices;

	//Get All User
	@GetMapping("/")
	public List<User> getAllUser(){
		return this.userservices.getAllUsers();
	}
	
	//return single user
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userservices.getuser(username);
	}
	@PostMapping("/")
	public User add(@RequestBody User user) {
		return this.userservices.addUser(user);
	}
}
