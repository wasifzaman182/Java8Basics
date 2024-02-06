package commandPattern;

public class AddToCartCommand  implements ICommand{

	@Override
	public void execute() {
		System.out.println("Command is executed on Add To cart");
		
	}

	@Override
	public void unexecute() {
		System.out.println("Command is unexecuted on Add To cart");
		
	}

}
