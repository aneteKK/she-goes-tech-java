package com.sda.she_likes_java.classes.constructor;

public class FullAddress {

    public String country;
    public String city;
    public String street;
    public String postalCode;

    @Override
    public String toString() {
        return "FullAddress{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public FullAddress(String country, String city, String street, String postalCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }
// default constructor = constructor without any parametres

    public FullAddress() {
    }

    public static void main(String[] args) {
//        let's create my own address
// ctrl +p to see inside braces what it wants
        FullAddress myAddress = new FullAddress();
        myAddress.city = "Riga";
        myAddress.country = "Latvia";
        myAddress.street = "Turaidas iela";
        myAddress.postalCode = "LV2015";
        System.out.println("Full address by hand: " + myAddress);

        FullAddress createdWithFullConstructor = new FullAddress("Latvia", "Riga", "Turaidas iela 41", "LV2015");
        System.out.println("Full address by constructor: " + createdWithFullConstructor);
    }
}

