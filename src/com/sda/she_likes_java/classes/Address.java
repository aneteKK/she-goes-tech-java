package com.sda.she_likes_java.classes;

public class Address{
    String fullInformation;
    String country;
    String city ;
    int streetNumber;
    String street ;
    String postalCode;

    String fullAddress;
    Address(String country, String city, int streetNumber, String street, String postalCode){

        this.country = country;
        this.city = city;
        this.streetNumber = streetNumber;
        this.street = street;
        this.postalCode = postalCode;

    }
    void addressLine(){
        System.out.printf("Your live in %s, %s at %s %s. Your postal code is %s.%n", this.country, this.city, this.street, this.streetNumber, this.postalCode);

    }


    }

