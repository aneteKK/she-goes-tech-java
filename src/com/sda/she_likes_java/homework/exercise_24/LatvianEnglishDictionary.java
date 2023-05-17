package com.sda.she_likes_java.homework.exercise_24;


import java.util.HashMap;

public class LatvianEnglishDictionary {




    LatvianWords kakis = new LatvianWords("kaķis", "lietvārds");
    LatvianWords suns = new LatvianWords("suns", "lietvārds");
    LatvianWords zakis = new LatvianWords("zaķis", "lietvārds");
    LatvianWords lapsa = new LatvianWords("lapsa", "lietvārds");
    LatvianWords putns = new LatvianWords("putns", "lietvārds");
    LatvianWords tigeris = new LatvianWords("tīģeris", "lietvārds");
    LatvianWords valis = new LatvianWords("valis", "lietvārds");
    LatvianWords vienradzis = new LatvianWords("vienradzis", "lietvārds");
    LatvianWords vilks = new LatvianWords("vilks", "lietvārds");
    LatvianWords lacis = new LatvianWords("lacis", "lietvārds");

    EnglishWords cat = new EnglishWords("cat", "noun");
    EnglishWords dog = new EnglishWords("dog", "noun");
    EnglishWords hare = new EnglishWords("hare", "noun");
    EnglishWords fox = new EnglishWords("fox", "noun");
    EnglishWords bird = new EnglishWords("bird", "noun");
    EnglishWords tiger = new EnglishWords("tiger", "noun");
    EnglishWords whale = new EnglishWords("whale", "noun");
    EnglishWords unicorn = new EnglishWords("unicorn", "noun");
    EnglishWords wolf = new EnglishWords("wolf", "noun");
    EnglishWords bear = new EnglishWords("bear", "noun");

    LatvianWords[] latvianKeyList = {kakis, suns, zakis, lapsa, putns, tigeris, valis, vienradzis, vilks, lacis};
     EnglishWords[] englishKey = {cat, dog, hare, fox, bird, tiger, whale, unicorn, wolf, bear};


    public LatvianWords[] listOfLatvianKey(){
        LatvianWords[] latvianKeyList = {kakis, suns, zakis, lapsa, putns, tigeris, valis, vienradzis, vilks, lacis};
        return latvianKeyList;
    }

    public EnglishWords[] listEnglishKey( ){
        EnglishWords[] englishKey = {cat, dog, hare, fox, bird, tiger, whale, unicorn, wolf, bear};
        return englishKey;
    }




}
