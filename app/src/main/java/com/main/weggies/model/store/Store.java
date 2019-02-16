package com.main.weggies.model.store;

import com.main.weggies.model.product.Link;

import java.util.List;

public class Store {
    private int number;
    private String name;
    private String type;
    private float latitude;
    private float longitude;
    private boolean hasPharmacy;
    private float salesTaxPercentage;
    private long totalSquareFootage;
    private Address address;
    private List<Link> _links;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public boolean isHasPharmacy() {
        return hasPharmacy;
    }

    public void setHasPharmacy(boolean hasPharmacy) {
        this.hasPharmacy = hasPharmacy;
    }

    public float getSalesTaxPercentage() {
        return salesTaxPercentage;
    }

    public void setSalesTaxPercentage(float salesTaxPercentage) {
        this.salesTaxPercentage = salesTaxPercentage;
    }

    public long getTotalSquareFootage() {
        return totalSquareFootage;
    }

    public void setTotalSquareFootage(long totalSquareFootage) {
        this.totalSquareFootage = totalSquareFootage;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Link> get_links() {
        return _links;
    }

    public void set_links(List<Link> _links) {
        this._links = _links;
    }
}
