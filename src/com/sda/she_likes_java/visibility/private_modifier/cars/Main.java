package com.sda.she_likes_java.visibility.private_modifier.cars;

public class Main {
    public static void main(String[] args) {
        Car funnyCar = new Car();
        funnyCar.model = " A4";
        funnyCar.colour = "red";
//brand is private so not accessible;
funnyCar.setBrand("Audi");

    }
}
