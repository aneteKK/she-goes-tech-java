package com.sda.she_likes_java.virtual_methods;

public class HumanLife {
    public void tellMeWhoYouAre(Human human){
       if(human !=null){
           human.whoYouAre();
       }
    }

    public void tryToCastHumanToMan(Human maybeWomanOrMan){
        ((Man) maybeWomanOrMan).learnToCleanHouse();
//        ((Woman) maybeWomanOrMan).learnJava();

    }
}
