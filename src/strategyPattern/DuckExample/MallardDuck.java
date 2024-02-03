package strategyPattern.DuckExample;

public class MallardDuck extends Duck{

	
	public MallardDuck() {
		fb = new FlyWithWings();
		qb = new SoundQuck();
		
	}
}
