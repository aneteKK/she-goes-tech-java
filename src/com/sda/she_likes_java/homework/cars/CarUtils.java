package com.sda.she_likes_java.homework.cars;

public class CarUtils {

    public static void safeCast(Car car){

        if (car instanceof Mazda) {
            System.out.println("Mazda broke, let's call dealership! ");
            ((Mazda) car).callMazdaDealership();
        } else if (car instanceof Toyota) {
            System.out.println("Toyotq broke, let's call dealership! " );
            ((Toyota) car).callToyotaDealership();
        } else {
            System.out.println("Ferrari broke, let's call dealership! " );
            ((Ferrari) car).callFerrariDealership();
        }
    }
}
