package commandPattern;

public class DispatchCommand implements ICommand {


	@Override
	public void execute() {
		System.out.println("Command is executed on Dispatch");
		
	}

	@Override
	public void unexecute() {
		System.out.println("Command is unexecuted on Dispatch");
		
	}

}
