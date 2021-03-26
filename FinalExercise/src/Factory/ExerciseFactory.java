package Factory;

public class ExerciseFactory {
	public IExercise createExercise (String name) {
		if(name == "lay down") {
			return new LayDownCommand();
		}else if (name == "stand up") {
		return new StandUpCommand();
		}else {
		return null;
		}
	}

}
