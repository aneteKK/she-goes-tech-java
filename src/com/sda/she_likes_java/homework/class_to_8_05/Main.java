package com.sda.she_likes_java.homework.class_to_8_05;

import java.util.List;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ShoppingCart myShoppingCart = new ShoppingCart();
        Item milk = new Item("Piens", 1.49);
        Item bread = new Item("Maize", 2.49);
        ShoppingCartService service = new ShoppingCartService();
        ShoppingCart anetesGrozs = service.createShoppingCart("Anetes grozs");
        service.addItemToCart(anetesGrozs, milk);
        service.addItemToCart(anetesGrozs,bread);
        service.listCartItems(anetesGrozs);

        ShoppingCart robertaGrozs = service.createShoppingCart("Roberta grozs");
        service.addItemToCart(robertaGrozs, bread);
        service.listCartItems(robertaGrozs);



//        myShoppingCart.createShoppingCart("myShoppingCart");
//        myShoppingCart.addItemToCart(milk);
//        myShoppingCart.addItemToCart(bread);
//
//        ShoppingCart yourShoppingCart = new ShoppingCart();
//        yourShoppingCart.addItemToCart(milk);
//
//       yourShoppingCart.listCartItems();
//       myShoppingCart.listCartItems();



    }


}
