package com.gym;

import com.gym.decorator.BasicExercise;
import com.gym.decorator.CardioDecorator;
import com.gym.decorator.Exercise;
import com.gym.decorator.StrengthDecorator;
import com.gym.strategy.CardioStrategy;
import com.gym.strategy.StrengthStrategy;
import com.gym.strategy.TrainingContext;

public class Main {
    public static void main(String[] args) {
        // Singleton instance of the fitness gym
        FitnessGym gym = FitnessGym.getInstance();
        // Get the training regime from the gym
        TrainingRegime regime = gym.getTrainingRegime();

        // Create a training regime and trainees
        Trainee trainee1 = new Trainee("Ivan");
        Trainee trainee2 = new Trainee("Iliya");

        // Add trainees to the regime
        regime.addTrainee(trainee1);
        regime.addTrainee(trainee2);

        // Strategy pattern usage
        TrainingContext context = new TrainingContext();
        context.setStrategy(new CardioStrategy());
        // Change the training regime and notify trainees
        regime.setRegime(context);
        context.executeStrategy();

        context.setStrategy(new StrengthStrategy());
        // Change the training regime and notify trainees
        regime.setRegime(context);
        context.executeStrategy();


        // Decorator pattern usage
        Exercise exercise = new BasicExercise();
        Exercise cardioExercise = new CardioDecorator(exercise);
        Exercise strengthExercise = new StrengthDecorator(exercise);

        System.out.println("Basic Exercise:");
        exercise.perform();

        System.out.println("\nCardio Exercise:");
        cardioExercise.perform();

        System.out.println("\nStrength Exercise:");
        strengthExercise.perform();
    }
}
