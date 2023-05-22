package com.sda.she_likes_java.homework.exercise_28;

public class Test{
    public static void main(String[] args) {
        int x=1;
        int y = -1;
        int z = 3;
        int u = sumOfBiggestNumbers( x, y, z);
        System.out.println(u);
    }

    public static int sumOfBiggestNumbers(int x, int y, int z) {

        int[] numbersForSorting = {x, y, z};


        int i;
        for (i = 0; i < 2;i++){
            for (int j = 0; j < 2 - i - 1; j++) {
                if (numbersForSorting[j] > numbersForSorting[j + 1]) {
                    int temp = numbersForSorting[j];
                    numbersForSorting[j] = numbersForSorting[j + 1];
                    numbersForSorting[j + 1] = temp;
                }
            }
        }


        int biggestNumber = numbersForSorting[2];
        int secondBiggestNumber = numbersForSorting[1];
        int numberSum = biggestNumber + secondBiggestNumber;
        return numberSum;


    }
}