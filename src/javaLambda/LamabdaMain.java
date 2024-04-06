package javaLambda;

public class LamabdaMain {

//	public static int a =5;
//	public static int b=5;
//	
	public void lambda(PrintValueLambda lam) {
		lam.perform();
	}
	
	public static void main(String[] args) {
		
		LamabdaMain l = new LamabdaMain();
		PrintValueLambda addTwoValues = () -> System.out.println("Hello lambda");
		l.lambda(addTwoValues);
	}
}
