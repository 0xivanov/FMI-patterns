package com.ice.store.decorator;

import com.ice.store.IceCream;

public abstract class ToppingDecorator implements IceCream {
    protected IceCream decoratedIceCream;

    public ToppingDecorator(IceCream decoratedIceCream) {
        this.decoratedIceCream = decoratedIceCream;
    }

    public String getDescription() {
        return decoratedIceCream.getDescription();
    }

    public double getCost() {
        return decoratedIceCream.getCost();
    }
}
