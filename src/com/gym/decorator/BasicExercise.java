package com.gym.decorator;

public class BasicExercise implements Exercise {
    @Override
    public void perform() {
        System.out.println("Performing basic exercise.");
    }
}
