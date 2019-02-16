package com.main.weggies.wegmans;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

import javax.ws.rs.core.MediaType;

public class WegmansClient {
    public static final String PRODUCT_URL = "https://api.wegmans.io/products/";
    public static final String STORE_URL = "https://api.wegmans.io/stores/";
    public static final String API_VERSION = "api-version=2018-10-18";
    public static final String SUBSCRIPTION_KEY = "Subscription-Key=6d683e376a524292812c36cec365f288";

    protected Client client;

    public WegmansClient() {
        this.client = new Client();
    }

    private boolean isJSONValid(String test) {
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

    private String gzipToJson(InputStream requestStream) {
        try {
            InputStream inStream = new GZIPInputStream(requestStream);
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


    public String getJSON(String requestURL) {
        WebResource webResource = client.resource(requestURL);
        ClientResponse response = webResource.type(MediaType.APPLICATION_JSON_TYPE).get(ClientResponse.class);
        String rawResponse = response.getEntity(String.class);
        if(isJSONValid(rawResponse))
            return rawResponse;
        response = webResource.type(MediaType.APPLICATION_JSON_TYPE).get(ClientResponse.class);
        return gzipToJson(response.getEntityInputStream());
    }
}
