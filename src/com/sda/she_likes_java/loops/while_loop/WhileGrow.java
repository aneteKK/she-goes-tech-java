package com.sda.she_likes_java.loops.while_loop;

public class WhileGrow {
    public static void main(String[] args) {
        int ageOfKid = 1;

        while(ageOfKid<=18){
            System.out.println("Can I go to disco?");
            System.out.println("No");
            ageOfKid++;
        }

        System.out.println("Can I go to party?");
        System.out.println("Go to the party!");
    }
}
