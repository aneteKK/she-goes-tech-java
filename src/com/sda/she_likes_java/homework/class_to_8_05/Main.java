package com.sda.she_likes_java.homework.class_to_8_05;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello! Nice to see you");
        CustomerService customerService = new CustomerService();
        Customer customer = customerService.createCustomer();
        ShoppingCartService shoppingCartService = new ShoppingCartService();
        ShoppingCart shoppingCart = shoppingCartService.createShoppingCart(customer.getName());

        shoppingCartService.addItemToCart(shoppingCart);
        shoppingCartService.addItemToCart(shoppingCart);
        shoppingCartService.addItemToCart(shoppingCart);

        shoppingCartService.listCartItems(shoppingCart);
        System.out.println(shoppingCartService.shoppingCartSum(shoppingCart));

    }
    }



