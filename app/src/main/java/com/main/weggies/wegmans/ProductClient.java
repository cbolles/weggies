package com.main.weggies.wegmans;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.main.weggies.model.product.Product;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import javax.ws.rs.core.MediaType;

public class ProductClient {
    private static final String PRODUCT_URL = "https://api.wegmans.io/products/";
    private static final String API_VERSION = "api-version=2018-10-18";
    private static final String SUBSCRIPTION_KEY = "Subscription-Key=6d683e376a524292812c36cec365f288";

    private Client client;

    public ProductClient() {
        this.client = new Client();
    }

    public Product getProductById(int productId) {
        String requestUrl = PRODUCT_URL + productId + "?" + API_VERSION + "&" + SUBSCRIPTION_KEY;

        // Make request
        WebResource webResource = client.resource(requestUrl);
        ClientResponse response = webResource.type(MediaType.APPLICATION_JSON_TYPE).get(ClientResponse.class);
        String jsonResponse = response.getEntity(String.class);

        // Create product object
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(jsonResponse, Product.class);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
