
package com.sda.she_likes_java.visibility.examples;
public class BetterCar {
    private final String brand;
    private final String model;
    private final String colour;
    private int rpm;
    private int currentGear;
    public BetterCar(String brand, String model, String colour) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
    }
    // encapsulation - hiding internal state behind the outside user and exposing just the methods
    public void increaseSpeed() {
        currentGear++;
        rpm = currentGear * 100;
    }
}