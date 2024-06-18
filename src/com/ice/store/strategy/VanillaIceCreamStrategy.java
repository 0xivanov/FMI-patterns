package com.ice.store.strategy;

import com.ice.store.IceCream;
import com.ice.store.VanillaIceCream;

public class VanillaIceCreamStrategy implements IceCreamStrategy {
    @Override
    public IceCream makeIceCream() {
        System.out.println("Making Vanilla Ice Cream.");
        return new VanillaIceCream();
    }
}

