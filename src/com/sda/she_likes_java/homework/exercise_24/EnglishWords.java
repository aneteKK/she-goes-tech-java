package com.sda.she_likes_java.homework.exercise_24;

public class EnglishWords {
    String englishWord;

    String englishWordType;

    public EnglishWords(String englishWord, String englishWordType) {
        this.englishWord = englishWord;
        this.englishWordType = englishWordType;
    }

    @Override
    public String toString() {
        return "In English" +
                "word =" + englishWord + '\'' +
                " ( " + englishWordType + '\'' +
                " )";
    }
}
