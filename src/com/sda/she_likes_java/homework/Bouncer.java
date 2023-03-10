package com.sda.she_likes_java.homework;
import com.sun.tools.attach.AgentInitializationException;

import java.util.Scanner;
public class Bouncer {
    int age;
    static boolean isKid;

    public static void main(String[] args) {
        Scanner myAge = new Scanner(System.in);
        System.out.println("Enter age");
        int age = myAge.nextInt();

        if (age < 18) {
            isKid = true;
            System.out.println("You cannot enter!");
        } else {
            isKid = false;
            System.out.println("Come inside!");


        }
    }
}
