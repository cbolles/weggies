package com.main.weggies.model.product;

import java.util.List;

public class TradeIdentifier {
    private List<String> images;
    private List<Barcode> barcodes;
    private Size height;
    private Size width;
    private Size weight;

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<Barcode> getBarcodes() {
        return barcodes;
    }

    public void setBarcodes(List<Barcode> barcodes) {
        this.barcodes = barcodes;
    }

    public Size getHeight() {
        return height;
    }

    public void setHeight(Size height) {
        this.height = height;
    }

    public Size getWidth() {
        return width;
    }

    public void setWidth(Size width) {
        this.width = width;
    }

    public Size getWeight() {
        return weight;
    }

    public void setWeight(Size weight) {
        this.weight = weight;
    }
}
