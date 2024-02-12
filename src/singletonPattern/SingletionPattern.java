package singletonPattern;

public class SingletionPattern {
	
	private static SingletionPattern instance = null;
	
	private SingletionPattern() {
		
	}
	
	public static SingletionPattern getInstance() {
		if(instance == null) {
			instance = new SingletionPattern();
		}
		return instance;
	}
	
	public void print() {
		System.out.println("Singletion class");
	}

}
