package com.ice.store.decorator;

import com.ice.store.IceCream;

public class SprinklesDecorator extends ToppingDecorator {
    public SprinklesDecorator(IceCream decoratedIceCream) {
        super(decoratedIceCream);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sprinkles";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.25;
    }
}
