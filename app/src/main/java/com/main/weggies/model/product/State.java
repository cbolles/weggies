package com.main.weggies.model.product;

public class State {
    private String state;
    private Tax tax;
    boolean hasDeposit;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public boolean isHasDeposit() {
        return hasDeposit;
    }

    public void setHasDeposit(boolean hasDeposit) {
        this.hasDeposit = hasDeposit;
    }
}
