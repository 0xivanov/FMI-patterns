package com.ice.store;

import com.ice.store.strategy.IceCreamMachine;

// Singleton and Factory
public class IceCreamStore {
    private static IceCreamStore instance;

    private IceCreamStore() {}

    public static IceCreamStore getInstance() {
        if (instance == null) {
            instance = new IceCreamStore();
        }
        return instance;
    }

    public IceCreamMachine createIceCreamMachine() {
        return new IceCreamMachine();
    }
}
