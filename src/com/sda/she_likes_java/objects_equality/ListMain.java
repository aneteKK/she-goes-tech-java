package com.sda.she_likes_java.objects_equality;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List PersonList = new ArrayList();

        Person me = new Person("Anete", "Kalderauska", 30);
        Person me2 = new Person("Anete", "Kalderauska", 30);
        Person kid1 = new Person("Emilija", "Kalderauska", 4);
        PersonList.add(me);
        PersonList.add(me2);
        PersonList.add(kid1);
        System.out.println(PersonList);

        System.out.println (PersonList.get(1));
        Person personFromList = (Person) PersonList.get(1);

        List<Person> betterPersonList = new ArrayList<>();
        betterPersonList.add(me);
        betterPersonList.add(me2);
        Person personFromList2 = betterPersonList.get(0);




    }
}
