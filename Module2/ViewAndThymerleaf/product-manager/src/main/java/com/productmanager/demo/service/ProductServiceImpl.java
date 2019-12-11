package com.productmanager.demo.service;

import com.productmanager.demo.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"name1",900000,"available"));
        products.put(2,new Product(2,"name2",900000,"available"));
        products.put(3,new Product(3,"name3",900000,"available"));
        products.put(4,new Product(4,"name4",900000,"available"));
        products.put(5,new Product(5,"name5",900000,"available"));
        products.put(6,new Product(6,"name6",900000,"available"));
        products.put(7,new Product(7,"name7",900000,"available"));
        products.put(8,new Product(8,"name8",900000,"available"));
        products.put(9,new Product(9,"name9",900000,"available"));
        products.put(10,new Product(10,"name10",900000,"available"));
        products.put(11,new Product(11,"name11",900000,"available"));
        products.put(12,new Product(12,"name12",900000,"available"));
        products.put(13,new Product(13,"name13",900000,"available"));
        products.put(14,new Product(14,"name14",900000,"available"));
        products.put(15,new Product(15,"name15",900000,"available"));
        products.put(16,new Product(16,"name16",900000,"available"));
        products.put(17,new Product(17,"name17",900000,"available"));
        products.put(18,new Product(18,"name18",900000,"available"));
        products.put(19,new Product(19,"name19",900000,"available"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
