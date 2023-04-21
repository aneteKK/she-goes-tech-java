package com.sda.she_likes_java.homework.Airplane_21_04;

public class Airplane {


    private final String model;
    public int xPositionDestination;
    public int yPositionDestination;
    private boolean isFlying;
    private int xPosition;
    private int yPosition;

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

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getxPositionDestination() {
        return xPositionDestination;
    }

    public void setxPositionDestination(int xPositionDestination) {
        this.xPositionDestination = xPositionDestination;
    }

    public int getyPositionDestination() {
        return yPositionDestination;
    }

    public void setyPositionDestination(int yPositionDestination) {
        this.yPositionDestination = yPositionDestination;
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
            if (xPositionDestination > 0 && yPositionDestination > 0) {
                xPosition = xPositionDestination;
//                setxPosition(xPosition);
                yPosition = yPositionDestination;
                System.out.println("The airplane is on the ground now");
//                setyPosition(yPosition);
                isFlying = false;

            } else {
                System.out.println("Airplane had no destination so it is back in RIX");
                isFlying = false;
            }
        } else {
            System.out.println("Airplane is already in the hangar");
        }
    }

    public void flyTo(int xPositionDestination, int yPositionDestination) {
        if (isFlying) {
            yPosition = yPositionDestination;
            xPosition = xPositionDestination;
            System.out.println("Airplane will fly to coordinates: " + xPositionDestination + " " + yPositionDestination);

        } else {
            System.out.println("Airplane is still in hangar, you have to take off first");
        }
    }

    public void checkState() {
        if (isFlying) {
            System.out.println("The airplane is in air");
        } else {
            System.out.println("The airplane is on the ground");
        }
    }

}

