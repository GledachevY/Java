package FitnessInstructor;

import Factory.ExerciseFactory;
import Factory.IExercise;

public class FitnessInstructor  {

	private IExercise exercise;
	
	public void createExercise(String exercise) {
      	ExerciseFactory eFactory = new ExerciseFactory();
      	this.exercise = eFactory.createExercise(exercise);
	}
	
	public IExercise getExercise() {
		return exercise;
	}
	
	public String getNameOfExercise() {
		return exercise.getName();
	}
}
