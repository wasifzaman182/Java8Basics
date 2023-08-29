package javaLambda;

import java.util.ArrayList;
import java.util.List; 

public class MethodReference {
	
	
	public MethodReference() {
		// TODO Auto-generated constructor stub
	}

	
		//constructor reference
		public MethodReference(String message) {
			System.out.println(message);
		}
		
		interface constructorReferenceExample{
			MethodReference reference(String message);
		}


		//for static and non static reference example
		interface Sayable{
			void say();
			//void yes();
		}
		
		//method reference example 2 for static method reference
		public static void saySomething() {
			System.out.println("Hello this method is static and will call throw sayable interface");
		}
		
		//method reference for instance method reference//non static method
		public void doSomething() {
			System.out.println("Hello this is instance method call mean non static method ");
		}
		
	public static void main(String[] args) {
		List<String> ss = new ArrayList<String>();
		
		ss.add("wasif");
		ss.add("Janii");
		ss.add("Abubakar");
		
		//static method reference example 1
		ss.forEach(System.out::println);
		
		System.out.println("Testing second method of method refernce");
		
		Sayable sa = MethodReference::saySomething;
		sa.say();
		
		//referencing instance method /non static method
		MethodReference r  = new MethodReference();
		Sayable sayable = r::doSomething;
		sayable.say();
		
		
		//Referencing constructor 
		constructorReferenceExample c = MethodReference::new;
		c.reference("Hello referenceing to constructor ");
	}
	
	
}
