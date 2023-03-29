package com.sda.she_likes_java.homework.homework_16;

public class Owner {

    private String firstName;
    private String surname;

    private Animal petOne;

    @Override
    public String toString() {
        return "Owner{" +
                "firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", petOne=" + petOne.toString() +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Animal getPetOne() {
        return petOne;
    }

    public void setPetOne(Animal petOne) {
        this.petOne = petOne;
    }
}
