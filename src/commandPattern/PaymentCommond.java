package commandPattern;

public class PaymentCommond implements ICommand {

	@Override
	public void execute() {
		System.out.println("Command is executed on Payment");
		
	}

	@Override
	public void unexecute() {
		System.out.println("Command is unexecuted on Payment");
		
	}

}
