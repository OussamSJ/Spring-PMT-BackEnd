package com.visiplus;



import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.visiplus.controllers.dao.ProjetRepository;
import com.visiplus.models.Projet;
import com.visiplus.service.impl.ProjetServiceImpl;

public class ProjetServiceTest {

    @Mock
    private ProjetRepository projetRepository;

    @InjectMocks
    private ProjetServiceImpl projetService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testFindAll() {
        // Mock data
        List<Projet> projets = new ArrayList<>();
        Projet projet1 = new Projet();
        projet1.setId(1);
        projet1.setName("Project 1");
        projets.add(projet1);

        Projet projet2 = new Projet();
        projet2.setId(2);
        projet2.setName("Project 2");
        projets.add(projet2);

        when(projetRepository.findAll()).thenReturn(projets);

        // Test method
        List<Projet> result = projetService.findAll();

        // Assertions
        assertNotNull(result);
        assertEquals(2, result.size());
        verify(projetRepository, times(1)).findAll();
    }

    @Test
    public void testCreate() {
        // Mock data
        Projet projet = new Projet();
        projet.setName("New Project");
        projet.setDescription("Description of new project");
        projet.setCreationDate(LocalDate.now());

        when(projetRepository.save(projet)).thenReturn(projet);

        // Test method
        int result = projetService.create(projet);

        // Assertions
        assertEquals(projet.getId(), result);
        verify(projetRepository, times(1)).save(projet);
    }

    @Test
    public void testFindById() {
        // Mock data
        Projet projet = new Projet();
        projet.setId(1);
        projet.setName("Project 1");

        when(projetRepository.findById(1)).thenReturn(Optional.of(projet));

        // Test method
        Projet result = projetService.findById(1);

        // Assertions
        assertNotNull(result);
        assertEquals(1, result.getId());
        assertEquals("Project 1", result.getName());
        verify(projetRepository, times(1)).findById(1);
    }

    @Test
    public void testDelete() {
        // Mock data
        Projet projet = new Projet();
        projet.setId(1);
        projet.setName("Project 1");

        when(projetRepository.findById(1)).thenReturn(Optional.of(projet));
        doNothing().when(projetRepository).deleteById(1);

        // Test method
        projetService.delete(1);

        // Verify
        verify(projetRepository, times(1)).findById(1);
        verify(projetRepository, times(1)).deleteById(1);
    }
}

    
