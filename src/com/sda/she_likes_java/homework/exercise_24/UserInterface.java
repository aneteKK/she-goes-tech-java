package com.sda.she_likes_java.homework.exercise_24;

import javax.swing.*;
import java.util.HashMap;

public class UserInterface {

    boolean translateToEnglish;

    public void translate(HashMap<LatvianWords, EnglishWords> latvianEnglishDictionary, LatvianEnglishDictionary dictionary, HashMap<EnglishWords, LatvianWords> englishLatvianDictionary) {
        String[] options = {"From Latvian to English", "From English to Latvian"};
        var dictionaryOption = JOptionPane.showOptionDialog(null, "What do you want to translate?", "Select one:",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (dictionaryOption == 0) {
            JOptionPane.showMessageDialog(null, "You chose to translate from Latvian to English");
            translateToEnglish = true;
            DictionaryService translateToEnglish = new DictionaryService();

            System.out.println(translateToEnglish.translateFromLatvianToEnglish(latvianEnglishDictionary, getLatvianKey(dictionary)));
        } else if (dictionaryOption == 1) {
            JOptionPane.showMessageDialog(null, "You chose to translate from English to Latvian");
            translateToEnglish = false;
            DictionaryService translateToLatvian = new DictionaryService();

            System.out.println(translateToLatvian.translateFromEnglishToLatvian(englishLatvianDictionary, getEnglishKey(dictionary)));
        }
    }

    public LatvianWords getLatvianKey(LatvianEnglishDictionary dictionary) {
        LatvianWords[] choices = dictionary.listOfLatvianKey();
        LatvianWords input = (LatvianWords) JOptionPane.showInputDialog(null, "Kādu vārdu vēlies iztulkot?", "Izvēle", JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]);

        if (input == dictionary.listOfLatvianKey()[0]) {
            return choices[0];
        }
        if (input == dictionary.listOfLatvianKey()[1]) {
            return choices[1];
        }
        if (input == dictionary.listOfLatvianKey()[2]) {
            return choices[2];
        }
        if (input == dictionary.listOfLatvianKey()[3]) {
            return choices[3];
        }
        if (input == dictionary.listOfLatvianKey()[4]) {
            return choices[4];
        }
        if (input == dictionary.listOfLatvianKey()[5]) {
            return choices[5];
        }
        if (input == dictionary.listOfLatvianKey()[6]) {
            return choices[6];
        }
        if (input == dictionary.listOfLatvianKey()[7]) {
            return choices[7];
        }
        if (input == dictionary.listOfLatvianKey()[8]) {
            return choices[8];
        }
        if (input == dictionary.listOfLatvianKey()[9]) {
            return choices[9];
        }
        return null;
    }

    public EnglishWords getEnglishKey(LatvianEnglishDictionary dictionary) {


        EnglishWords[] options = dictionary.listEnglishKey();
        EnglishWords input = (EnglishWords) JOptionPane.showInputDialog(null, "Choose word to translate!", "Choice", JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

        if (input == dictionary.listEnglishKey()[0]) {
            return options[0];
        }
        if (input == dictionary.listEnglishKey()[1]) {
            return options[1];
        }
        if (input == dictionary.listEnglishKey()[2]) {
            return options[2];
        }
        if (input == dictionary.listEnglishKey()[3]) {
            return options[3];
        }
        if (input == dictionary.listEnglishKey()[4]) {
            return options[4];
        }
        if (input == dictionary.listEnglishKey()[5]) {
            return options[5];
        }
        if (input == dictionary.listEnglishKey()[6]) {
            return options[6];
        }
        if (input == dictionary.listEnglishKey()[7]) {
            return options[7];
        }
        if (input == dictionary.listEnglishKey()[8]) {
            return options[8];
        }
        if (input == dictionary.listEnglishKey()[9]) {
            return options[9];
        }


        return null;
    }

}






