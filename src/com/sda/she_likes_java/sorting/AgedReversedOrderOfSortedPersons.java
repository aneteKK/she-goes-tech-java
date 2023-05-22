package com.sda.she_likes_java.sorting;

import java.util.Comparator;

public class AgedReversedOrderOfSortedPersons
        implements Comparator<SortedPerson> {

    @Override
    public int compare(SortedPerson o1, SortedPerson o2) {
//        return o2.getAge() - o1.getAge();

        System.out.println("Using my AgedReversedOrderOfSortedPersons class.");
        if (o1.getAge() < o2.getAge()) {
            return 1; //swap objects
        } else if (o1.getAge() > o2.getAge()) {
            return -1; //they are in the correct order
        } else {
            return 0; //same age, do nothing
        }
    }
}