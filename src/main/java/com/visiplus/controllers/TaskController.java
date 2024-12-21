package com.visiplus.controllers;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.visiplus.models.Task;
import com.visiplus.service.TaskService;

@RestController
public class TaskController {
	
	
	@Autowired
	private TaskService taskService;
	
	
	
	@GetMapping("/projet/{id_projet}/tasks")
	@ResponseStatus(code = HttpStatus.OK)
	public Set<Task> findAllByEntreprise(@PathVariable("id_projet") int id_projet){
		
		return taskService.findAllByProjet(id_projet);
		
	}
	
	@GetMapping("/task/{id_task}")
	@ResponseStatus(code = HttpStatus.OK)
	public Task findById(@PathVariable("id_task") int id_task){
		
		return taskService.findById(id_task);
		
	}
	
	
	
	@PostMapping("/projet/{id_projet}/task")
	@ResponseStatus(code = HttpStatus.CREATED)
    public int cree(@PathVariable("id_projet") int id_projet, @RequestBody Task task) {
		
		return taskService.create(id_projet,task);
		
	}
	
	
	@DeleteMapping("/task/{id_task}")
	@ResponseStatus(code=HttpStatus.OK)
	public void delete( @PathVariable("id_task") int id_task) {
		
		//Contrôler si l'entité existe	
		
		taskService.findById(id_task);  
		
		
		Task task = taskService.findById(id_task);
			
		taskService.delete(task);
	}
	

}
