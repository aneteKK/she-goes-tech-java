package com.sda.she_likes_java.homework.class_to_8_05;

public class Item {

   private String productName;

  private double productPrice;


   public Item(String productName, double productPrice) {
      this.productName = productName;
      this.productPrice = productPrice;
   }

    public Item() {
    }

   public String getProductName() {
      return productName;
   }

   public void setProductName(String productName) {
      this.productName = productName;
   }

   public double getProductPrice() {
      return productPrice;
   }

   public void setProductPrice(double productPrice) {
      this.productPrice = productPrice;
   }

    @Override
    public String toString() {
        return "Item in cart : " +
                "Name of item = " + productName + '\'' +
                "Item price EUR = " + productPrice +
                ';';
    }
}
