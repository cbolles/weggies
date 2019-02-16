package com.main.weggies.model.product;

public class Nutrients {
    private String type;
    private String quantity;
    private String precision;
    private float dailyValuePercent;
    private String dailyValueReference;
    private Size itemQuantity;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrecision() {
        return precision;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }

    public float getDailyValuePercent() {
        return dailyValuePercent;
    }

    public void setDailyValuePercent(float dailyValuePercent) {
        this.dailyValuePercent = dailyValuePercent;
    }

    public String getDailyValueReference() {
        return dailyValueReference;
    }

    public void setDailyValueReference(String dailyValueReference) {
        this.dailyValueReference = dailyValueReference;
    }

    public Size getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Size itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
}
