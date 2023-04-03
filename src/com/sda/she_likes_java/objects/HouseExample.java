package com.sda.she_likes_java.objects;

import java.sql.SQLOutput;

public class HouseExample {

    public static void main(String[] args) {
        House myhouse = new House(4,2);

        System.out.println("I've got a new house: " + myhouse);
        System.out.println("Currently my house has got " + myhouse.getNumberOfRooms() + " rooms");
        System.out.println("I need more rooms!");

        myhouse.setNumberOfRooms(6);
        myhouse.setNumberOfBathrooms(1);

        System.out.println("=========================================");

        HouseOwner wife = new HouseOwner("Anete", myhouse);
        HouseOwner husband = new HouseOwner("Roberts", myhouse);

        System.out.println("Anete would like to reorganize the house");

        wife.getHouse().setNumberOfBathrooms(5);
        System.out.println("Currently my house has got " + myhouse.getNumberOfBathrooms() + " bathrooms");

        System.out.println("Roberts would like to reorganize the house");
        husband.getHouse().setNumberOfBathrooms(1);
        System.out.println("Currently my house has got " + myhouse.getNumberOfBathrooms() + " bathrooms");

        System.out.println("Anete " + wife);
        System.out.println("Roberts " + husband);

    }
}
