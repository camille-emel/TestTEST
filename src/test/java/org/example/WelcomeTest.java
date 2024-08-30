package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class WelcomeTest {
    @Test
    void testLundiMatin() {
        Welcome welcome = new Welcome(9, "lundi");
        String expected = "Bonjour Bon week-end ";
        assertEquals(expected, welcome.getMessage());
    }


    @ParameterizedTest
    @CsvSource({
            "9, lundi, Bonjour Bon week-end"+" ",         // Cas 1 : lundi à 9h
            "14, mardi, Bon après-midi"+" ",              // Cas 2 : mardi à 14h
            "19, mercredi, Bonsoir"+" ",                  // Cas 3 : mercredi à 19h
            "8, vendredi, Bon week-end"+" ",              // Cas 4 : vendredi à 8h
            "18, vendredi, Bon après-midi Bon week-end"+" ", // Cas 5 : vendredi à 18h
    })
    void testGetMessage(int time, String day, String expectedMessage) {
        Welcome welcome = new Welcome(time, day);
        String actualMessage = welcome.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

}