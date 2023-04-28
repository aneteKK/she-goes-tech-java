package com.sda.she_likes_java.homework.cars;

public class Toyota extends Car{



    @Override
    public void drive() {
        boolean isDriving = true;
        System.out.println("Your Toyota is driving");
    }

    public void callToyotaDealership(){
        System.out.println("You called Toyota dealership");
    }
    public void paintToyotaRed(){
        System.out.println("You painted your toyota red");
    }
}
