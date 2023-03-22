package com.sda.she_likes_java.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class RandomNumberSorterWithSortingMethod {
    public static void main(String[] args) {

    Random numberGenerator = new Random();

        int a = numberGenerator.nextInt(100);
        int b = numberGenerator.nextInt(100);
        int c = numberGenerator.nextInt(100);

        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(a);
        myNumbers.add(b);
        myNumbers.add(c);
        Collections.sort(myNumbers);  // Sort myNumbers
        for (int i : myNumbers) {
            System.out.println(i);
        }

//        List<Integer> list = myNumbers.stream()
//                .sorted()
//                .toList();
//
//        System.out.println(list);
    }
}
