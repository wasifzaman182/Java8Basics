package strategyPattern.DuckExample;

public class CantQuck implements IQuackBehavior {

	@Override
	public void quick() {
		System.out.println("I can not quick");
		
	}

}
