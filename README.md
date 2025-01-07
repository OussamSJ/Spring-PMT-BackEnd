# Spring PMT BackEnd

![Java](https://img.shields.io/badge/Java-11-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.4-green)
![MySQL](https://shields.io/badge/MySQL-lightgrey?logo=mysql&style=plastic&logoColor=white&labelColor=blue)

Back-end du **Project Management Tool (PMT)** développé avec Spring Boot. Ce projet sert de base pour gérer les tâches, projets, utilisateurs et leurs interactions dans un contexte collaboratif.

## Table des matières
1. [Caractéristiques](#caractéristiques)
2. [Prérequis](#prérequis)
3. [Installation et Configuration](#installation-et-configuration)
4. [Endpoints API](#endpoints-api)
5. [Contribution](#contribution)
6. [Licence](#licence)

---

## Caractéristiques
- Gestion des utilisateurs (inscription, connexion, rôles)
- Création et gestion de projets
- Attribution et suivi des tâches
- Notifications et historique des modifications
- Implémenté avec Spring Boot et PostgreSQL

---

## Prérequis
Assurez-vous d'avoir installé :
- **Java 11** ou une version ultérieure
- **Maven** pour la gestion des dépendances
- **PostgreSQL** (ou MySQL si modifié dans l'application)
- Un IDE comme IntelliJ IDEA ou Eclipse

---

## Installation et Configuration

### 1. Cloner le dépôt
```bash
git clone https://github.com/OussamSJ/Spring-PMT-BackEnd.git
cd Spring-PMT-BackEnd

```
---

## 2. Configurer la base de données

spring.datasource.url=jdbc:postgresql://localhost:5432/pmt
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

## 3. Construire et exécuter le projet
Compilez le projet :
```bash
mvn clean install
```
Exécutez l'application :
```bash
mvn spring-boot:run
```
L'application sera disponible à http://localhost:8080.

---


## 4. Endpoints API
Voici un résumé des principaux endpoints disponibles :

### Utilisateurs
#### GET /users : Listes des utilisateurs
#### POST /user : Inscription d'un nouvel utilisateur

### Projets
#### GET /projets : Liste des projets
#### GET /projets/{id} : Trouver un projet par ID
#### POST /projet : Création d'un projet
#### DELETE /projet/{nom} : Suppression d'un projet par Nom

### Tâches
#### POST /projet/{id}/task : Création d'une tâche 
#### GET /task/{id} : Liste des tâches par ID
#### PUT /task/{id} : Mise à jour d'une tâche

### Notifications
#### GET /notifications : Liste des notifications

```
La Documentation Swagger sera disponible à http://localhost:8080/swagger-ui/index.html.
```

---
