package org.example;


import java.time.LocalDateTime;

public class Date implements Idate {

    @Override
    public LocalDateTime getDate() {
        return LocalDateTime.now();
    }
}