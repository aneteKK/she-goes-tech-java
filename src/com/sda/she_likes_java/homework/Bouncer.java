package com.sda.she_likes_java.homework;
import com.sun.tools.attach.AgentInitializationException;

import java.util.Scanner;
public class Bouncer {
    int age;
    static boolean isKid;
    static boolean isShort;

    public static void main(String[] args) {
        Scanner myAge = new Scanner(System.in);
        System.out.println("Enter age");
        int age = myAge.nextInt();

        Scanner myHeight = new Scanner(System.in);
        System.out.println("Enter height");
        int height = myHeight.nextInt();


        if (age < 16 || height < 155) {
            isKid = true;
            isShort = true;
            System.out.println("You cannot enter!");
        } else {
            isKid = false;
            isShort = false;
            System.out.println("Come inside!");


        }
    }
}
