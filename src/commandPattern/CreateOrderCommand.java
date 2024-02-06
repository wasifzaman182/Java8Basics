package commandPattern;

public class CreateOrderCommand implements ICommand {


	@Override
	public void execute() {
		System.out.println("Command is executed on Create order command");
		
	}

	@Override
	public void unexecute() {
		System.out.println("Command is unexecuted on Create order command");
		
	}

}
