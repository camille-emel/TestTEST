package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WelcomeTest {

    @Test
    @DisplayName("Matin")
    void weekMorning() {
        Idate fakeDate = new FakeDate(LocalDateTime.of(2023, 8, 29, 10, 0)); // Mardi à 10h
        Welcome welcome = new Welcome(fakeDate);
        assertEquals("Bonjour", welcome.getMessage());
    }

    @Test
    @DisplayName("Après-midi")
    void weekAfternoon() {
        Idate fakeDate = new FakeDate(LocalDateTime.of(2023, 8, 29, 15, 0)); // Mardi à 15h
        Welcome welcome = new Welcome(fakeDate);
        assertEquals("Bon après-midi", welcome.getMessage());
    }

    @Test
    @DisplayName("Soir")
    void weekEvening() {
        Idate fakeDate = new FakeDate(LocalDateTime.of(2023, 8, 29, 20, 0)); // Mardi à 20h
        Welcome welcome = new Welcome(fakeDate);
        assertEquals("Bonsoir", welcome.getMessage());
    }

    @Test
    @DisplayName("Week-end")
    void weekend() {
        Idate fakeDate = new FakeDate(LocalDateTime.of(2023, 8, 26, 10, 0)); // Samedi à 10h
        Welcome welcome = new Welcome(fakeDate);
        assertEquals("Bon week-end", welcome.getMessage());
    }

    @Test
    @DisplayName("Fin de journée vendredi")
    void fridayEvening() {
        Idate fakeDate = new FakeDate(LocalDateTime.of(2023, 8, 25, 19, 0)); // Vendredi à 19h
        Welcome welcome = new Welcome(fakeDate);
        assertEquals("Bon week-end", welcome.getMessage());
    }

    @Test
    @DisplayName("Début de journée lundi")
    void mondayMorning() {
        Idate fakeDate = new FakeDate(LocalDateTime.of(2023, 8, 28, 8, 0)); // Lundi à 8h
        Welcome welcome = new Welcome(fakeDate);
        assertEquals("Bon week-end", welcome.getMessage());
    }
}
