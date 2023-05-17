package com.sda.she_likes_java.homework.exercise_24;

public class LatvianWords {
    String latvianWord;
     String latvianWordType;

    public LatvianWords(String latvianWord, String latvianWordType) {
        this.latvianWord = latvianWord;
        this.latvianWordType = latvianWordType;
    }

    @Override
    public String toString() {
        return "Latviski " +
                "vārds ='" + latvianWord + '\'' +
                " (" + latvianWordType + '\'' +
                ')';
    }

    public String getLatvianWord() {
        return latvianWord;
    }

    public void setLatvianWord(String latvianWord) {
        this.latvianWord = latvianWord;
    }

    public String getLatvianWordType() {
        return latvianWordType;
    }

    public void setLatvianWordType(String latvianWordType) {
        this.latvianWordType = latvianWordType;
    }


}
