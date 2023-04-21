package com.sda.she_likes_java.homework.homework_16;

public class ProcessService {

    public static void main(String[] args) {
        Owner ownerOne = new Owner();
        Animal petOne = new Animal();
        petOne.setAge(11);
        petOne.setBreed("russian blue");
        petOne.setFirstName("kakis - kakis");

        ownerOne.setFirstName("Anete");
        ownerOne.setSurname("Kalderauska");
        ownerOne.setPetOne(petOne);

        System.out.println(ownerOne);

    }
}
