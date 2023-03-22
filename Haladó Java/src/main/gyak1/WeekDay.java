package main.gyak1;

import java.util.*;

public enum WeekDay {

    MON("Monday", "Hétfő", "Lunes"),
    TUE("Tuesday", "Kedd", "Martes"),
    WED("Wednesday", "Szerda", "Miercoles"),
    THU("Thursday", "Csütörtök", "Jueves"),
    FRI("Friday", "Péntek", "Viernes"),
    SAT("Saturday", "Szombat", "Sábado"),
    SUN("Sunday", "Vasárnap", "Domingo");

    private static final WeekDay[] weekdays = values();

    private static final List<String> supportedLanguages = Arrays.asList("English", "Magyar", "Español");

    private final List<String> inADifferentLanguageList;

    private final Map<String, String> inADifferentLanguage;

    WeekDay(String... weekdayNames) {
        inADifferentLanguageList = Arrays.asList(weekdayNames);
        inADifferentLanguage = new HashMap<>();
    }

    public WeekDay nextDay(int days) {
        return weekdays[(this.ordinal() + days) % weekdays.length];
    }

    public WeekDay nextDay() {
        return nextDay(1);
    }

    public String get(String lang) {
        try {
            int index = supportedLanguages.indexOf(lang);
            return this.inADifferentLanguageList.get(index);
        } catch(Exception e) {
            System.out.println("'" + lang + "' is not a supported language");
            return "?";
        }
    }
}
