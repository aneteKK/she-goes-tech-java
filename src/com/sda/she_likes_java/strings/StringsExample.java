package com.sda.she_likes_java.strings;

public class StringsExample {

    public static void main(String[] args) {


        String name = "Anete";
        String surname = "Koknevica";
        int age = 30;

        String info = " Hi, I'm " + name + " " + surname + ". " + "I am " + age + " years old.";
        String info2 = String.format(" Hi, I'm %s %s. I am %s years old.",name, surname, age);
        System.out.println(info);
        System.out.println(info2);
        System.out.printf(" Hi, I'm %s %s. I am %s old.%n", name, surname, age);
    }
}
