package javaLambda;

import java.util.Scanner;

public class MainClass {

 	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        
        int checkNumber = s.nextInt();
        
        if(checkNumber / checkNumber == 0 || checkNumber ==1){
            System.out.println("The number is prime");
        }
	}
}
