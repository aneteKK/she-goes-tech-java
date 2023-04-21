package com.sda.she_likes_java.homework;
import java.util.Scanner;
public class BouncerDicsoStory3 {

    public static void main(String[] args) {
        System.out.println("Let's try to get into the party. Ask the young bouncer first. If he declines, old one might let you in!");

        int age, height;
        boolean singsWell;

        Scanner inputReader  = new Scanner(System.in);

        System.out.println("\nHow old are you?");
        age = inputReader.nextInt();

        System.out.println("\n And how tall are you?");
        height = inputReader.nextInt();

        System.out.println("\n Do you sing well? True or False?");
        singsWell = inputReader.nextBoolean();

        boolean bypassYoung = checkedByYoungBouncer(age, height, singsWell);
        boolean bypassOld = checkedByOldBouncer(age, height, singsWell);

        if (!bypassYoung) {
            System.out.println("Young bouncer: sorry buddy, get lost!");
            if (bypassOld) {
                System.out.println("Old bouncer: Huh? What did you say? Alright enter! :D");
            } else {
                System.out.println("Old bouncer: Sorry you can't go in. :<");
            }
        }else{
            System.out.println("You're officially invited to partyyyy!!!!");
        }


    }
    public static boolean checkedByYoungBouncer(int age, int height, boolean singsWell) {
        return age >= 18 && height > 180 && singsWell;
    }

    public static boolean checkedByOldBouncer(int age, int height, boolean singsWell) {
        return age >= 18 || height > 180 || singsWell;
    }
}
