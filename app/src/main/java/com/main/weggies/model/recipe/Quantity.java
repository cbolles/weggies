package com.main.weggies.model.recipe;

public class Quantity {
    private String value;
    private String unitOfMeasure;
    private String extendedUnits;
    private String text;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public String getExtendedUnits() {
        return extendedUnits;
    }

    public void setExtendedUnits(String extendedUnits) {
        this.extendedUnits = extendedUnits;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
