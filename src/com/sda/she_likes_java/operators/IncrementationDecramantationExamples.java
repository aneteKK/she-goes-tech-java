package com.sda.she_likes_java.operators;

public class IncrementationDecramantationExamples {
    public static void main(String[] args) {
        int one = 10;
        int two = 10;

        one++; //priincrementing by 1
        two--; //pridecrementation

        System.out.println("one value is: " + one);
        System.out.println("two value is: " + two);

        ++one;// inc. by 2 aka postincrementation
        --two; // postdecrementation

        System.out.println("one value is: " + one);
        System.out.println("two value is: " + two);

        int tree = ++one;
        System.out.println("value of one ir :" + one);
        System.out.println("tree should have value of 13, and current value of it is: "+ tree);

        System.out.println("Incrementation explanation...");
        System.out.println("one value is: " + one);
        int four = one++;
        System.out.println("One value is : " + one);
        System.out.println("postincrementation is going to assign to four variable current value of one and later" +
                " is going to increase value of one");
        System.out.println(four);
        System.out.println("now post incr. : ");
        System.out.println("one value is: " + one);
        four = ++one;
        System.out.println("one value is: " + one);
        System.out.println(" post incr. four value is: " + one);
    }
}
