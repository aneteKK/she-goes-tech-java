package com.sda.she_likes_java.homework.homework_28_04;

public class Main {
    public static void main(String[] args) {

        Airplane myAirplane = new Airplane();
        myAirplane.fly();

        Submarine mySubmarine = new Submarine();
        mySubmarine.dive();

        Vehicle yourSubmarine = new Submarine();
        yourSubmarine.Move();

       Vehicle myShip = new Ship();
        Ship myShip2 = (Ship) myShip;
        myShip2.floating();

        Ship yourShip = new Ship();
        yourShip.Move();

    }
}
