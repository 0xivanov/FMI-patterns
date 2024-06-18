package com.ice.store;

public class StrawBerryIceCream implements IceCream {
    @Override
    public String getDescription() {
        return "Straw Berry Ice Cream";
    }

    @Override
    public double getCost() {
        return 1.75;
    }
}
