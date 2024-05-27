package com.gym.decorator;

public class CardioDecorator extends ExerciseDecorator {
    public CardioDecorator(Exercise decoratedExercise) {
        super(decoratedExercise);
    }

    @Override
    public void perform() {
        decoratedExercise.perform();
        System.out.println("Adding cardio exercises.");
    }
}
