package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDisco {



    public static void main(String[] args) {




        Scanner inputReader = new Scanner(System.in);
        System.out.println("Enter age");
        int age = inputReader.nextInt();

        System.out.println("Enter height");
        int height = inputReader.nextInt();
        boolean isAllowedToParty =  age >= 18 && height >= 155;
        if(isAllowedToParty){
            System.out.println("you can enter!");
        }
        else{
            System.out.println("Go back home!");
        }
//        if (age < 16 || height < 155) {
//
//            System.out.println("You cannot enter!");
//        } else {
//
//            System.out.println("Come inside!");
//
//
//        }
    }
}
