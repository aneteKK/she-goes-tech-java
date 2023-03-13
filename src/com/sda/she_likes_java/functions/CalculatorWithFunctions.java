package com.sda.she_likes_java.functions;

public class CalculatorWithFunctions {
    public static void main(String[] args) {
        System.out.println("Let's start calculations");

        System.out.println (sum(3,7));
        System.out.println(sum(10, 33));

    }
    public static int sum(int a, int b){
        System.out.println("I'm not so smart calculator");
        int result = a+b;
        return result;
    }
}
