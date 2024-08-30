package org.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Idate dateProvider = new FakeDate(LocalDateTime.now()); // Utilise la date actuelle
        Welcome welcome = new Welcome(dateProvider);
        System.out.println(welcome.getMessage());
    }
}
