package strategyPattern.DuckExample;

public class RocketDuck extends Duck {

	public RocketDuck() {
		fb = new CantFlyWithWings();
		qb = new CantQuck();
	}
}
