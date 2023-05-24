package com.sda.she_likes_java.homework.exercise_29;

import java.util.Scanner;

public class PostalCodeMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your postal code");
        String usersPostalCode = scanner.next();


        PostalCodeFormatCheck postalCodeFormatChecker = new PostalCodeFormatCheck();

        try {
            postalCodeFormatChecker.postalCodeFormatCheck(usersPostalCode);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        char mLetter = 'm';
        System.out.println("m letter: " + mLetter);
        int mLetterCode = mLetter;
        System.out.println("m letter code: " + mLetterCode);

    }
}
