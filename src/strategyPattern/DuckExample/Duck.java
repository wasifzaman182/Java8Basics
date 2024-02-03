package strategyPattern.DuckExample;

public abstract class Duck {

	//applying different strategies 
	IFlyBehaviour fb;
	IQuackBehavior qb;
	

	public Duck() {
		
	}


	public void setFb(IFlyBehaviour fb) {
		this.fb = fb;
	}


	public void setQb(IQuackBehavior qb) {
		this.qb = qb;
	}

	public void disp() {
		System.out.println("I am duck");
	}
	
	public void performFly() {
		fb.fly();
	}
	
	public void performQuck() {
		qb.quick();
	}
}
