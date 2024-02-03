package strategyPattern.DuckExample;

public class CantFlyWithWings implements IFlyBehaviour{

	@Override
	public void fly() {
		System.out.println("I can't fly");
		
	}

}
