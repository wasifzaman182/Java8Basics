package javaLambda.ExceptionHandling;

import java.util.function.BiConsumer;

/**
 * Biconsumer is an interface in java 8 that takes two objects 
 * and in this class i am going to use BiConsumer and then i will add two values using lamabda and Biconusmer will print 
 */


public class BiConsumerInterface {

	public static void main(String[] args) {
		
		int[] someValues =  {1,2,3,4,5};
		int key=2;
		
		processValues(someValues, key, (v,k)->System.out.println(v+k));
		
	}

	private static void processValues(int[] someValues, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : someValues) {
			//System.out.println(i + key);
			consumer.accept(i, key);
		}
		
	}

}
