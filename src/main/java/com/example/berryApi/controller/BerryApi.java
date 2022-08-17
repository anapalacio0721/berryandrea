package com.example.berryApi.controller;

import java.util.List;

public class BerryApi {
    private Firmness firmness;
    private List<Recipe> flavors;
    private Integer growth_time;
    private Integer id;
    private Item item;
    private Integer max_harvest;
    private String name;
    private Integer natural_gift_power;
    private NaturalGift natural_gift_type;
    private Integer size;
    private Integer smoothness;
    private Integer soil_dryness;
    
    public BerryApi(Firmness firmness, List<Recipe> flavors, Integer growth_time, Integer id, Item item,
            Integer max_harvest, String name, Integer natural_gift_power, NaturalGift natural_gift_type, Integer size,
            Integer smoothness, Integer soil_dryness) {
        this.firmness = firmness;
        this.flavors = flavors;
        this.growth_time = growth_time;
        this.id = id;
        this.item = item;
        this.max_harvest = max_harvest;
        this.name = name;
        this.natural_gift_power = natural_gift_power;
        this.natural_gift_type = natural_gift_type;
        this.size = size;
        this.smoothness = smoothness;
        this.soil_dryness = soil_dryness;
    }

    public Firmness getFirmness() {
        return firmness;
    }

    public void setFirmness(Firmness firmness) {
        this.firmness = firmness;
    }

    public List<Recipe> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<Recipe> flavors) {
        this.flavors = flavors;
    }

    public Integer getGrowth_time() {
        return growth_time;
    }

    public void setGrowth_time(Integer growth_time) {
        this.growth_time = growth_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getMax_harvest() {
        return max_harvest;
    }

    public void setMax_harvest(Integer max_harvest) {
        this.max_harvest = max_harvest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNatural_gift_power() {
        return natural_gift_power;
    }

    public void setNatural_gift_power(Integer natural_gift_power) {
        this.natural_gift_power = natural_gift_power;
    }

    public NaturalGift getNatural_gift_type() {
        return natural_gift_type;
    }

    public void setNatural_gift_type(NaturalGift natural_gift_type) {
        this.natural_gift_type = natural_gift_type;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getSmoothness() {
        return smoothness;
    }

    public void setSmoothness(Integer smoothness) {
        this.smoothness = smoothness;
    }

    public Integer getSoil_dryness() {
        return soil_dryness;
    }

    public void setSoil_dryness(Integer soil_dryness) {
        this.soil_dryness = soil_dryness;
    }

}
