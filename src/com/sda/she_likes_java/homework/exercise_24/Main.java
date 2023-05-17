package com.sda.she_likes_java.homework.exercise_24;

import java.util.HashMap;

public class Main {
//    Create a class English-Lithuanian dictionary.
//    Requirements:
//            - the class has a translate method that takes an English word as an argument;
//- add support for 10 words;
//- if the user asks for an unsupported word - add a message about the lack of support.
//    Create a class Main and check the functionality of your class.
public static void main(String[] args) {

 LatvianEnglishDictionary dictionary = new LatvianEnglishDictionary();


 HashMap <LatvianWords, EnglishWords> latvianEnglishDictionary = new HashMap<>();


 latvianEnglishDictionary.put(dictionary.kakis, dictionary.cat);
 latvianEnglishDictionary.put(dictionary.suns, dictionary.dog);
 latvianEnglishDictionary.put(dictionary.zakis, dictionary.hare);
 latvianEnglishDictionary.put(dictionary.lapsa, dictionary.fox);
 latvianEnglishDictionary.put(dictionary.putns, dictionary.bird);
 latvianEnglishDictionary.put(dictionary.tigeris, dictionary.tiger);
 latvianEnglishDictionary.put(dictionary.valis, dictionary.whale);
 latvianEnglishDictionary.put(dictionary.vienradzis, dictionary.unicorn);
 latvianEnglishDictionary.put(dictionary.vilks,dictionary.wolf);
 latvianEnglishDictionary.put(dictionary.lacis, dictionary.bear);



 HashMap <EnglishWords, LatvianWords> englishLatvianDictionary = new HashMap<>();


 englishLatvianDictionary.put(dictionary.cat, dictionary.kakis);
 englishLatvianDictionary.put(dictionary.dog, dictionary.suns);
 englishLatvianDictionary.put(dictionary.hare, dictionary.zakis);
 englishLatvianDictionary.put(dictionary.fox, dictionary.lapsa);
 englishLatvianDictionary.put(dictionary.bird, dictionary.putns);
 englishLatvianDictionary.put(dictionary.tiger, dictionary.tigeris);
 englishLatvianDictionary.put(dictionary.whale, dictionary.valis);
 englishLatvianDictionary.put(dictionary.unicorn, dictionary.vienradzis);
 englishLatvianDictionary.put(dictionary.wolf, dictionary.vilks);
 englishLatvianDictionary.put(dictionary.bear, dictionary.lacis);


 UserInterface newUserInterface = new UserInterface();
 newUserInterface.translate(latvianEnglishDictionary, dictionary ,englishLatvianDictionary);
 newUserInterface.translate(latvianEnglishDictionary, dictionary ,englishLatvianDictionary);
 newUserInterface.translate(latvianEnglishDictionary, dictionary ,englishLatvianDictionary);
}
}
