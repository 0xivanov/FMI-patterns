package com.ice.store;

import com.ice.store.decorator.SprinklesDecorator;
import com.ice.store.decorator.ToppingDecorator;
import com.ice.store.strategy.VanillaIceCreamStrategy;

public class Main {
    public static void main(String[] args) {
        var iceCreamStore = IceCreamStore.getInstance();
        var iceCreamMachine = iceCreamStore.createIceCreamMachine();

        var vanillaStrategy = new VanillaIceCreamStrategy();
        iceCreamMachine.setStrategy(vanillaStrategy);

        var vanillaIceCream = iceCreamMachine.makeIceCream();
        System.out.println(vanillaIceCream.getDescription() + " costs " + vanillaIceCream.getCost());

        ToppingDecorator iceCreamWithTopping = new SprinklesDecorator(vanillaIceCream);
        System.out.println(iceCreamWithTopping.getDescription() + " costs " + iceCreamWithTopping.getCost());
    }
}
