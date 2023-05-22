package com.sda.she_likes_java.sorting;

import java.util.Comparator;

public class LexicalOrderForSortedPerson implements Comparator<SortedPerson> {
    @Override
    public int compare(SortedPerson o1, SortedPerson o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
