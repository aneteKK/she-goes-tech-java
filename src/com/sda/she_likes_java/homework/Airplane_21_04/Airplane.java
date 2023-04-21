package com.sda.she_likes_java.homework.Airplane_21_04;

public class Airplane {


    private String model;
    private boolean isFlying;
    private int xPosition;
    private int yPosition;

    public int xPositionDestination;

    public int yPositionDestination;

    public Airplane(String model, boolean isFlying, int xPosition, int yPosition) {
        this.model = model;
        this.isFlying = isFlying;
        this.xPosition = xPosition;
        this.yPosition = yPosition;

    }

    @Override
    public String toString() {
        return "Airplane{" +
                "model='" + model + '\'' +
                ", isFlying=" + isFlying +
                ", xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                '}';
    }

    public void takeOff() {
        if (isFlying) {
            System.out.println("Airplane is already in air");
        } else {
            yPosition = yPosition++;
            xPosition = xPosition++;
            System.out.println("Airplane took off");
            isFlying = true;
        }
    }

    public void land() {
        if (isFlying) {
            xPosition = 56;
            yPosition = 23;
            System.out.println("The airplane is on the ground now");
            isFlying = false;
        } else {
            System.out.println("Airplane is already in the hangar");
        }
    }

    public void flyTo(int xPositionDestination, int yPositionDestination){
            if(isFlying){
                yPosition = yPositionDestination;
                xPosition = xPositionDestination;
                System.out.println("Airplane will fly to coordinates: " + xPositionDestination + " "+ yPositionDestination);

            }else{
                System.out.println("Airplane is still in hangar, you have to take off first");
            }
    }

    public void checkState(){
        if(isFlying){
            System.out.println("The airplane is in air");
        }else{
            System.out.println("The airplane is on the ground");
        }
    }

}

