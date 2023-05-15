package com.sda.she_likes_java.homework.homework_23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


public class Main {

    public static void main(String[] args) {

//        Create a lesson journal:
//        - it should provide 3 methods
//                - provide a list of pupils
//        - provide a list of subjects
//        - provide the pupil’s grades in the subject.
//                Think about what classes you will need.
//        What structures will you use to store the data: list, map, set.


        Subject Math = new Subject("Math", "I.Ose");
        Subject LatvianLanguage = new Subject("Latviešu valoda", "G.Gusta");
        Subject Programming = new Subject("Java", "M.Pastuzka");

        ArrayList<Subject> subjects = new ArrayList<>();
        subjects.add(Math);
        subjects.add(LatvianLanguage);
        subjects.add(Programming);

        System.out.println(subjects);

        ArrayList<Integer> anetesMathGrades = new ArrayList<>();
        anetesMathGrades.add(9);
        anetesMathGrades.add(7);
        anetesMathGrades.add(10);

        ArrayList<Integer> anetesLatvianLanguageGrades = new ArrayList<>();
        anetesLatvianLanguageGrades.add(6);
        anetesLatvianLanguageGrades.add(8);
        anetesLatvianLanguageGrades.add(7);

        ArrayList<Integer> anetesProgrammingGrades = new ArrayList<>();
        anetesProgrammingGrades.add(7);
        anetesProgrammingGrades.add(8);
        anetesProgrammingGrades.add(6);

        HashMap<Subject, ArrayList<Integer>> anetesGrades = new HashMap<>();
        anetesGrades.put(Math, anetesMathGrades);
        anetesGrades.put(LatvianLanguage, anetesLatvianLanguageGrades);
        anetesGrades.put(Programming, anetesProgrammingGrades);

        ArrayList<Integer> robertsMathGrades = new ArrayList<>();
        robertsMathGrades.add(7);
       robertsMathGrades.add(7);
        robertsMathGrades.add(9);

        ArrayList<Integer> robertsLatvianLanguageGrades = new ArrayList<>();
        robertsLatvianLanguageGrades.add(8);
        robertsLatvianLanguageGrades.add(8);
       robertsLatvianLanguageGrades.add(9);

        ArrayList<Integer> robertsProgrammingGrades = new ArrayList<>();
        robertsProgrammingGrades.add(10);
        robertsProgrammingGrades.add(9);
        robertsProgrammingGrades.add(10);

        HashMap<Subject, ArrayList<Integer>> robertsGrades = new HashMap<>();
        robertsGrades.put(Math, robertsMathGrades);
        robertsGrades.put(LatvianLanguage, robertsLatvianLanguageGrades);
        robertsGrades.put(Programming, robertsProgrammingGrades);


        HashSet<Pupil> pupilList = new HashSet<>();
        Pupil aneteK = new Pupil("Anete", "Koknevica", "12A", List.of(anetesGrades));
        Pupil robertsK = new Pupil("Roberts", "Kalderauskis", "12A", List.of(robertsGrades));

        ClassJournal classJournal = new ClassJournal();
        classJournal.getPupilList();
        classJournal.addToPupilList(robertsK);
        classJournal.addToPupilList(aneteK);

        System.out.println( classJournal.showPupilList());
        System.out.println(anetesGrades.get(Math));
        System.out.println(robertsGrades.get(Math));
    }
}
