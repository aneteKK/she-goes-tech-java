package com.sda.she_likes_java.controls;

import java.util.Scanner;

public class WeekdaysWithIf {
    public static void main(String[] args) {
        //1...7
        //1 means monday
        //7 means sunday

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Provide the ordinal number of weekday: ");
        int ordinalNumberOfWeekday = inputReader.nextInt();
        if(ordinalNumberOfWeekday == 1){
            System.out.println("It is monday!");
        }
         else if(ordinalNumberOfWeekday == 2){
            System.out.println("It is tuesday!");
        }

        else if(ordinalNumberOfWeekday == 3){
            System.out.println("It is wednesday!");
        }
        else if(ordinalNumberOfWeekday == 4){
            System.out.println("It is thursday!");
        }

        else if(ordinalNumberOfWeekday == 5){
            System.out.println("It is friday!");
        }
        else if(ordinalNumberOfWeekday == 6){
            System.out.println("It is sunday!");
        }

       else if(ordinalNumberOfWeekday == 7){
            System.out.println("It is saturday!");
        }
       else{
            System.out.println("Don't cheat!");
        }

    }
}
