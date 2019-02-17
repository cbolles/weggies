package com.main.weggies;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.main.weggies.model.store.Store;
import com.main.weggies.wegmans.StoreClient;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    float budget;
    int household;
    StoreClient storeClient = new StoreClient();
    List<Store> stores = storeClient.getStores();

    static String BUDGET = "com.main.weggies.BUDGET";
    static String HOUSEHOLD = "com.main.weggies.HOUSEHOLD";
    static String STORE = "com.main.weggies.STORE";

    LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);

    /**
     * Finds latitude and longitude of the user, used with storeLocation, sets to locationlistener
     */
    LocationListener locationListener = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {

        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onProviderDisabled(String provider) {

        }
    };

    /**
     * 'Makes the XML happen' Hendrick Ducasse, 7:25:10 PM
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void proceed(){
        Intent intent = new Intent(this, SetPreferences.class);
        EditText budgetTxt = (EditText)findViewById(R.id.budget);
        EditText householdTxt = (EditText)findViewById(R.id.household);

        int budget = Integer.parseInt(budgetTxt.getText().toString());
        int household = Integer.parseInt(householdTxt.getText().toString());
        Store store = getClosestStore(stores);

        intent.putExtra(BUDGET, budget);
        intent.putExtra(HOUSEHOLD, household);
        intent.putExtra(STORE, store.getNumber());

        startActivity(intent);

    }

    /**
     * Actually gets the user's location
     * @return user location in lat and lon
     */
    public storeLocation getUserLocation() {
        String locationProvider = LocationManager.GPS_PROVIDER;

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return new storeLocation(0, 0);
        }
        Location lastKnownLocation = locationManager.getLastKnownLocation(locationProvider);

        double latitude = lastKnownLocation.getLatitude();
        double longitude = lastKnownLocation.getLongitude();

        return new storeLocation(latitude, longitude);
    }

    /**
     * Given an arraylist of all store gps locations, find the one with smallest distance from user
     * @param stores
     * @return singular store of which is closest
     * //TODO Create a list of closest to furthest stores in a method somewhere
     */
    public Store getClosestStore(ArrayList<Store> stores) {
        Store closestStore = null;
        for (Store store : stores) {
            if (closestStore == null) {
                closestStore = store;
            } else {
                if (getUserLocation().distance(store) < getUserLocation().distance(closestStore)) {
                    closestStore = store;
                }
            }


        }
        return closestStore;
    }




}
