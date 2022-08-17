package com.example.berryApi.controller;

public class Flavors {
    private String flavor;
    private String potency;
    public Flavors(String flavor, String potency) {
        this.flavor = flavor;
        this.potency = potency;
    }
    public String getFlavor() {
        return flavor;
    }
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public String getPotency() {
        return potency;
    }
    public void setPotency(String potency) {
        this.potency = potency;
    }
    
}
