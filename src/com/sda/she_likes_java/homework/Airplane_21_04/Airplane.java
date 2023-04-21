package com.sda.she_likes_java.homework.Airplane_21_04;

import java.util.Scanner;
import javax.swing.*;

public class Airplane {


    private final String model;
    public int xPositionDestination;
    public int yPositionDestination;
    private boolean isFlying;
    private boolean hasDestination;
    private int xPosition;
    private int yPosition;


    public Airplane(String model, boolean isFlying, int xPosition, int yPosition, boolean hasDestination) {
        this.model = model;
        this.isFlying = isFlying;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.hasDestination = hasDestination;

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
            if (!hasDestination) {
                System.out.println("Please enter destination first!");
                flyTo();
            } else {
                flyToDestination();
            }
            isFlying = true;
        }
    }

    public void flyToDestination() {
        while (xPositionDestination != xPosition || yPositionDestination != yPosition) {
            if (xPositionDestination > xPosition) {
                xPosition++;
            } else if (xPositionDestination < xPosition) {
                xPosition--;
            }
            if (yPositionDestination > yPosition) {
                yPosition++;
            } else if (yPositionDestination < yPosition) {
                yPosition--;
            }
        }
        System.out.println("You've reached your destination!Coordinates %s, %s".formatted(xPosition, yPosition));
    }

    public void land() {
        if (isFlying) {
            System.out.println("The airplane is on the ground now");
            isFlying = false;

        } else {
            System.out.println("Airplane is already in the hangar");
        }
    }

    public void flyTo() {
        if (hasDestination) {
            System.out.println("You already have a destination!");
        } else {
            Scanner inputReader = new Scanner(System.in);
            System.out.println("Enter longitude:");
            xPositionDestination = inputReader.nextInt();
            System.out.println("Enter latitude:");
            yPositionDestination = inputReader.nextInt();
            System.out.println("You entered coordinates : " + xPositionDestination + " " + yPositionDestination);
            hasDestination = true;
            checkIfWantsToFly();
        }
    }

    public void checkIfWantsToFly() {
        String[] options = {"ABORT", "TAKE OFF",};
        var choice = JOptionPane.showOptionDialog(null, "Do you want to fly to your destination?", "Select one:",
                JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (choice == 0) {
            JOptionPane.showMessageDialog(null, "You chose to stay on ground!");
        }
        if (choice == 1) {
            JOptionPane.showMessageDialog(null, "You chose to fly!");
            if (hasDestination) {
                flyToDestination();
            } else {
                flyTo();
            }
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

