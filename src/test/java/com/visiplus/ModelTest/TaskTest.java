package com.visiplus.ModelTest;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;

import com.visiplus.models.Projet;
import com.visiplus.models.Task;




public class TaskTest {

    @Test
    public void testSettersAndGetters() {
        // Création d'une instance de Task
        Task task = new Task();

        // Test de l'ID
        task.setId(1);
        assertEquals(1, task.getId());

        // Test du titre
        String title = "Task Title";
        task.setTitle(title);
        assertEquals(title, task.getTitle());

        // Test de la description
        String description = "This is a task description";
        task.setDescription(description);
        assertEquals(description, task.getDescription());

        // Test de la priorité
        String priority = "High";
        task.setPriority(priority);
        assertEquals(priority, task.getPriority());

        // Test du statut
        String status = "In Progress";
        task.setStatus(status);
        assertEquals(status, task.getStatus());

        // Test des dates
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 1, 31);
        LocalDate creationDate = LocalDate.of(2022, 12, 15);

        task.setStartDate(startDate);
        task.setEndDate(endDate);
        task.setCreationDate(creationDate);

        assertEquals(startDate, task.getStartDate());
        assertEquals(endDate, task.getEndDate());
        assertEquals(creationDate, task.getCreationDate());
    }

    @Test
    public void testProjetRelationship() {
        // Création d'une instance de Task
        Task task = new Task();

        // Test initial sans projet
        assertNull(task.getProjet());

        // Création et association d'un projet
        Projet projet = new Projet();
        projet.setId(1);
        projet.setName("Projet Test");

        task.setProjet(projet);

        assertEquals(projet, task.getProjet());
        assertEquals("Projet Test", task.getProjet().getName());
    }
}
