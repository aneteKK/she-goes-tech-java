package com.sda.she_likes_java.homework.exercise_26;

public enum ImportantEvents {

    BIRTH("13th of June, 1992", "I was born"),

    WEDDING("1.07.2017.", "Got married to my best friend/weirdo"),

    DAUGHTERSBIRTH("26th of August, 2018", "Emilija is born");

    String dareOfTheEvent;

    String descriptionOfTheEvent;

    ImportantEvents(String dareOfTheEvent, String descriptionOfTheEvent) {
        this.dareOfTheEvent = dareOfTheEvent;
        this.descriptionOfTheEvent = descriptionOfTheEvent;
    }

    public String getDareOfTheEvent() {
        return dareOfTheEvent;
    }

    public String getDescriptionOfTheEvent() {
        return descriptionOfTheEvent;
    }

    @Override
    public String toString() {
        return "ImportantEvents{" +
                "dareOfTheEvent='" + dareOfTheEvent + '\'' +
                ", descriptionOfTheEvent='" + descriptionOfTheEvent + '\'' +
                '}';
    }
}
