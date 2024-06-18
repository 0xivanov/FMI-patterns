package com.ice.store;

public class VanillaIceCream implements IceCream {
    @Override
    public String getDescription() {
        return "Vanilla Ice Cream";
    }

    @Override
    public double getCost() {
        return 1.50;
    }
}