package com.sda.she_likes_java.homework.exercise_27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainMyDate {

    public static void main(String[] args) {


        MyDate dateOfBirth1 = new MyDate(1992, 6, 13);
        MyDate dateOfBirth2 = new MyDate(1992, 7, 23);
        MyDate dateOfBirth3 = new MyDate(2018, 8, 26);
        MyDate dateOfBirth4 = new MyDate(2020, 1, 4);

        ArrayList<MyDate> importantDatesInFamily = new ArrayList<>();
importantDatesInFamily.add(dateOfBirth1);
importantDatesInFamily.add(dateOfBirth2);
importantDatesInFamily.add(dateOfBirth3);
importantDatesInFamily.add(dateOfBirth4);
Collections.sort(importantDatesInFamily);
        System.out.println("Important dates in my family: " + importantDatesInFamily);

    }
}
