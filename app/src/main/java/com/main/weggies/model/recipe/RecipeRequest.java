package com.main.weggies.model.recipe;

import java.util.List;

public class RecipeRequest {
    private List<Recipe> recipes;

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }
}
