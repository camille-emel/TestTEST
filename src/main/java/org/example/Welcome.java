package org.example;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Welcome {
    private final LocalDateTime date;

    public Welcome(Idate dateProvider) {
        this.date = dateProvider.getDate();
    }

    public String getMessage() {
        DayOfWeek day = this.date.getDayOfWeek();
        int hour = this.date.getHour();
        String message = "";

        // Vérifie les cas spécifiques du week-end
        if ((day == DayOfWeek.FRIDAY && hour >= 18) || (day == DayOfWeek.MONDAY && hour < 9)) {
            message = "Bon week-end";
        } else if (day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY) {
            if (hour >= 9 && hour < 13) {
                message = "Bonjour";
            } else if (hour >= 13 && hour < 18) {
                message = "Bon après-midi";
            } else if (hour >= 18 || hour < 9) {
                message = "Bonsoir";
            }
        } else {
            message = "Bon week-end";
        }

        return message;
    }
}
