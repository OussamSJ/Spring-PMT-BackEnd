package com.visiplus.service.impl;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visiplus.exceptions.EntityDontExistException;

import com.visiplus.controllers.dao.TaskRepository;
import com.visiplus.models.Projet;
import com.visiplus.models.Task;
import com.visiplus.service.ProjetService;
import com.visiplus.service.TaskService;


@Service
public class TaskServiceImpl implements TaskService{
	
	@Autowired
	private ProjetService projetService;
	
	@Autowired
	private TaskRepository taskRepository;

	@Override
	public int create(int id_projet, Task task) {
	
		
			//Récupération de l'entreprise
			Projet projet = projetService.findById(id_projet);
			
			
			
			//Ajouter l'entreprise au jeu
			task.setProjet(projet);
			
			
			
			//Mise à jour de la liste des jeux de l'entreprise
			
			projet.getTasks().add(task);
			
			
			//Sauvegarde du jeu en base
			return taskRepository.save(task).getId();
			
		
	}

	@Override
	public Set<Task> findAllByProjet(int id_projet) {
	
		return projetService.findById(id_projet).getTasks();
	}

	@Override
	public Task findById(int id_task) {
		
        Optional<Task> task = taskRepository.findById(id_task);
		
		//Si je trouve le jeu
		if(task.isPresent()) {
			return task.get();
		}
		
		throw new EntityDontExistException();
	}

	@Override
	public void delete(Task task) {

		task.getProjet().getTasks().remove(task);
		taskRepository.delete(task);
		
	}

}
