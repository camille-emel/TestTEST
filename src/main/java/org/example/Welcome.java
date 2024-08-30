package org.example;

public class Welcome {
    //l'heure
    public int time;
    //Quel jour
    public String day;

    public Welcome(int time, String day) {
        this.time = time;
        this.day = day;
    }

    public String getMessage() {
        String message = "";
        if ((time >= 9 && time <= 13) && (day.equals("lundi") || day.equals("mardi") || day.equals("mercredi") || day.equals("jeudi") || day.equals("vendredi"))) {
            message += "Bonjour ";
        }
        if ((time >= 13 && time <= 18) && (day.equals("lundi") || day.equals("mardi") || day.equals("mercredi") || day.equals("jeudi") || day.equals("vendredi"))) {
            message += "Bon après-midi ";
        }
        if (time >= 18 && (day.equals("lundi") || day.equals("mardi") || day.equals("mercredi") || day.equals("jeudi"))) {
            message += "Bonsoir ";
        }
        if ((time >= 18 || time <= 9) && ((day.equals("lundi") || day.equals("vendredi")))) {
            message += "Bon week-end ";
        }
        return message;
    }
}