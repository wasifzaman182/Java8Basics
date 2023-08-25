package javaLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestingJava8Lambda {
	
	public static void main(String[] args) {
	
		List<String> s = new ArrayList<String>();
		s.add("wasif");
		s.add("Abid");
		s.add("Kashif");
		s.add("Tariq");
		s.add("Atif");
		s.add("jawad");
		
		List<String> ss = new ArrayList<String>();
		ss.add("zaman");
		ss.add("hussain");
		ss.add("Saad");
		ss.add("Shazib");
		
		
		TestingJava8Lambda t  = new TestingJava8Lambda();
		System.out.println("Java 7 method");
		t.java7method(s);
		System.out.println(s);
			
		System.out.println("java 8 method");
		t.java8method(ss);
		System.out.println(ss);
			
	}
	
	
	
	public void java8method(List<String> name) {
		Collections.sort(name, new Comparator<String>() {
			 @Override
			 public int compare(String s1, String s2) {
			 return s1.compareTo(s2);
			 }
			 });

		
	}
	
	public void java7method(List<String> name) {
		Collections.sort(name, (s1,s2)-> s1.compareTo(s2));
	}

}
