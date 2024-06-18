package com.ice.store.strategy;

import com.ice.store.IceCream;
import com.ice.store.StrawBerryIceCream;

public class StawBerryIceCreamStrategy implements IceCreamStrategy {
    @Override
    public IceCream makeIceCream() {
        System.out.println("Making Straw Berry Ice Cream.");
        return new StrawBerryIceCream();
    }
}
