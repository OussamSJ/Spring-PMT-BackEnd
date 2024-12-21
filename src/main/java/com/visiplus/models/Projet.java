package com.visiplus.models;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "projet")
public class Projet {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	 @Column(nullable = false, unique = true)
	private String name;
	private String description;
	private LocalDate debutDate;
	private LocalDate finDate;
	private LocalDate creationDate;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Task> tasks = new HashSet<Task>();
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDebutDate() {
		return debutDate;
	}
	public void setDebutDate(LocalDate debutDate) {
		this.debutDate = debutDate;
	}
	public LocalDate getFinDate() {
		return finDate;
	}
	public void setFinDate(LocalDate finDate) {
		this.finDate = finDate;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public Set<Task> getTasks() {
		return tasks;
	}
	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}
	
	
	
	
	
}
