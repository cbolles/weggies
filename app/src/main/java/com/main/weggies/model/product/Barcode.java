package com.main.weggies.model.product;

import java.util.List;

public class Barcode {
    private String barcode;
    private List<Link> _links;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public List<Link> get_links() {
        return _links;
    }

    public void set_links(List<Link> _links) {
        this._links = _links;
    }
}
