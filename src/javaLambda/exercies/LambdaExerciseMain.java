package javaLambda.exercies;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExerciseMain {
	static String sortLastName = null;

	
	public static void main(String[] args) {

		LambdaExerciseMain exerciseMain = new LambdaExerciseMain();
		
		List<Person> person = Arrays.asList(new Person("Charles","Dickens",60),
											new Person("Lewis","Carroll",42),
											new Person("Thomas", "Carlyle", 51),
											new Person("Charlotte","Bronte",45),
											new Person("Matthew","Arnold",39));
		
		System.out.println("Sorting by last Name" + "\n");
		
		//step1 sort list by last name
		
		for (Person person2 : person) {
			
			if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("a"))
				System.out.println(person2.getLastName());
			else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("b"))
				System.out.println(person2.getLastName());
				else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("c"))
					System.out.println(person2.getLastName());
					else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("d"))
						System.out.println(person2.getLastName());
						else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("e"))
							System.out.println(person2.getLastName());
							else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("f"))
								System.out.println(person2.getLastName());
							else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("g"))
								System.out.println(person2.getLastName());
							else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("h"))
								System.out.println(person2.getLastName());
								else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("i"))
									System.out.println(person2.getLastName());
									else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("j"))
										System.out.println(person2.getLastName());
										else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("k"))
											System.out.println(person2.getLastName());
											else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("l"))
												System.out.println(person2.getLastName());
												else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("m"))
													System.out.println(person2.getLastName());
													else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("n"))
														System.out.println(person2.getLastName());
														else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("o"))
															System.out.println(person2.getLastName());
															else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("p"))
																System.out.println(person2.getLastName());
																else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("q"))
																	System.out.println(person2.getLastName());
																	else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("r"))
																		System.out.println(person2.getLastName());
																		else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("s"))
																			System.out.println(person2.getLastName());
																			else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("t"))
																				System.out.println(person2.getLastName());
																				else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("u"))
																					System.out.println(person2.getLastName());
																					else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("v"))
																						System.out.println(person2.getLastName());
																						else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("w"))
																							System.out.println(person2.getLastName());
																							else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("x"))
																								System.out.println(person2.getLastName());
																								else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("y"))
																									System.out.println(person2.getLastName());
																									else if(lastNameFistWord(person2.getLastName()).equalsIgnoreCase("z"))
																			                          System.out.println(person2.getLastName());
																									else
																										System.out
																												.println("Please check input");

		}
		
		
		System.out.println("################ Sort using Collection ###########" + "\n" );
		Collections.sort(person,Comparator.comparing(Person::getLastName));
		for (Person person3 : person) {
			System.out.println(person3.getFirstName() + " " + person3.getLastName());
		}
		
		//step 2 Create a method that prints all elements in the list	
		System.out.println("################ All person list ###########" + "\n" );
		exerciseMain.printAllPersons(person);
		
		//step 3 create a method that prints all elements that have last name starting with C;
		System.out.println("################ Last name starts with c ###########" + "\n" );
		exerciseMain.lastNameWithC(person);
		
	}
	
	
	
	public void printAllPersons(List<Person> person) {
		for (Person person2 : person) {
			System.out.println(person2.getFirstName() + " " + person2.getLastName());
		}
	}
	
	public void lastNameWithC(List<Person> person1) {
		for (Person person : person1) {
			if(lastNameFistWord(person.getLastName()).equalsIgnoreCase("c"))
				System.out.println(person.getLastName());
		}
		
	}
	
	public static  String lastNameFistWord(String lastName) {
		sortLastName = lastName.substring(0, 1);
		return sortLastName;
	}
}
