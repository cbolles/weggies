package com.main.weggies;

import java.util.HashMap;

/** Used to display products in your personal cart
 * Shopping cart is hashmap of <product, amount> of products
 * Each product has all of the information in it to look 'nice' in cart
 *
 * OPERATORS:
 * - addXProduct: Adds x amount of a product, increases size and total
 * - removeXProduct: Removes x amount of a product, increases size and total
 */
public class ShoppingCart {
    private int size;
    private double total;
    private HashMap cart; //TODO specify as product, amount

    /**
     * ShoppingCart constructor
     * Generates initial size(0), cart total(0.0) and a default Hmap representing the cart
     */
    public ShoppingCart(){
        size = 0;
        total = 0.0;
        cart = new HashMap();
    }

    /**
     * Adds product(s) to a cart
     * updates size and total
     * @param item a product
     * @param amount integer marking amount of products added
     */
    public void addXProduct(Product item, int amount){
        size += amount;

    }

    /**
     * Removes product(s) from a cart
     * updates size and total
     * @param item a product
     * @param amount integer marking amount of products added
     */
    public void removeXProduct(Product item, int amount){

    }

}

