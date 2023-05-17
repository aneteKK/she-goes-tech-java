package com.sda.she_likes_java.operators;

public class ThreeWayOperator {
    public static void main(String[] args) {
        System.out.println(getMyName(true));
        System.out.println(getMyName(false));
    }

    public static String getMyName(boolean fullName) {
        //if condition is true, return first String, if false, second.
        return fullName? "Anete Koknevica" : "Anete";
//        if (fullName) {
//            return "Anete Koknevica";
//        } else {
//            return "Anete";
//        }
    }
}
