package com.sda.she_likes_java.homework;

public class homeworkAdress {
    public static void main(String[] args) {
        Address myAddress = new Address("Latvia", "Riga", "Turaidas", 41, "LV-2015");
        Address yourAddress = new Address("Lithuania", "Vilnius", "Riga", 30, "LT-2222");


        myAddress.addressLine();
        yourAddress.addressLine();

    }
}
