package com.main.weggies.model.recipe;

import com.main.weggies.model.product.Link;

import java.util.List;

public class Ingredient {
    private String group;
    private String type;
    private String name;
    private Quantity quantity;
    private int displayOrder;
    private int sku;
    private int skuQuantity;
    private List<Link> _links;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public int getSkuQuantity() {
        return skuQuantity;
    }

    public void setSkuQuantity(int skuQuantity) {
        this.skuQuantity = skuQuantity;
    }

    public List<Link> get_links() {
        return _links;
    }

    public void set_links(List<Link> _links) {
        this._links = _links;
    }
}
