package javaLambda.exercies;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExerciseMain {
	static String sortLastName = null;

	
	public static void main(String[] args) {
	
		List<Person> person = Arrays.asList(new Person("Charles","Dickens",60),
											new Person("Lewis","Carroll",42),
											new Person("Thomas", "Carlyle", 51),
											new Person("Charlotte","Bronte",45),
											new Person("Matthew","Arnold",39));
		
		//step1 sort list by last name
		System.out.println("################ Sort using Collection ###########" + "\n" );		
		Collections.sort(person,(p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		printList(person, p->true, p->System.out.println(p));

		//step 2 Create a method that prints all elements in the list	
		System.out.println("################ All person list ###########" + "\n" );
		printList(person, p -> true, p->System.out.println(p));
		
		//step 3 create a method that prints all elements that have last name starting with C;
		System.out.println("################ Last name starts with c ###########" + "\n" );
		printList(person, p -> p.getLastName().startsWith("C"), p->System.out.println(p.getFirstName()));
		
	}
	public static void printList(List<Person> person, Predicate<Person> per, Consumer<Person> con) {
		for (Person person2 : person) {
			if(per.test(person2)) {
				con.accept(person2);
			}
		}
	}
//	public static  String lastNameFistWord(String lastName) {
//		sortLastName = lastName.substring(0, 1);
//		return sortLastName;
//	}
//	
	
//	public void printAllPersons(List<Person> person) {
//		for (Person person2 : person) {
//			System.out.println(person2.getFirstName() + " " + person2.getLastName());
//		}
//	}
	
//	public void lastNameWithC(List<Person> person1) {
//		for (Person person : person1) {
//			if(lastNameFistWord(person.getLastName()).equalsIgnoreCase("c"))
//				System.out.println(person.getLastName());
//		}
//		
//	}
	
	
}
