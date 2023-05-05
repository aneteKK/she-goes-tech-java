package com.sda.she_likes_java.homework.class_to_8_05;

import javax.swing.*;

public class CustomerService {
    public Customer createCustomer() {
        var newCustomerName = JOptionPane.showInputDialog("What is your name?");
        var output = newCustomerName + " , nice to meet you!";
        JOptionPane.showMessageDialog(null, output);

        Customer newCustomer = new Customer();
        newCustomer.setName(newCustomerName);

        return newCustomer;
    }

}
