package com.sda.she_likes_java.sorting;

import java.util.Arrays;

public class SimpleArraySorting {

    public static void main (String [] args){
        int[]numbers = new int[4];
        int[] numbers2 = {1,8,3,-1,5,6,};
        Object numbersArray = numbers2;
        System.out.println(numbers2.length);
        Arrays.sort(numbers2);
        System.out.println(numbers2[0]);
        System.out.println(Arrays.toString(numbers2));
        String anete = "Anete";
        System.out.println(anete.length());
    }
}
