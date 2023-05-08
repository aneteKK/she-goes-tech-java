package com.sda.she_likes_java.homework.class_to_8_05;
import javax.swing.*;
public class ShoppingCartService {


    public ShoppingCart createShoppingCart(String customerName) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.ShoppingCartName = customerName + "Cart";
        return shoppingCart;
    }

    public void addItemToCart(ShoppingCart cart) {
        JFrame frame = new JFrame();
        ItemsInStore itemsInStore = new ItemsInStore();

        var output = JOptionPane.showInputDialog( frame, "Pick product to buy", "Choice", JOptionPane.QUESTION_MESSAGE,
                null, itemsInStore.fullItemList.toArray(), null);



     cart.productList.add((Item) output);

    }
public String shoppingCartSum(ShoppingCart cart){
            double productSum = 0;
        for (Item product : cart.productList){
            double productPrice = product.getProductPrice();
            productSum = productSum + productPrice;
        }
        return "You have to pay " + productSum;
}
    public void listCartItems(ShoppingCart cart) {

        for (int i = 0; i < cart.productList.size(); i++) {
            System.out.println(cart.productList.get(i));
        }


    }
}
