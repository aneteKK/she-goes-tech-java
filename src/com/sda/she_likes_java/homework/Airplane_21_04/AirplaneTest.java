package com.sda.she_likes_java.homework.Airplane_21_04;

public class AirplaneTest {
    public static void main(String[] args) {
        Airplane ay1071 = new Airplane("Airbus 230", false, 56, 23, false);
        Airplane bt312 = new Airplane("Boeing 777", false, 56, 23, false );


        ay1071.checkState();
        ay1071.takeOff();
        ay1071.land();
        System.out.println(ay1071);

    }
}
