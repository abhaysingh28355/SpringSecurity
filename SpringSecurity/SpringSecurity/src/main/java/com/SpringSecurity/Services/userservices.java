package com.SpringSecurity.Services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.SpringSecurity.Model.User;

@Service
public class userservices {

	List<User> list = new ArrayList<>();
	
	public userservices() {
		list.add(new User(12,"abhaysingh","abcd","abhaysingh@gmail.com"));
		list.add(new User(13,"raftaarsingh","ghijk","jhunasingh@gmail.com"));
	}
	
	//Get All Users
	public List<User> getAllUsers(){
		return this.list;
	}
	//Get single user
	public User getuser(String usernae) {
		return this.list.stream().filter((user)->user.getUsername().equals(usernae)).findAny().orElse(null);
	}
	//add new User
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
}
