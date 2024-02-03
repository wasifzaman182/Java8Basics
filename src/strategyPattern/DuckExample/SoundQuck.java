package strategyPattern.DuckExample;

public class SoundQuck  implements IQuackBehavior {

	@Override
	public void quick() {
		System.out.println("I can quck");
		
	}

}
