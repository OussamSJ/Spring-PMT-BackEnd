package com.visiplus.controllers.dao;

import org.springframework.data.repository.CrudRepository;

import com.visiplus.models.Task;

public interface TaskRepository  extends CrudRepository<Task,Integer> {

}
