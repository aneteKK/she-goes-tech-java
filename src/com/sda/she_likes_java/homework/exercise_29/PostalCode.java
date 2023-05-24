package com.sda.she_likes_java.homework.exercise_29;

public class PostalCode {

     public String postalCode;

    @Override
    public String toString() {
        return "PostalCode{" +
                "postalCode='" + postalCode + '\'' +
                '}';
    }

    public PostalCode(String postalCode) {
        this.postalCode = postalCode;


    }
}
