# Spring PMT BackEnd

![Java](https://img.shields.io/badge/Java-11-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5.4-green)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-12-blue)

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

Utilisateurs
GET /users : Listes des utilisateurs
POST /user : Inscription d'un nouvel utilisateur

Projets
POST /api/projects : Création d'un projet
GET /api/projects : Liste des projets
PUT /api/projects/{id} : Mise à jour d'un projet
Tâches
POST /api/tasks : Création d'une tâche
GET /api/tasks : Liste des tâches
PUT /api/tasks/{id} : Mise à jour d'une tâche
Notifications
GET /api/notifications : Liste des notifications
