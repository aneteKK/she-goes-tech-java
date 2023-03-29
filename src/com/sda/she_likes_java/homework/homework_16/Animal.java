package com.sda.she_likes_java.homework.homework_16;

public class Animal {
    String firstName;

    int age;

    String breed;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';


    }
}
