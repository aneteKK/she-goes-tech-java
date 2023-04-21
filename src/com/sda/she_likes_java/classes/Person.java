package com.sda.she_likes_java.classes;



public class Person {
     String firstName ;
     String surname ;
     int age ;
Person(String firstName, String surname, int age){
     this.age = age;
     this.firstName = firstName;
     this.surname = surname;

}

     void PersonInformation() {

          System.out.printf("You are %s %s Your age is %s.%n", this.firstName, this.surname, this.age);
    }

}
