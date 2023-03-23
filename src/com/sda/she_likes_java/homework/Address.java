package com.sda.she_likes_java.homework;

public class Address {
    String country;
    String city;
    String street;
    int streetNumber;
    String postalCode;

    Address(String country, String city, String street, int streetNumber, String postalCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;

    }

    void addressLine(){
        System.out.println("Your live in %s, %s at %s %s. Your postal code is %s.".formatted(this.country, this.city, this.street, this.streetNumber, this.postalCode));
    }


}
