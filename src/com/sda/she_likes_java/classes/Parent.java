package com.sda.she_likes_java.classes;

public class Parent extends Person{
    String kidsName;

    public Parent(String firstName, String surname, int age, String kidsName) {
        super(firstName, surname, age);
        this.kidsName = kidsName;
    }
    public String getParentInformation() {
        return ("You are %s %s Your age is %s.Your kids name is %s".formatted(this.firstName, this.surname, this.age, this.kidsName));
    }
}
