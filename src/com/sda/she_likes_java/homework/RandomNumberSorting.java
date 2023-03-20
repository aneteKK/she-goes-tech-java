package com.sda.she_likes_java.homework;
import java.util.Random;
public class RandomNumberSorting {
    public static void main(String[] args) {

        Random numberGenerator = new Random();
        int a = numberGenerator.nextInt();
        int b = numberGenerator.nextInt();
        int c = numberGenerator.nextInt();


        if (a >= b && b >= c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);}

         else if (a >= c && c >= b) {
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            } else if (b >= a && a >= c) {
                System.out.println(b);
                System.out.println(a);
                System.out.println(c);
            } else if (b >= c && c >= a) {
                System.out.println(b);
                System.out.println(c);
                System.out.println(a);
            } else if (c >= a && a >= b) {
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            } else if (c >= b && b >= a) {
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            }

    }
}
