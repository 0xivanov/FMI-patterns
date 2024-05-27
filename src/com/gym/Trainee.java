package com.gym;

import com.gym.strategy.TrainingContext;
import com.gym.strategy.TrainingStrategy;

public class Trainee {
    private String name;

    public Trainee(String name) {
        this.name = name;
    }

    public void update(TrainingContext trainingContext) {
        System.out.println(name + " has been notified of the new training program: " + trainingContext.executeStrategy());
    }
}
