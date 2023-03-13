package com.sda.she_likes_java.loops.while_loop;

public class WhileLoop {
    public static void main(String[] args) {

//        while (true) {
////while loop is goint to be executed only when condition is true;
//            //body of w loop repeats a many times as the condition is true
//            System.out.println("Java forever!");
//        }
        int numberOfTrials = 5;
        while (numberOfTrials > 0) {
            System.out.println("I'' working");
            numberOfTrials = numberOfTrials - 1;
            if (numberOfTrials % 2 == 1) {
                System.out.println("Current N.o.t.: " + numberOfTrials);
            }
        }
    }
}
