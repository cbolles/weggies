package com.main.weggies;

import com.main.weggies.model.store.Store;

import java.lang.Math;

public class storeLocation {
    double lat;
    double lon;

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public double distance(Store store){
        storeLocation location2 = new storeLocation(store.getLatitude(), store.getLongitude());
        return (Math.sqrt(Math.pow(location2.lat, 2) + Math.pow(location2.lon, 2)));
    }

    public storeLocation(double lat, double lon){
        this.lat = lat;
        this.lon = lon;
    }
}
