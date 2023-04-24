package com.sda.she_likes_java.virtual_methods;

public class Main {

    public static void main(String[] args) {
        Mammal human = new Human();
        human.whoYouAre();

        Human nullHuman = null;

        HumanLife humanLife = new HumanLife();
        humanLife.tellMeWhoYouAre(nullHuman);

        Woman woman = new Woman();
        humanLife.tellMeWhoYouAre(woman);

        Man man  = new Man();
        humanLife.tellMeWhoYouAre(man);
    }
}