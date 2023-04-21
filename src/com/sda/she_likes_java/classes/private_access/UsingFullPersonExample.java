package com.sda.she_likes_java.classes.private_access;

import com.sda.she_likes_java.classes.constructor.FullPersone;

public class UsingFullPersonExample {

    public static void main(String[] args) {
        FullPersone maybeMe = new FullPersone("Anete", "KK", 30, null);
        FullPersone maybeYou = new FullPersone();

        maybeYou.setName("Roberts");

        System.out.println(maybeMe);
        System.out.println(maybeYou);

//        maybeMe.age = -1;
//        System.out.println("my age: " + maybeMe.getAge());
//        System.out.println("me before age decreasing: " + maybeMe);
//        maybeMe.setAge(-1);
//        System.out.println("me after failed trial to decrease age: " + maybeMe);

    }
}