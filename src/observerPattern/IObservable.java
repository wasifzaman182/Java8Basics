package observerPattern;

public interface IObservable {

	public void addObserver(IObserver addObserver);
	public void removeObserver(IObserver removeObserver);
	public void notifyObserver();
}
