package arrayAndArrayListQuestions;

import java.util.Arrays;

public class RemoveDuplicationFromArray {

    public static void main(String[] args) {

        RemoveDuplicationFromArray ar = new RemoveDuplicationFromArray();
        int[] arr = {0, 1, 1, 2, 3, 4, 5, 5, 6, 6, 7};

        int countValue = ar.removeDuplication(arr);

        System.out.println("Total count of elements after removing duplicates: " + countValue);
    }

    public int removeDuplication(int[] arr) {
        if (arr.length == 0) {
            return 0; // If the array is empty, there are no duplicates
        }

        int count = 0; // Initialize count to 0 to include the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[++count] = arr[i];
            }
        }

        // Print the array after removing duplicates
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, count + 1)));

        return count + 1; // Return the count including the first element
    }
}
