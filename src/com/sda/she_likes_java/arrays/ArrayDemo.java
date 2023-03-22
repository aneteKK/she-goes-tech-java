package com.sda.she_likes_java.arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        // create an array (set) of 100 values
        int[] numbers = new int[100];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index*3;
            System.out.println("In index: "+index+ " " + numbers[index]+" is stored");
        }
    }
}
