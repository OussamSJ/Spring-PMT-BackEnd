package com.visiplus.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.visiplus.models.Projet;
import com.visiplus.service.ProjetService;

@RestController
@CrossOrigin(origins = "http://localhost:4200") 
public class ProjetController {
	
	
	@Autowired
	private ProjetService projetService;
	
	
	
	@GetMapping("/projets")
	@ResponseStatus(code=HttpStatus.OK)
	public List<Projet> findAll(){
		
		return projetService.findAll();
		
		}
	
	
	@GetMapping("/projet/{id}")
	@ResponseStatus(code=HttpStatus.OK)
	public Projet findById(@PathVariable("id")   int id){
		
		return projetService.findById(id);
		
	}
	
	
	
	
	@PostMapping("/projet")
	@ResponseStatus(code=HttpStatus.CREATED)
	public int create(@RequestBody Projet projet) {
		
		return projetService.create(projet);
		
		
	}
	
	
	@DeleteMapping("/projet/{id}")
	@ResponseStatus(code=HttpStatus.OK)
	public void delete(@PathVariable int id) {
		
		//Contrôler si l'entité existe	
		projetService.findById(id);  
			
		projetService.delete(id);
	}

}
