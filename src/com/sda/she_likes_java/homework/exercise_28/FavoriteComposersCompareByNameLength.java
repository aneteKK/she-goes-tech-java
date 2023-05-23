package com.sda.she_likes_java.homework.exercise_28;

import java.util.Comparator;

public class FavoriteComposersCompareByNameLength implements Comparator<FavoriteComposers> {



    @Override
    public int compare(FavoriteComposers o1, FavoriteComposers o2) {
        return o1.getFullName().length() - o2.getFullName().length();
    }
}
