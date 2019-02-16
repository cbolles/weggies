package com.main.weggies.wegmans;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.main.weggies.model.product.KeywordResult;
import com.main.weggies.model.product.Product;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

import javax.ws.rs.core.MediaType;

public class ProductClient extends WegmansClient {

    private int storeId;

    public ProductClient(int storeId) {
        super();
        this.storeId = storeId;
    }

    private double getProductPrice(int productSKU) {

        String requestUrl = PRODUCT_URL + productSKU + "/prices/" + storeId + "?" + API_VERSION + "&" + SUBSCRIPTION_KEY;

        String jsonResponse = getJSON(requestUrl);

        try {
            JSONObject json = new JSONObject(jsonResponse);
            return json.getDouble("price");
        } catch(JSONException e) {
            //e.printStackTrace();
        }
        return -1;
    }

    public Product getProductById(int productId) {
        String requestUrl = PRODUCT_URL + productId + "?" + API_VERSION + "&" + SUBSCRIPTION_KEY;

        String jsonResponse = getJSON(requestUrl);

        // Create product object
        ObjectMapper mapper = new ObjectMapper();
        try {
            Product product = mapper.readValue(jsonResponse, Product.class);
            product.setPrice(getProductPrice(product.getSku()));
            return product;
        } catch(Exception e) {
            //e.printStackTrace();
        }
        return null;
    }

    public List<Product> getProductByKeyWord(String keyword) {
        String requestUrl = PRODUCT_URL + "search" + "?query=" + keyword + "&" + API_VERSION + "&" + SUBSCRIPTION_KEY;

        String jsonResponse = getJSON(requestUrl);

        // Create KeywordResult object
        ObjectMapper mapper = new ObjectMapper();
        try {
            KeywordResult keyWordSearch = mapper.readValue(jsonResponse, KeywordResult.class);
            List<Product> products = new ArrayList<>();
            for(Product unfinished : keyWordSearch.getResults())
                products.add(getProductById(unfinished.getSku()));
            return products;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
