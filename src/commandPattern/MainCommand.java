package commandPattern;

import java.util.Stack;

public class MainCommand {

	public static void main(String[] args) {
	
		Invoker in = new Invoker();
		
		Stack<ICommand> command = new Stack<ICommand>();
		
		ICommand comm = new AddToCartCommand();
		 in = new Invoker(comm);
		in.executeCommand();
		command.push(comm);
		

		in.unexecuteCommand();
		
	}
	
}
