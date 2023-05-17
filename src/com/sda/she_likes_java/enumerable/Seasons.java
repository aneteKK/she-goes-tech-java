package com.sda.she_likes_java.enumerable;

public enum Seasons {
    WINTER(-5, "play in snow"),
    SUMMER(25, "swimming"),
    SPRING(10, "riding my bike"),
    AUTUMN(5, "sleeping");

    private int averageTemp;

    private String activity;

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    private Seasons(int averageTemp, String activity) {
        this.averageTemp = averageTemp;
        this.activity  =  activity;
    }
}
