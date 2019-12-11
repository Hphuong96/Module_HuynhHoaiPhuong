package com.productmanager.demo.model;

public class Product {
    private int id;
    private String productName;
    private double price;
    private String product_description;

    public Product() {
    }

    public Product(int id, String productName, double price, String product_description) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.product_description = product_description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }
}
