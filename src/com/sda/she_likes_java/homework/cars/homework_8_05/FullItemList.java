package com.sda.she_likes_java.homework.cars.homework_8_05;

import java.util.ArrayList;
import java.util.List;

public class FullItemList extends Item {
    ProductBook book1 = new ProductBook("Trainspotting by I.Welsh", 7.99, 1);
    Item book2 = new ProductBook("Ezers by B.Bellowa", 5.49, 2);
    Item misc1 = new ProductMisc("Pencil with rabbit", 0.29, 3);
    Item misc2 = new ProductMisc("Pencilcase blue", 9.49, 4);
    List<Item> fullItemList = List.of(book1, book2, misc1,misc2);


    public FullItemList(String productName, Double price, int productNumber) {
        super(productName, price, productNumber);
    }

}
