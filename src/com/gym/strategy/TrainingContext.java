package com.gym.strategy;

import com.gym.strategy.TrainingStrategy;

// Strategy: Define different training regimes that can be chosen and switched.
public class TrainingContext {
    private TrainingStrategy strategy;
    
    public void setStrategy(TrainingStrategy strategy) {
        this.strategy = strategy;
    }
    
    public String executeStrategy() {
        return strategy.execute();
    }
}