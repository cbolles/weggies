package com.main.weggies.wegmans;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.main.weggies.model.store.Store;
import com.main.weggies.model.store.StoreRequest;
import com.sun.jersey.api.client.Client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StoreClient extends WegmansClient {

    public Store getStoreByNumber(int storeNumber) {
        String requestURL = STORE_URL + storeNumber + "?" + API_VERSION + "&" + SUBSCRIPTION_KEY;

        String jsonResponse = getJSON(requestURL);

        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(jsonResponse, Store.class);
        } catch(IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Store> getStores() {
        String requestUrl = STORE_URL + "?" + API_VERSION + "&" + SUBSCRIPTION_KEY;

        String jsonResponse = getJSON(requestUrl);

        try {
            ObjectMapper mapper = new ObjectMapper();
            StoreRequest storeRequest = mapper.readValue(jsonResponse, StoreRequest.class);
            List<Store> stores = new ArrayList<>();
            for(Store store : storeRequest.getStores())
                stores.add(getStoreByNumber(store.getNumber()));
            return stores;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
