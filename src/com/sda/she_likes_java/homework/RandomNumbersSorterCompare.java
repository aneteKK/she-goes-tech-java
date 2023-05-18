package com.sda.she_likes_java.homework;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbersSorterCompare {
    public static void main(String[] args) {

        Random numberGenerator = new Random();

        int a = numberGenerator.nextInt(100);
        int b = numberGenerator.nextInt(100);
        int c = numberGenerator.nextInt(100);

        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(a);
        myNumbers.add(b);
        myNumbers.add(c);
//
//        ArrayList<Integer> tempNumbers = new ArrayList<>();
//        boolean emptyList = tempNumbers.isEmpty();
//
//        if (emptyList) {
//            tempNumbers.set(0, myNumbers.get(0));}
//          else{
//                for (int i = 0; i <= myNumbers.size(); i++) {
//                    if (myNumbers.get(0)>= tempNumbers.get(0)){
//                        tempNumbers.add(0, myNumbers.get(0));
//                    }
//                    else{
//                        int tempNumbersSize = tempNumbers.size();
//                        var tempNumberSize = tempNumbersSize+1;
//                        tempNumbers.add(tempNumbersSize, myNumbers.get(0) );
//                    }
//                }
//            }


    }
}
