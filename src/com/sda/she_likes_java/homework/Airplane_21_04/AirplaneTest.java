package com.sda.she_likes_java.homework.Airplane_21_04;

public class AirplaneTest {
    public static void main(String[] args) {
        Airplane ay1071 = new Airplane("Airbus 230", false, 56, 23);
        Airplane bt312 = new Airplane("Boeing 777", false, 56, 23 );

        ay1071.checkState();
        ay1071.takeOff();
        ay1071.flyTo(55, 12);
        ay1071.land();
        System.out.println(ay1071);

        bt312.takeOff();
        bt312.land();
        bt312.checkState();
        System.out.println(bt312);
    }
}
