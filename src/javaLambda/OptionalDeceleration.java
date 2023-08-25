package javaLambda;

public class OptionalDeceleration {
	
	public static void main(String[] args) {
		
		OptionalDeceleration o =new OptionalDeceleration();
		
		//with type decleration
		MathOperation addittion = (int a,int b) -> a+b;
		MathOperation subtraction = (int a, int b) -> a - b;
		
		//without type decleration
		MathOperation multiplication = (a, b) -> a * b;
		MathOperation division  = (a, b) -> a / b;
		
		
		System.out.println("Addition + " + o.operate(5, 5, addittion));
		System.out.println("Subtraction - " + o.operate(10, 5, subtraction));
		System.out.println("Multiplication * " + o.operate(5, 4, multiplication));
		System.out.println("Division / " + o.operate(10, 2, division));
		
		
		//without parenthesis because it is single param
		PrintMessage me = message ->System.out.println("Hello " + message);
		me.message("jee, gurya,qurban, zargya");
		
		//with parenthesis
		PrintMessage mee = (message) ->System.out.println("Hello " + message);
		mee.message("Abubakar, how are you");

		
	} 

	interface PrintMessage{
		void message(String message);
	}
	
	interface MathOperation{
		int operation(int a,int b);
	}
	
	private int operate(int a,int b, MathOperation operation) {
		return operation.operation(a, b);
	}
}
