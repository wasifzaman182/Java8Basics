package arrayAndArrayListQuestions;

import java.util.Arrays;

public class BuiltinSortMethod {

	 public static void main(String[] args) {
	        // Create an array of integers
	        int[] numbers = {5, 2, 8, 3, 1, 7, 4, 6};

	        // Print the original array
	        System.out.println("Original array: " + Arrays.toString(numbers));

	        // Sort the array in ascending order
	        Arrays.sort(numbers);

	        // Print the sorted array
	        System.out.println("Sorted array: " + Arrays.toString(numbers));
	    }
}

