package com.sda.she_likes_java.common_behavior.wrong_approach;

public class Tiger extends Animal implements Swimmable  {

    @Override
    public void go() {
        System.out.println("Tiger's go()");
    }

    @Override
    public void swim() {
        System.out.println("I am tiger, who knows how to swim");
    }
}
