package com.sda.she_likes_java.enumerable;

public class SeasonsExample {
    public static void main(String[] args) {
        Seasons myFavoriteOne = Seasons.SUMMER;
        System.out.println("Average temperature during summer is: "+ myFavoriteOne.getAverageTemp());
        System.out.println("Summers activity " + myFavoriteOne.getActivity());


        myFavoriteOne.setActivity("running");
        System.out.println("Summers activity " + myFavoriteOne.getActivity());

        Seasons autumn = Seasons.AUTUMN;
        System.out.println("summer: " + myFavoriteOne);
    }
}
