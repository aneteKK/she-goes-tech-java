package com.sda.she_likes_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MyProjectSorter {
    public static void main(String[] args) {

        Random numberGenerator = new Random();
        ArrayList<Integer> sortedNumbers = new ArrayList<>();
        ArrayList<Integer> numbersToSort = new ArrayList<>();
        sortedNumbers.add(0, 0);

        for (int i = 0; i < 10; i++) {
            int integerToSort = numberGenerator.nextInt(1000);
            numbersToSort.add(i, integerToSort);

        }
        System.out.println(numbersToSort);
        for (int i = numbersToSort.size(); i >0; i--) {

            Integer minValue = getMinValue(numbersToSort);
            sortedNumbers.add(minValue);
            numbersToSort.remove(minValue);
        }
        System.out.println(sortedNumbers);
    }


        private static Integer getMinValue (List < Integer > numbersToSort)
        {
            int minValue = numbersToSort.get(0);

            for (Integer number : numbersToSort) {
                if (number < minValue) {
                    minValue = number;
                }
            }

            return minValue;
        }
    }
