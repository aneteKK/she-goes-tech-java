package com.sda.she_likes_java.homework.homework_23;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Pupil {

    String name;

    String surname;

    String classNr;

 List<HashMap< Subject, ArrayList<Integer>>> grades;

    public Pupil(String name, String surname, String classNr, List<HashMap<Subject, ArrayList<Integer>>> grades) {
        this.name = name;
        this.surname = surname;
        this.classNr = classNr;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", classNr='" + classNr + '\'' +
                ", grades=" + grades +
                '}';
    }
}
