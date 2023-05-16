package com.sda.she_likes_java.homework.exercise_24;

import java.util.HashMap;

public class DictionaryService {

    public String translateFromLatvianToEnglish(HashMap<LatvianWords, EnglishWords> dictionary, LatvianWords latvianWord){

       EnglishWords translatedToEnglish = dictionary.get(latvianWord);
        return translatedToEnglish.toString();
    }


    public String translateFromEnglishToLatvian(HashMap<EnglishWords, LatvianWords> dictionary, EnglishWords englishWord){

        LatvianWords translatedToLatvian = dictionary.get(englishWord);
        return translatedToLatvian.toString();
    }
}


