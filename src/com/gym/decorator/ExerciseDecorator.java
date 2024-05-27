package com.gym.decorator;

public abstract class ExerciseDecorator implements Exercise {
    protected Exercise decoratedExercise;

    public ExerciseDecorator(Exercise decoratedExercise) {
        this.decoratedExercise = decoratedExercise;
    }

    public void perform() {
        decoratedExercise.perform();
    }
}
