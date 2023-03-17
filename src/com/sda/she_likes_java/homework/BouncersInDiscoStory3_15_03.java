package com.sda.she_likes_java.homework;
import java.util.Scanner;

public class BouncersInDiscoStory3_15_03 {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Will your choose young bouncer? (true/false)");
        boolean youngBouncer = inputReader.nextBoolean();

        if (!youngBouncer) {
            System.out.println("You chose old bouncer");
            oldBouncer();
        }
        if (youngBouncer) {
            youngBouncer();
        }

    }

    public static void oldBouncer() {
        System.out.println("At my age it is clear as a day, that you are welcome here.");
    }

    public static void youngBouncer() {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = inputReader.nextInt();
        System.out.println("Can You sing? (true/false)");
        boolean singer = inputReader.nextBoolean();
        System.out.println("How tall are you?");
        int height = inputReader.nextInt();

        if (age >= 18 && height > 155 && singer) {
            System.out.println("Come inside!");
        }


        if (age < 18 || height < 155 || !singer) {
            System.out.println("Go away!");
            System.out.println();
            sneakIn();
        }
    }
public static void sneakIn() {
            System.out.println("Try to sneak in anyway?(true/false)");
    Scanner inputReader = new Scanner(System.in);
            boolean sneakIn = inputReader.nextBoolean();
            if (sneakIn) {
                System.out.println("You try to get in trough old bouncer");
                System.out.println("\"Hello! It's nice that young people choose to come to me - old bouncer. Welcome to the party!\"");
            }
        }
}

