package strategyPattern.DuckExample;

public class DuckSimulator {

	public static void main(String[] args) {
		
//		Duck marllardDuck = new MallardDuck();
//		marllardDuck.performFly();
//		marllardDuck.performQuck();

		Duck model = new RocketDuck();
		model.performFly();
		model.setFb(new FlyRocket());
		model.performFly();
	}

}
