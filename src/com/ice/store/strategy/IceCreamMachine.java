package com.ice.store.strategy;

import com.ice.store.IceCream;

public class IceCreamMachine {
    private IceCreamStrategy strategy;

    public void setStrategy(IceCreamStrategy strategy) {
        this.strategy = strategy;
    }

    public IceCream makeIceCream() {
        if (strategy != null) {
            return strategy.makeIceCream();
        } else {
            System.out.println("No strategy set!");
            return null;
        }
    }
}
