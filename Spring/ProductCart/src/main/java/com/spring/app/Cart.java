package com.spring.app;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> productList;

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public double calculatePrice(){
        double total = 0.0;
        for(Product p : productList){
            total += p.getPrice();
        }
        return total;
    }
}
