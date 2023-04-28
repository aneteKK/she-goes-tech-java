package com.sda.she_likes_java.homework.cars;

public class Ferrari extends Car{



    @Override
    public void drive() {
        boolean isDriving = true;
        System.out.println("Your Ferrari is driving");
    }

    public void callFerrariDealership(){
        System.out.println("You called Ferrari dealership");
    }
    public void paintFerrariRed(){
        System.out.println("You painted your ferrari red");
    }
}
