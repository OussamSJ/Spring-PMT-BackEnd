package com.visiplus.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.visiplus.models.User;
import com.visiplus.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200") 
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/users")
	@ResponseStatus(code=HttpStatus.OK)
	public List<User> findAll(){
		
		return userService.findAll();
		
		}
	
	
	@PostMapping("/user")
	@ResponseStatus(code=HttpStatus.CREATED)
	public int create(@RequestBody User user) {
		
		return userService.create(user);
		
		
	}

}
