package singletonPattern;

public class SingletonPatternMain {

	public static void main(String[] args) {
		
		SingletionPattern pattern = SingletionPattern.getInstance();
		pattern.print();
		
		//SingletionPattern p = new SingletionPattern();
		
	}
}
