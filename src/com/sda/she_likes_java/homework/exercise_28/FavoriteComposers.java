package com.sda.she_likes_java.homework.exercise_28;



public class FavoriteComposers {

    private String name;
    private String surname;

    private String fullName;

    public String getFullName() {
        return name +" "+  surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "FavoriteComposers{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public FavoriteComposers(String name, String surname) {
        this.name = name;
        this.surname = surname;
        fullName = name+surname;
    }





}
