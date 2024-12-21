package com.visiplus.testingweb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.visiplus.controllers.dao.ProjetRepository;
import com.visiplus.models.Projet;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Project Management Tool </br> </br> Project Management Tool (PMT) A collaborative project management platform using Angular for the frontend and Spring Boot for the backend. Features include project and task management, role-based permissions, notifications, and a dashboard. Deployed with Docker and automated via a CI/CD pipeline."
				+ "   </br> </br> Backend : Spring Boot API </br>\r\n"
				+ "Le backend repose sur une API Spring Boot, garantissant une performance et une évolutivité optimales pour gérer les données et la logique métier.\r\n"
				+ "\r\n"
				+ "Caractéristiques principales :\r\n"
				+ "API RESTful pour la gestion des utilisateurs, projets et tâches.\r\n"
				+ "Base de données relationnelle pour un stockage robuste et fiable des données MySQL.\r\n"
				+ "Prise en charge des rôles et permissions pour les membres des projets.\r\n"
				+ "Intégration avec Docker pour le déploiement simplifié.";
	}
	

	
	
	

}
