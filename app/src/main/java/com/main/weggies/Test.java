package com.main.weggies;

import com.main.weggies.model.product.Product;
import com.main.weggies.wegmans.ShoppingCartClient;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ShoppingCartClient testClient = new ShoppingCartClient(68);
        List<Product> products = testClient.getShoppingCart();
        System.out.println(products.get(0).getPrice());
    }
}
