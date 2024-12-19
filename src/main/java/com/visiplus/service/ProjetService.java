package com.visiplus.service;

import java.util.List;

import com.visiplus.models.Projet;

public interface ProjetService {

	public List<Projet> findAll();

	public int create(Projet projet);

	public Projet findById(int id);

	public void delete(int id);

}
