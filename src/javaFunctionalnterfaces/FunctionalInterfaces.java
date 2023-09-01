package javaFunctionalnterfaces;

public class FunctionalInterfaces {


@FunctionalInterface
 interface foo {
	void say();
}
 
 void something() {
	System.out.println("Hello functional interface");
}

 public static void main(String[] args) {
	FunctionalInterfaces n  = new FunctionalInterfaces();
	foo f = n::something;
	f.say();
}
}
