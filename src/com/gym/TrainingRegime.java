package com.gym;

import com.gym.Trainee;
import com.gym.strategy.TrainingContext;
import com.gym.strategy.TrainingStrategy;
import java.util.ArrayList;
import java.util.List;

// Observer: Notify all trainees when the training regime changes.
public class TrainingRegime {
    private List<Trainee> trainees = new ArrayList<>();
    private TrainingContext trainingContext;
    
    public void addTrainee(Trainee trainee) {
        trainees.add(trainee);
    }
    
    public void removeTrainee(Trainee trainee) {
        trainees.remove(trainee);
    }
    
    public void setRegime(TrainingContext regime) {
        this.trainingContext = regime;
        notifyAllTrainees();
    }
    
    private void notifyAllTrainees() {
        for (Trainee trainee : trainees) {
            trainee.update(trainingContext);
        }
    }
}
