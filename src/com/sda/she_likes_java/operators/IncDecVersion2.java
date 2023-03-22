package com.sda.she_likes_java.operators;

public class IncDecVersion2 {
    public static void main(String[] args) {
        int age = 17;

        boolean isAdult = age>=18;
        System.out.println("isAdult value: "+ isAdult);

        isAdult = age++>=18;
        System.out.println("isAdult value: "+ isAdult);
        System.out.println(age);

        age = 17;
        isAdult=++age>=18;
        System.out.println("isAdult value: "+ isAdult);
        System.out.println(age);
    }
}
