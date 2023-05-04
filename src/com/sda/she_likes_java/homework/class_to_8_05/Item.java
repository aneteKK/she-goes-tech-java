package com.sda.she_likes_java.homework.class_to_8_05;

public class Item {

   private String productName;

  private double productPrice;


   public Item(String productName, double productPrice) {
      this.productName = productName;
      this.productPrice = productPrice;
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
        return "Item{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
