package com.sda.she_likes_java.homework;

public class calculator {
    public static void main(String[] args) {
        int a;
        int b;
        int sum;
        double quotient;
        int product;
        int difference;

        System.out.println(calculator(1, 2, "-"));
        System.out.println(calculator(1, 5, "+"));
        System.out.println(calculator(6, 2, "*"));
        System.out.println(calculator(1, 8, "/"));
        System.out.println(calculator(7, 3, "%"));

    }

    public static double calculator(int a, int b, String operator) {
        System.out.println("+".charAt(0));
        System.out.println(operator.charAt(0));

        if ("+".equals(operator)) {
            System.out.println("You are adding");
            return a + b;
        }
        if ("-".equals(operator)) {
            System.out.println("You are subtracting");
            return a - b;
        }

        if ("*".equals(operator)) {
            System.out.println("You are multiplying");
            return a * b;
        }
        if ("/".equals(operator)) {
            System.out.println("You are dividing");
            return a / b;
        }
        if (operator == "%") {
            return a % b;
        }
        return 0;
    }
}
