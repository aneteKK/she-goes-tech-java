package com.sda.she_likes_java.homework.class_to_8_05;

public class ShoppingCartService {


    public ShoppingCart createShoppingCart(String cartName) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.ShoppingCartName = cartName;

        return shoppingCart;
    }

    public void addItemToCart(ShoppingCart cart, Item item) {
        cart.productList.add(item);

    }

    public void listCartItems(ShoppingCart cart) {

        for (int i = 0; i < cart.productList.size(); i++) {
            System.out.println(cart.productList.get(i));
        }


    }
}
