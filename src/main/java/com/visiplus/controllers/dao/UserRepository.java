package com.visiplus.controllers.dao;

import org.springframework.data.repository.CrudRepository;
import com.visiplus.models.User;

public interface UserRepository  extends CrudRepository<User,Integer>{

}
