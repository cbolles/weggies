package com.main.weggies.model.product;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

public class Product {
    private int sku;
    private String name;
    private Description descriptions;
    private String brand;
    private Size size;
    private String status;
    private String wellnessKeys;
    private String countryOfOrigin;
    private String disclaimer;
    private boolean isRaw;
    private boolean isMsgFree;
    private boolean isAntibioticFree;
    private boolean isCornFree;
    private boolean isLactoovoVegetarian;
    private boolean isFairtrade;
    private boolean isIrradiated;
    private boolean isCertifiedHumane;
    private boolean isWildCaught;
    private boolean hasNoAddedHormones;
    private float averageSellableWeight;
    private String alcohol;
    private List<String> diets;
    private List<String> additives;
    private List<String> allergens;
    private List<String> ingredients;
    private List<Nutrients> nutrients;
    private List<String> nutrition;
    private Organic organic;
    private Preparation preparation;
    private Servings servings;
    private List<TradeIdentifier> tradeIdentifiers;
    private List<State> states;
    private List<Link> _links;
    @JsonIgnore
    private double price;

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Description getDescriptions() {
        return descriptions;
    }

    public void setDescription(Description descriptions) {
        this.descriptions = descriptions;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWellnessKeys() {
        return wellnessKeys;
    }

    public void setWellnessKeys(String wellnessKeys) {
        this.wellnessKeys = wellnessKeys;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public boolean getIsRaw() {
        return isRaw;
    }

    public void setRaw(boolean raw) {
        isRaw = raw;
    }

    public boolean getIsMsgFree() {
        return isMsgFree;
    }

    public void setMsgFree(boolean msgFree) {
        isMsgFree = msgFree;
    }

    public boolean getIsAntibioticFree() {
        return isAntibioticFree;
    }

    public void setAntibioticFree(boolean antibioticFree) {
        isAntibioticFree = antibioticFree;
    }

    public boolean getIsCornFree() {
        return isCornFree;
    }

    public void setCornFree(boolean cornFree) {
        isCornFree = cornFree;
    }

    public boolean getIsLactoovoVegetarian() {
        return isLactoovoVegetarian;
    }

    public void setLactoovoVegetarian(boolean lactoovoVegetarian) {
        isLactoovoVegetarian = lactoovoVegetarian;
    }

    public boolean getIsFairtrade() {
        return isFairtrade;
    }

    public void setIsFairtrade(boolean fairtrade) {
        isFairtrade = fairtrade;
    }

    public boolean getIsIrradiated() {
        return isIrradiated;
    }

    public void setIrradiated(boolean irradiated) {
        isIrradiated = irradiated;
    }

    public boolean getIsCertifiedHumane() {
        return isCertifiedHumane;
    }

    public void setCertifiedHumane(boolean certifiedHumane) {
        isCertifiedHumane = certifiedHumane;
    }

    public boolean getIsWildCaught() {
        return isWildCaught;
    }

    public void setWildCaught(boolean wildCaught) {
        isWildCaught = wildCaught;
    }

    public boolean getIsHasNoAddedHormones() {
        return hasNoAddedHormones;
    }

    public void setHasNoAddedHormones(boolean hasNoAddedHormones) {
        this.hasNoAddedHormones = hasNoAddedHormones;
    }

    public float getAverageSellableWeight() {
        return averageSellableWeight;
    }

    public void setAverageSellableWeight(float averageSellableWeight) {
        this.averageSellableWeight = averageSellableWeight;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public List<String> getDiets() {
        return diets;
    }

    public void setDiets(List<String> diets) {
        this.diets = diets;
    }

    public List<String> getAdditives() {
        return additives;
    }

    public void setAdditives(List<String> additives) {
        this.additives = additives;
    }

    public List<String> getAllergens() {
        return allergens;
    }

    public void setAllergens(List<String> allergens) {
        this.allergens = allergens;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Nutrients> getNutrients() {
        return nutrients;
    }

    public void setNutrients(List<Nutrients> nutrients) {
        this.nutrients = nutrients;
    }

    public List<String> getNutrition() {
        return nutrition;
    }

    public void setNutrition(List<String> nutrition) {
        this.nutrition = nutrition;
    }

    public Organic getOrganic() {
        return organic;
    }

    public void setOrganic(Organic organic) {
        this.organic = organic;
    }

    public Preparation getPreparation() {
        return preparation;
    }

    public void setPreparation(Preparation preparation) {
        this.preparation = preparation;
    }

    public Servings getServings() {
        return servings;
    }

    public void setServings(Servings servings) {
        this.servings = servings;
    }

    public List<TradeIdentifier> getTradeIdentifiers() {
        return tradeIdentifiers;
    }

    public void setTradeIdentifiers(List<TradeIdentifier> tradeIdentifiers) {
        this.tradeIdentifiers = tradeIdentifiers;
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    public List<Link> get_links() {
        return _links;
    }

    public void set_links(List<Link> _links) {
        this._links = _links;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
