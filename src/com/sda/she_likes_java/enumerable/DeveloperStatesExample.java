package com.sda.she_likes_java.enumerable;

import java.sql.SQLOutput;

public class DeveloperStatesExample {
    public static void main(String[] args) {
        System.out.println("Let's start the day!");

        ProgrammersStates myState = ProgrammersStates.NORMAL;
        System.out.println("I'm in  "+ myState+ " state.");
        System.out.println("I feel: " + myState.getDescription() );

        System.out.println("I've got new task!");
        myState = ProgrammersStates.GOD_MODE;
        System.out.println("I'm in  "+ myState+ " state.");
        System.out.println("I feel: " + myState.getDescription() );


        System.out.println("After a while I'm exhausted, stupid task!");
        myState = ProgrammersStates.EXHAUSTED;
        System.out.println("I'm in  "+ myState+ " state.");
        System.out.println("I feel: " + myState.getDescription() );

        System.out.println("Enum methods: ");
        System.out.println("name: " + ProgrammersStates.GOD_MODE.name());
        System.out.println("ordinal (gives position in enum): " + ProgrammersStates.GOD_MODE.ordinal());

        ProgrammersStates [] allStates = ProgrammersStates.values();
        System.out.println("Should be normal " + allStates[2]);
    }
}
