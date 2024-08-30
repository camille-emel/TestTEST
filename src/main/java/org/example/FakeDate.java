package org.example;

import java.time.LocalDateTime;

public class FakeDate implements Idate {
    private final LocalDateTime dateToReturn;

    public FakeDate(LocalDateTime dateToReturn) {
        this.dateToReturn = dateToReturn;
    }

    @Override
    public LocalDateTime getDate() {
        return dateToReturn;
    }
}
