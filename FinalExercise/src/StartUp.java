import Factory.StandUpCommand;
import Training.OnlineSpectator;
import Training.Training;

public class StartUp {

	public static void main(String[] args) {
		
		Training trainee = new Training("Gosho the bodybuilder");
		
		OnlineSpectator spectator1 = new OnlineSpectator("Petq");
		OnlineSpectator spectator2 = new OnlineSpectator("Ivan");
		OnlineSpectator spectator3 = new OnlineSpectator("Miro");
		
		trainee.subscribe(spectator1);
		trainee.subscribe(spectator2);
		trainee.subscribe(spectator3);
		
		trainee.setExercise("stand up");
		
		trainee.setExercise("lay down");

	}

}
