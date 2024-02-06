package commandPattern;

public class Invoker  {

	 ICommand c;
	 public Invoker() {
		 
	 }
	
	public Invoker(ICommand command) {
		this.c= command;
	}
	
	public void executeCommand() {
		this.c.execute();
	}
	
	public void unexecuteCommand() {
		this.c.unexecute();
	}
	
}
