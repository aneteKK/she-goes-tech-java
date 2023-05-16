package com.sda.she_likes_java.homework.exercise_24;


import java.util.HashMap;

public class LatvianEnglishDictionary {

    HashMap <LatvianWords, EnglishWords> latvianEnglishDictionary = new HashMap<>();
    HashMap <EnglishWords, LatvianWords> englishLatvianDictionary = new HashMap<>();

    public HashMap<LatvianWords, EnglishWords> getLatvianEnglishDictionary() {
        return latvianEnglishDictionary;
    }

    public void setLatvianEnglishDictionary(HashMap<LatvianWords, EnglishWords> latvianEnglishDictionary) {
        this.latvianEnglishDictionary = latvianEnglishDictionary;
    }

    public HashMap<EnglishWords, LatvianWords> getEnglishLatvianDictionary() {
        return englishLatvianDictionary;
    }

    public void setEnglishLatvianDictionary(HashMap<EnglishWords, LatvianWords> englishLatvianDictionary) {
        this.englishLatvianDictionary = englishLatvianDictionary;
    }

}
