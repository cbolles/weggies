package com.main.weggies.wegmans;

import com.main.weggies.model.product.Product;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartClient extends WegmansClient {

    private int storeId;

    public ShoppingCartClient(int storeId) {
        super();
        this.storeId = storeId;
    }

    public List<Product> getShoppingCart() {
        String jsonResponse = getJSON(SHOPPING_CART_URL);

        try {
            JSONArray jsonArray = new JSONArray(jsonResponse);
            List<Integer> productIds = new ArrayList<>();
            for(int i = 0; i < jsonArray.length(); i++) {
                productIds.add(jsonArray.getInt(i));
            }
            List<Product> products = new ArrayList<>();
            ProductClient productClient = new ProductClient(storeId);
            for(Integer id : productIds)
                products.add(productClient.getProductById(id));
            return products;
        } catch(JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
