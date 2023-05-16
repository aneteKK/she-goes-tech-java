package com.sda.she_likes_java.homework.exercise_24;

import javax.swing.*;

public class UserInterface {

    boolean translateToEnglish;

    public void translate() {
        String[] options = {"From Latvian to English", "From English to Latvian"};
        var dictionary = JOptionPane.showOptionDialog(null, "What do you want to translate?", "Select one:",
                0, 3, null, options, options[0]);
        if (dictionary == 0) {
            JOptionPane.showMessageDialog(null, "You chose to translate from Latvian to English");
            translateToEnglish = true;
            DictionaryService translateToEnglish = new DictionaryService();
            LatvianEnglishDictionary latvianEnglishDictionary = new LatvianEnglishDictionary();
            System.out.println(translateToEnglish.translateFromLatvianToEnglish(latvianEnglishDictionary.getLatvianEnglishDictionary(),getLatvianKey() ));
        }
        else if (dictionary == 1) {
            JOptionPane.showMessageDialog(null, "You chose to translate from English to Latvian");
            translateToEnglish = false;
            DictionaryService translateToLatvian = new DictionaryService();
            LatvianEnglishDictionary englishLatvianDictionary = new LatvianEnglishDictionary();
            System.out.println(translateToLatvian.translateFromEnglishToLatvian(englishLatvianDictionary.getEnglishLatvianDictionary(), getEnglishKey()));
        }
    }

    public LatvianWords getLatvianKey() {
        Dictionary dictionary = new Dictionary();
        dictionary.getLatvianKeyWords();

        LatvianWords[] choices = dictionary.getLatvianKeyWords();
        LatvianWords input = (LatvianWords) JOptionPane.showInputDialog(null, "Kādu vārdu vēlies iztulkot?", "Izvēle", JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]);

        if (input == dictionary.getLatvianKeyWords()[0]) {
            return choices[0];
        }
        if (input == dictionary.getLatvianKeyWords()[1]) {
            return choices[1];
        }
        if (input == dictionary.getLatvianKeyWords()[2]) {
            return choices[2];
        }
        if (input == dictionary.getLatvianKeyWords()[3]) {
            return choices[3];
        }
        if (input == dictionary.getLatvianKeyWords()[4]) {
            return choices[4];
        }
        if (input == dictionary.getLatvianKeyWords()[5]) {
            return choices[5];
        }
        if (input == dictionary.getLatvianKeyWords()[6]) {
            return choices[6];
        }
        if (input == dictionary.getLatvianKeyWords()[7]) {
            return choices[7];
        }
        if (input == dictionary.getLatvianKeyWords()[8]) {
            return choices[8];
        }
        if (input == dictionary.getLatvianKeyWords()[9]) {
            return choices[9];
        }
        return null;
    }
    public EnglishWords getEnglishKey() {
        Dictionary dictionary = new Dictionary();
        dictionary.getEnglishKeyWords();

        EnglishWords[] options = dictionary.getEnglishKeyWords();
        EnglishWords input = (EnglishWords) JOptionPane.showInputDialog(null, "Choose word to translate!", "Choice", JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

        if (input == dictionary.getEnglishKeyWords()[0]) {
            return options[0];
        }
        if (input == dictionary.getEnglishKeyWords()[1]) {
            return options[1];
        }
        if (input == dictionary.getEnglishKeyWords()[2]) {
            return options[2];
        }
        if (input == dictionary.getEnglishKeyWords()[3]) {
            return options[3];
        }
        if (input == dictionary.getEnglishKeyWords()[4]) {
            return options[4];
        }
        if (input == dictionary.getEnglishKeyWords()[5]) {
            return options[5];
        }
        if (input == dictionary.getEnglishKeyWords()[6]) {
            return options[6];
        }
        if (input == dictionary.getEnglishKeyWords()[7]) {
            return options[7];
        }
        if (input == dictionary.getEnglishKeyWords()[8]) {
            return options[8];
        }
        if (input == dictionary.getEnglishKeyWords()[9]) {
            return options[9];
        }


        return null;
    }

}






