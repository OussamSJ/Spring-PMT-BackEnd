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


@Service
public class ProjetServiceImpl implements ProjetService {
	
	
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

}
