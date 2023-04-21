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

    public String takeOffCheck;

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
             isFlying = true;
        } else {
            if (!hasDestination) {
                System.out.println("Please enter destination first!");
                flyTo();
            } else {
                System.out.println("Airplane will fly to it's destination!");

                while (xPosition != xPositionDestination || yPosition != yPositionDestination) {
                    if (xPosition >= xPositionDestination || yPosition >= yPositionDestination) {
                        yPosition = yPosition - 1;
                        xPosition = xPosition - 1;

                    }
                    if (xPosition >= xPositionDestination || yPosition <= yPositionDestination) {
                        xPosition = xPosition - 1;
                        yPosition = yPosition + 1;

                    }
                    if (xPosition <= xPositionDestination || yPosition <= yPositionDestination) {
                        xPosition = xPosition + 1;
                        yPosition = yPosition + 1;

                    }
                    if (xPosition <= xPositionDestination || yPosition >= yPositionDestination)
                        xPosition = xPosition + 1;
                    yPosition = yPosition - 1;
                }
                }

                isFlying = true;
            }

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
        if(hasDestination){
            System.out.println("You already have a destination!");
        }else{
            Scanner inputReader  = new Scanner(System.in);
            System.out.println("Enter longitude:");
           int xPositionDestination = inputReader.nextInt();
            System.out.println("Enter latitude:");
           int yPositionDestination = inputReader.nextInt();
           hasDestination = true;
            System.out.println("You entered coordinates : " + xPositionDestination + " " + yPositionDestination);
    }
        var yesOrNo = JOptionPane.showConfirmDialog(null, "Do you want to take off?");
        if (yesOrNo == 0) {
            JOptionPane.showMessageDialog(null, "You chose to fly!");
            takeOff();
        }
        if (yesOrNo == 1) {
            JOptionPane.showMessageDialog(null, "You chose no.");
        }
        if (yesOrNo == 2) {
            JOptionPane.showMessageDialog(null, "You chose to cancel!");
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

