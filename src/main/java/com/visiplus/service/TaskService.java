package com.visiplus.service;

import java.util.Set;

import com.visiplus.models.Task;

public interface TaskService {

	int create(int id_projet, Task task);

	Set<Task> findAllByProjet(String nom_projet);

	Task findById(int id_task);

	void delete(Task task);

	void updatePartial(Task taskExistant, Task newTask);
	
	

		
	
	


}
