package com.sda.she_likes_java.common_behavior.wrong_approach;

    public class Animal implements Movable {
        public void go() {
            System.out.println("go() from Animal");
        }

        // don't put fly() here - because not every
        // animal is able to fly
//    public void fly() {
//        System.out.println("fly() from Animal");
//    }
    }