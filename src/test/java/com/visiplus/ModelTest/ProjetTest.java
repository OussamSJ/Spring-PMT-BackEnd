package com.visiplus.ModelTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

import com.visiplus.models.Projet;
import com.visiplus.models.Task;


public class ProjetTest {

    @Test
    public void testSettersAndGetters() {
        // Création d'une instance de Projet
        Projet projet = new Projet();

        // Test de l'ID
        projet.setId(1);
        assertEquals(1, projet.getId());

        // Test du nom
        String name = "Projet Test";
        projet.setName(name);
        assertEquals(name, projet.getName());

        // Test de la description
        String description = "Ceci est un projet de test";
        projet.setDescription(description);
        assertEquals(description, projet.getDescription());

        // Test des dates
        LocalDate debutDate = LocalDate.of(2023, 1, 1);
        LocalDate finDate = LocalDate.of(2023, 12, 31);
        LocalDate creationDate = LocalDate.of(2023, 1, 15);

        projet.setDebutDate(debutDate);
        projet.setFinDate(finDate);
        projet.setCreationDate(creationDate);

        assertEquals(debutDate, projet.getDebutDate());
        assertEquals(finDate, projet.getFinDate());
        assertEquals(creationDate, projet.getCreationDate());
    }

    @Test
    public void testTasksManagement() {
        // Création d'une instance de Projet
        Projet projet = new Projet();

        // Création d'un ensemble de tâches
        Task task1 = new Task();
        task1.setId(1);
        task1.setTitle("Tâche 1");

        Task task2 = new Task();
        task2.setId(2);
        task2.setTitle("Tâche 2");

        Set<Task> tasks = new HashSet<>();
        tasks.add(task1);
        tasks.add(task2);

        // Test de l'ajout de tâches
        projet.setTasks(tasks);
        assertEquals(2, projet.getTasks().size());
        assertTrue(projet.getTasks().contains(task1));
        assertTrue(projet.getTasks().contains(task2));

        // Test de la modification de la collection de tâches
        Task task3 = new Task();
        task3.setId(3);
        task3.setTitle("Tâche 3");

        projet.getTasks().add(task3);
        assertEquals(3, projet.getTasks().size());
        assertTrue(projet.getTasks().contains(task3));
    }
}
