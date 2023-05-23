package com.sda.she_likes_java.homework.exercise_28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class FavoriteComposersTest {
    public static void main(String[] args) {
        FavoriteComposers beethoven = new FavoriteComposers("Ludwig", "van Beethoven");
        FavoriteComposers debussy = new FavoriteComposers("Claude", "Debussy");
        FavoriteComposers satie = new FavoriteComposers("Erik", "Satie");
        FavoriteComposers chopin = new FavoriteComposers("Frederic", "Chopin");

        List<FavoriteComposers> myFavoriteComposerList = new ArrayList<>();
        myFavoriteComposerList.add(beethoven);
        myFavoriteComposerList.add(debussy);
        myFavoriteComposerList.add(satie);
        myFavoriteComposerList.add(chopin);


        Collections.sort(myFavoriteComposerList, new FavoriteComposersCompareByNameLength());
        System.out.println(myFavoriteComposerList);
    }
}
