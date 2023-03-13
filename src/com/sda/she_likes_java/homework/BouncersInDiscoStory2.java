package com.sda.she_likes_java.homework;
import javax.swing.*;
public class BouncersInDiscoStory2 {
    public static void sneakIn(){
        String[] sneakIn = {"I'll try my luck with old bouncer!", "I will go home and cry"};
                var choice = JOptionPane.showOptionDialog(null, "Try to sneak in?", "Select one:", 0, 3, null, sneakIn, sneakIn[0]);
        if ( choice == 0){
            JOptionPane.showMessageDialog(null, "Come inside!");
        }
        if (choice == 1){
            JOptionPane.showMessageDialog(null, "Ok, here are some tissues");
        }
    }
    public static void main(String[] args) {

        var name = JOptionPane.showInputDialog("What is your name?");
        var output = name + " nice to meet You!";
        JOptionPane.showMessageDialog(null, output);

        String[] options = {"old bouncer", "young bouncer"};
        var bouncer = JOptionPane.showOptionDialog(null, "Which bouncer will you approach?", "Select one:",
                0, 3, null, options, options[0]);
        if (bouncer == 0) {
            JOptionPane.showMessageDialog(null, name + ", you chose old bouncer, his eyesight is bad, you're lucky, go inside!");
        }
        if (bouncer == 1) {
            JOptionPane.showMessageDialog(null, "You chose young bouncer!");

            String[] singerOptions = {"Yes, I'm a singer", "No, bear stepped on my ear"};
            var singer = JOptionPane.showOptionDialog(null, "Can You sing?", "Select one:",
                    0, 3, null, singerOptions, singerOptions[0]);
            if (singer == 1) {
                JOptionPane.showMessageDialog(null, "Go home!");
                sneakIn();
            }
           if(singer == 0){
               String [] ageCheck = {"I'm more than 18 years old", "You got me, I'm still underage"};
               var age = JOptionPane.showOptionDialog(null, "Are you of age?", "Select one:",
                       0, 3, null, ageCheck, ageCheck[0]);


               if(age==1){
                   JOptionPane.showMessageDialog(null,"You're just a kid, go home!");
                   sneakIn();
               }
               if(age == 0){
                   JOptionPane.showMessageDialog(null, "Good, now I just have to check your height.");

                   String[]heightCheck = {"I'm over 160cm!", "I'm short, so what?!?"};
                   var height = JOptionPane.showOptionDialog(null, "How tall are you?", "Select one", 0, 3, null, heightCheck, heightCheck[0] );

                   if(height == 0){
                       JOptionPane.showMessageDialog(null, "Great, come inside!");
                   }
                   if(height == 1){
                       JOptionPane.showMessageDialog(null,"Go home shorty!");
                       sneakIn();
                   }
               }
           }

        }
    }
}