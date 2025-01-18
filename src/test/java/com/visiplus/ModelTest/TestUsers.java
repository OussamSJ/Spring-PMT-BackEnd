package com.visiplus.ModelTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.visiplus.models.User;

public class TestUsers {

    @Test
    public void testSettersAndGetters() {
        // Création d'une instance de User
        User user = new User();

        // Test de l'ID
        user.setId(1);
        assertEquals(1, user.getId());

        // Test de l'email
        String email = "test@example.com";
        user.setEmail(email);
        assertEquals(email, user.getEmail());

        // Test du mot de passe
        String password = "password123";
        user.setPassword(password);
        assertEquals(password, user.getPassword());

        // Test de la date d'enregistrement
        LocalDate date = LocalDate.of(2023, 1, 1);
        user.setDateEnregistrement(date);
        assertEquals(date, user.getDateEnregistrement());
    }
}
