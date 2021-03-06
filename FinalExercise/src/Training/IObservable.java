package Training;

public interface IObservable {
	void subscribe(IObserver observer);
	void unSubscribe(IObserver observer);
	void notifyObservers();
	String getName();

}
