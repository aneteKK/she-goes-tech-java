package com.sda.she_likes_java.classes;

public class FullPersonInformation {


    public static void main(String[] args) {
        Address address = new Address("Latvia", "Riga", 41, "Turaidas", "LV2015");
        Person firstChild = new Person("Emīlija", "Kalderauska", 4);
        Person secondChild = new Person("Herberts", "Kalderauskis", 3);
        Person parent = new Person("Anete", "Kalerauska", 30);



address.addressLine();
firstChild.PersonInformation();
secondChild.PersonInformation();
parent.PersonInformation();




    }

    }