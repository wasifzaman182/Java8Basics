package observerPattern;

public class PhoneDisplay implements IObserver {

	@Override
	public void update(double tempreature, double humidity, double pressure) {
		System.out.println("Phone display update temprature: " + tempreature + humidity + pressure);

	}

}
