package com.main.weggies.model.recipe;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.main.weggies.model.product.Link;

import java.util.List;

public class Recipe {
    private long id;
    private String type;
    private String name;
    private List<String> wellnessKeys;
    private Serving servings;
    private MinMax preparationTime;
    private MinMax cookingTime;
    private Promotion promotions;
    private Nutrition nutrition;
    private List<Ingredient> ingredients;
    private Instructions instructions;
    @JsonIgnore
    private List<Link> _links;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public List<String> getWellnessKeys() {
        return wellnessKeys;
    }

    public void setWellnessKeys(List<String> wellnessKeys) {
        this.wellnessKeys = wellnessKeys;
    }

    public Serving getServings() {
        return servings;
    }

    public void setServings(Serving servings) {
        this.servings = servings;
    }

    public MinMax getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(MinMax preparationTime) {
        this.preparationTime = preparationTime;
    }

    public MinMax getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(MinMax cookingTime) {
        this.cookingTime = cookingTime;
    }

    public Promotion getPromotions() {
        return promotions;
    }

    public void setPromotions(Promotion promotions) {
        this.promotions = promotions;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Instructions getInstructions() {
        return instructions;
    }

    public void setInstructions(Instructions instructions) {
        this.instructions = instructions;
    }

    public List<Link> get_links() {
        return _links;
    }

    public void set_links(List<Link> _links) {
        this._links = _links;
    }

    @Override
    public String toString(){
        return (getName() + "(" + getServings() + ")");
    }
}
