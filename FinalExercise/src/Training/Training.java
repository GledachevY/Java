package Training;

import java.util.ArrayList;
import java.util.List;

import FitnessInstructor.FitnessInstructor;

public class Training implements IObservable {
	
	private String name;
	private FitnessInstructor fitnessInstructor;
	private List<IObserver> spectators;
	
	public Training(String name) {
		this.name = name;
		this.spectators = new ArrayList<IObserver>();
		this.fitnessInstructor = new FitnessInstructor();
	}

	@Override
	public void subscribe(IObserver observer) {
		this.spectators.add(observer);
		observer.setTrainer(this);

	}

	@Override
	public void unSubscribe(IObserver observer) {
		this.spectators.remove(observer);

	}

	@Override
	public void notifyObservers() {
		for(IObserver observer: this.spectators) {
		observer.update();
		}

	}
	
	public void setExercise(String exercise) {
		this.fitnessInstructor.createExercise(exercise);
		this.notifyObservers();
	}

	public String getName() {
		return name;
	}
	
	public String getExercise() {
		return this.fitnessInstructor.getNameOfExercise().toString();
	}

}
