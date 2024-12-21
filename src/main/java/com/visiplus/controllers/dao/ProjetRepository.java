package com.visiplus.controllers.dao;

import java.util.Optional;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.visiplus.models.Projet;

import jakarta.transaction.Transactional;

@Repository
public interface ProjetRepository extends CrudRepository<Projet,Integer>{
	


	    @Modifying
	    @Transactional
	    @Query("DELETE FROM Projet p WHERE p.name = :name")
	    void deleteByName(@Param("name") String name);

	    Optional<Projet> findByName(String name); // Optional for retrieving by name
	}



