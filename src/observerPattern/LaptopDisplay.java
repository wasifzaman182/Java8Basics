package observerPattern;

public class LaptopDisplay implements IObserver {

	@Override
	public void update(double tempreature, double humidity, double pressure) {

		System.out.println("Laptop display update tempreature : " + tempreature + humidity + pressure);

	}

}
