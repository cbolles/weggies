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

public class ProductClient {
    private static final String PRODUCT_URL = "https://api.wegmans.io/products/";
    private static final String API_VERSION = "api-version=2018-10-18";
    private static final String SUBSCRIPTION_KEY = "Subscription-Key=6d683e376a524292812c36cec365f288";

    private Client client;
    private int storeId;

    public ProductClient(int storeId) {
        this.storeId = storeId;
        this.client = new Client();
    }

    private String getRawResponse(String requestUrl) {
        WebResource webResource = client.resource(requestUrl);
        ClientResponse response = webResource.type(MediaType.APPLICATION_JSON_TYPE).get(ClientResponse.class);
        return response.getEntity(String.class);
    }

    private String gzipToJson(String requestUrl) {
        WebResource webResource = client.resource(requestUrl);
        ClientResponse response = webResource.type(MediaType.APPLICATION_JSON_TYPE).get(ClientResponse.class);
        try {
            InputStream inStream = new GZIPInputStream(response.getEntityInputStream());
            byte[] buffer = new byte[4096];
            int bufferLength;
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            while((bufferLength = inStream.read(buffer)) > 0)
                outStream.write(buffer, 0, bufferLength);
            return new String(outStream.toByteArray(), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean isJSONValid(String test) {
        try {
            new JSONObject(test);
        } catch (JSONException ex) {
            try {
                new JSONArray(test);
            } catch (JSONException ex1) {
                return false;
            }
        }
        return true;
    }


    private double getProductPrice(int productSKU) {

        String requestUrl = PRODUCT_URL + productSKU + "/prices/" + storeId + "?" + API_VERSION + "&" + SUBSCRIPTION_KEY;

        String jsonResponse = getRawResponse(requestUrl);
        if(!isJSONValid(jsonResponse))
            jsonResponse = gzipToJson(requestUrl);
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

        String jsonResponse = getRawResponse(requestUrl);

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

        String jsonResponse = gzipToJson(requestUrl);

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
