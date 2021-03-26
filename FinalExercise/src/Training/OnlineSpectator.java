package Training;

public class OnlineSpectator implements IObserver {
	private String name;
	private Training trainer;
	
	public  OnlineSpectator(String name) {
		this.name = name;
	}

	@Override
	public void setTrainer(Training trainer) {
		this.trainer = trainer;

	}

	@Override
	public void update() {
		System.out.println(this.name + " recieved new exercise " + this.trainer.getExercise());
		
		
	}

	public String getName() {
		return name;
	}

}
