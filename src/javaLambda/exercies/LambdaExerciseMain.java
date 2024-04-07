package javaLambda.exercies;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
		Collections.sort(person,Comparator.comparing(Person::getLastName) );
		for (Person person3 : person) {
			System.out.println(person3.getFirstName() + " " + person3.getLastName());
		}

		//step 2 Create a method that prints all elements in the list	
		System.out.println("################ All person list ###########" + "\n" );
		printList(person, "personList");
		//exerciseMain.printAllPersons(person);
		
		//step 3 create a method that prints all elements that have last name starting with C;
		System.out.println("################ Last name starts with c ###########" + "\n" );
		printList(person, "lastNameWithC");
	//	exerciseMain.lastNameWithC(person);
		
	}
	public static void printList(List<Person> person, String value) {
		for (Person person2 : person) {
			 
		 if(value == "personList") 
				System.out.println(person2.getFirstName() + " " + person2.getLastName());
			
			else if (value == "lastNameWithC")
				if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("c"))
					System.out.println(person2.getLastName());
				
	}
	}
	public static  String lastNameFistWord(String lastName) {
		sortLastName = lastName.substring(0, 1);
		return sortLastName;
	}
	
	
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
