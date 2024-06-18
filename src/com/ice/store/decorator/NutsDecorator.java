package com.ice.store.decorator;

import com.ice.store.IceCream;

public class NutsDecorator extends ToppingDecorator {
    public NutsDecorator(IceCream decoratedIceCream) {
        super(decoratedIceCream);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Nuts";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }
}