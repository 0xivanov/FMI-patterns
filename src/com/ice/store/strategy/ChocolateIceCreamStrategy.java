package com.ice.store.strategy;

import com.ice.store.ChocolateIceCream;
import com.ice.store.IceCream;

public class ChocolateIceCreamStrategy implements IceCreamStrategy {
    @Override
    public IceCream makeIceCream() {
        System.out.println("Making Chocolate Ice Cream.");
        return new ChocolateIceCream();
    }
}


