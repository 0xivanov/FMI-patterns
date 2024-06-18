package com.ice.store;

public class ChocolateIceCream implements IceCream {
    @Override
    public String getDescription() {
        return "Chocolate Ice Cream";
    }

    @Override
    public double getCost() {
        return 1.75;
    }
}

