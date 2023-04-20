package com.sda.she_likes_java.static_modifier;
public class WashMachine {
    private String brand;
    private String model;

    private static int numberOfCreatedMachines;
    public WashMachine(String brand, String model) {
        this.brand = brand;
        this.model = model;
        numberOfCreatedMachines++;
    }
    public static int getNumberOfCreatedMachines(){
        return numberOfCreatedMachines;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    @Override
    public String toString() {
        return "WashMachine{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}