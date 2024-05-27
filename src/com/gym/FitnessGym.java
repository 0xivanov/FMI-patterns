package com.gym;

// Singleton: Ensure that there is only one instance of the fitness gym.
public class FitnessGym {
    private static FitnessGym instance;
    private TrainingRegime trainingRegime;

    private FitnessGym() {
        trainingRegime = new TrainingRegime();
    }

    public static synchronized FitnessGym getInstance() {
        if (instance == null) {
            instance = new FitnessGym();
        }
        return instance;
    }

    public TrainingRegime getTrainingRegime() {
        return trainingRegime;
    }
}
