package com.visiplus.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String email;
	private String Password;
	private LocalDate dateEnregistrement;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public LocalDate getDateEnregistrement() {
		return dateEnregistrement;
	}
	public void setDateEnregistrement(LocalDate dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}
	

}
