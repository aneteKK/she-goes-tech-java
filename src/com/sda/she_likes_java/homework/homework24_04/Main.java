package com.sda.she_likes_java.homework.homework24_04;

public class Main {
    public static void main(String[] args) {

        Vehicle myShip = new Ship();
        Vehicle myPlane = new Plane();
        Vehicle newVehicle = new Vehicle();

        myShip.Move();
        myPlane.Move();
        newVehicle.Move();

    }
}
