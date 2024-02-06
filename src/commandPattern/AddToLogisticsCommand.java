package commandPattern;

public class AddToLogisticsCommand implements ICommand {


	@Override
	public void execute() {
		System.out.println("Command is executed on Add to logistics command");
		
	}

	@Override
	public void unexecute() {
		System.out.println("Command is unexecuted on Add to logistics Command");
		
	}

}
