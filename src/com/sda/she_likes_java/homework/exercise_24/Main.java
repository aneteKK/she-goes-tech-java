package com.sda.she_likes_java.homework.exercise_24;

public class Main {
//    Create a class English-Lithuanian dictionary.
//    Requirements:
//            - the class has a translate method that takes an English word as an argument;
//- add support for 10 words;
//- if the user asks for an unsupported word - add a message about the lack of support.
//    Create a class Main and check the functionality of your class.
public static void main(String[] args) {


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

    LatvianWords[] latvianKeyList = {kakis, suns, zakis,lapsa, putns, tigeris, valis, vienradzis, vilks, lacis};

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



    LatvianEnglishDictionary newLatvianEnglishDictionary = new LatvianEnglishDictionary();
    newLatvianEnglishDictionary.getLatvianEnglishDictionary().put(kakis, cat);
    newLatvianEnglishDictionary.getLatvianEnglishDictionary().put(suns, dog);
    newLatvianEnglishDictionary.getLatvianEnglishDictionary().put(zakis, hare);
    newLatvianEnglishDictionary.getLatvianEnglishDictionary().put(lapsa, fox);
    newLatvianEnglishDictionary.getLatvianEnglishDictionary().put(putns, bird);
    newLatvianEnglishDictionary.getLatvianEnglishDictionary().put(tigeris, tiger);
    newLatvianEnglishDictionary.getLatvianEnglishDictionary().put(valis, whale);
    newLatvianEnglishDictionary.getLatvianEnglishDictionary().put(vienradzis, unicorn);
    newLatvianEnglishDictionary.getLatvianEnglishDictionary().put(vilks, wolf);
    newLatvianEnglishDictionary.getLatvianEnglishDictionary().put(lacis, bear);

    LatvianEnglishDictionary newEnglishLatvianDictionary = new LatvianEnglishDictionary();
    newEnglishLatvianDictionary.getEnglishLatvianDictionary().put(cat, kakis);
    newEnglishLatvianDictionary.getEnglishLatvianDictionary().put(dog, suns);
    newEnglishLatvianDictionary.getEnglishLatvianDictionary().put(hare, zakis);
    newEnglishLatvianDictionary.getEnglishLatvianDictionary().put(fox, lapsa);
    newEnglishLatvianDictionary.getEnglishLatvianDictionary().put(bird, putns);
    newEnglishLatvianDictionary.getEnglishLatvianDictionary().put(tiger, tigeris);
    newEnglishLatvianDictionary.getEnglishLatvianDictionary().put(whale, valis);
    newEnglishLatvianDictionary.getEnglishLatvianDictionary().put(unicorn, vienradzis);
    newEnglishLatvianDictionary.getEnglishLatvianDictionary().put(wolf, vilks);
    newEnglishLatvianDictionary.getEnglishLatvianDictionary().put(bear, lacis);

 UserInterface newUserInterface = new UserInterface();
 newUserInterface.translate();
}
}
