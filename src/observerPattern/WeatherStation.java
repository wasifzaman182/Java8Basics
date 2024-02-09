package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {
	
	double tempreature, humidity, pressure;
	List<IObserver> observers;
	
	public WeatherStation() {
		observers = new ArrayList<IObserver>();	
	}
	
	@Override
	public void addObserver(IObserver addObserver) {
		observers.add(addObserver);

	}

	@Override
	public void removeObserver(IObserver removeObserver) {
		observers.remove(removeObserver);

	}

	@Override
	public void notifyObserver() {
		for(IObserver ob : observers) {
			ob.update(tempreature, humidity, pressure);
		}

	}
	
	public void setMeasurements(double temp, double humidity, double pressure) {
		this.tempreature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObserver();
	}

}
