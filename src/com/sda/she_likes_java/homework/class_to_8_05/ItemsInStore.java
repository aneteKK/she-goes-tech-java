package com.sda.she_likes_java.homework.class_to_8_05;

import java.util.ArrayList;
import java.util.List;
public class ItemsInStore extends Item{
    Item item1 = new Item("Lepnums un aizspriedumi", 10.49);
    Item item2 = new Item("Trainspotting", 12.29);
    Item item3 = new Item("Ezers", 5.49);
    Item item4 = new Item("Aitas medīšanas piedzīvojumi", 7.30);

    public List <Item> fullItemList = List.of(item1, item2, item3, item4);


    public ItemsInStore(String productName, double productPrice) {
        super(productName, productPrice);
    }

    public ItemsInStore() {

    }
}
