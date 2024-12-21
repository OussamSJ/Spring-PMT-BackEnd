package com.visiplus.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visiplus.controllers.dao.ProjetRepository;
import com.visiplus.exceptions.EntityDontExistException;
import com.visiplus.models.Projet;
import com.visiplus.service.ProjetService;

import jakarta.persistence.EntityNotFoundException;


@Service
public  class ProjetServiceImpl implements ProjetService {
	
	
	@Autowired
	ProjetRepository projetRepository;

	@Override
	public List<Projet> findAll() {
		
		 List<Projet> projets = new ArrayList<Projet>();
			
		projetRepository.findAll().forEach(projets::add);
		
		return projets;
	}

	@Override
	public int create(Projet projet) {
		
		return projetRepository.save(projet).getId();
	}

	@Override
	public Projet findById(int id) {
		Optional<Projet> projet = projetRepository.findById(id);
		
		if (projet.isPresent()) {
		    return projet.get();
		    
	    }
		throw new EntityDontExistException();
	}

	@Override
	public void delete(int id) {
		projetRepository.deleteById(id);
		
	}

	@Override
	public Projet findByName(String name) {
		   return projetRepository.findByName(name)
	                .orElseThrow(() -> new EntityNotFoundException("Project not found with name: " + name));
		
	}

	@Override
	public void deleteByName(String name) {
		  Projet project = findByName(name); // Ensure the project exists
	        projetRepository.delete(project);
		
	}



}
