package com.example.berryApi.controller;

public class Recipe {
    private Flavor flavor;
    private Integer potency;
    public Recipe(Flavor flavor, Integer potency) {
        this.flavor = flavor;
        this.potency = potency;
    }
    public Flavor getFlavor() {
        return flavor;
    }
    public void setFlavor(Flavor flavor) {
        this.flavor = flavor;
    }
    public Integer getPotency() {
        return potency;
    }
    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    
}
