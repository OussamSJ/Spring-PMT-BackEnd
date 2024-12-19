package com.visiplus.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.visiplus.controllers.dao.UserRepository;
import com.visiplus.models.User;
import com.visiplus.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> findAll() {
		
        List<User> users = new ArrayList<User>();
		
		userRepository.findAll().forEach(users::add);
		
		return users;
	}

	@Override
	public int create(User user) {

		return userRepository.save(user).getId();
	}

}
