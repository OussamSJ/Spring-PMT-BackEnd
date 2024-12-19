package com.visiplus.service;

import java.util.List;

import com.visiplus.models.User;

public interface UserService  {

	public List<User> findAll();

	public int create(User user);



}
