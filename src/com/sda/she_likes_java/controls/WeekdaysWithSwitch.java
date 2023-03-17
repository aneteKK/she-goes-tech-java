package com.sda.she_likes_java.controls;

import java.util.Scanner;

public class WeekdaysWithSwitch {
    public static void main(String[] args) {
        //1...7
        //1 means monday
        //7 means sunday

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Provide the ordinal number of weekday: ");
        int ordinalNumberOfWeekday = inputReader.nextInt();
        switch(ordinalNumberOfWeekday){
            case 1:
                System.out.println("It is monday!");
                break;
            case 2:
                System.out.println("It is tuesday!");
                break;
            case 3:
                System.out.println("It is wednesday!");
                break;
            case 4:
                System.out.println("It is thursday!");
                break;
            case 5:
                System.out.println("It is friday!");
               break;
            case 6:
                System.out.println("It is saturday!");
                break;
            case 7:
                System.out.println("It is sunday!");
                break;
            default:
                System.out.println("Don't cheat!!!");
        }


    }
}
