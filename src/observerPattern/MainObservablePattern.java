package observerPattern;

public class MainObservablePattern {

	public static void main(String[] args) {
	
		IObservable weatherStation = new WeatherStation();
		
		IObserver phoneObserver = new PhoneDisplay();
		IObserver laptopObserver = new LaptopDisplay();
		
		weatherStation.addObserver(phoneObserver);
		weatherStation.addObserver(laptopObserver);
		
		((WeatherStation)weatherStation).setMeasurements(25, 30, 1013);
	}
	
	
	
}
