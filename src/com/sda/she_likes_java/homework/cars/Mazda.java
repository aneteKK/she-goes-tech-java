package com.sda.she_likes_java.homework.cars;

public class Mazda extends Car {


    @Override
    public void drive(){
        boolean isDriving = true;
        System.out.println("Your Mazda is driving");
    }

    public void callMazdaDealership(){
        System.out.println("You contacted the dealership");
    }

    public void paintMazdaRed(){
        System.out.println("You painted your mazda red");
    }

}
