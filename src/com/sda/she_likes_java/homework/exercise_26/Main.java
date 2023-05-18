package com.sda.she_likes_java.homework.exercise_26;

import com.sda.she_likes_java.enumerable.ProgrammersStates;

public class Main {

    public static void main(String[] args) {

        ImportantEvents myImportantEvents = ImportantEvents.WEDDING;


        ImportantEvents[] allImportantEvents = ImportantEvents.values();
        for (ImportantEvents i : allImportantEvents) {
            System.out.println(i);
//
//        Exercise 26
//        Create an enumeration class named ImportantEvents.
//        The class should contain the following fields:
//        - Date of the event
//                - Description of the event.
//                Create at least 3 instances of the class to symbolise your important events.
//        Create the class Main and in it:
//        - call the values() method of your class
//        - write out the contents of the created array (dates and description)
        }
    }
}
