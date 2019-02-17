package com.main.weggies.model.recipe;

import com.main.weggies.model.product.Link;

import java.util.List;

public class Prerequisites {
    private String recipe;
    private List<Link> _links;

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public List<Link> get_links() {
        return _links;
    }

    public void set_links(List<Link> _links) {
        this._links = _links;
    }
}
