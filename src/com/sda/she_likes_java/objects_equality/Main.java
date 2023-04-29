package com.sda.she_likes_java.objects_equality;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Are a and b equal? " + (a==b));

        Person first = new Person("Roberts", "Kalderauskis", 30);
        Person second = new Person("Roberts", "Kalderauskis", 30);

        System.out.println("Are first and second equal? " + (first == second));
        System.out.println("Are first and second equal? " + (first.equals(second)));
    }
}
