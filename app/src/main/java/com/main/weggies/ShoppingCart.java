package com.main.weggies;


import com.main.weggies.model.product.Product;


import android.os.Build;
import android.support.annotation.RequiresApi;
import java.util.HashMap;

/** Used to display products in your personal cart
 * Shopping cart is hashmap of <product, amount> of products
 * Each product has all of the information in it to look 'nice' in cart
 *
 * OPERATORS:
 * - addXProduct: Adds x amount of a product, increases size and total
 * - removeXProduct: Removes x amount of a product, increases size and total
 * - emptyCart: Completely empties the card, total set to zero, size set to zero
 */
public class ShoppingCart {
    private int size;
    private double total; //All item prices, + price*tax
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
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void addXProduct(Product item, int amount){
        size += amount;
        if (cart.containsKey(item)){

            cart.replace(item, cart.get(item).getPrice() + amount); //Keep an eye on this warning
        }
        else cart.put(item, amount);
        total += item.getPrice(); //TODO actually find a way to calculate total after add

    }

    /**
     * Removes product(s) from a cart
     * updates size and total
     * @param item a product
     * @param amount integer marking amount of products added
     */
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void removeXProduct(Product item, int amount){
        size -= amount;

        if ((int)cart.get(item) <= amount){
            cart.remove(item);
        }
        else cart.replace(item, (int)cart.get(item) - amount);

        total -=  item.getPrice(); //TODO actually find a way to calculator total after remove

    }

    public void emptyCart(){
        cart.clear();
    }

}

