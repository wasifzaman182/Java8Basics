package arrayAndArrayListQuestions;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] ar = new int[] { 4, 2, 3, 7, 0, 9, 1, 5,6 };
        int[] print = mergeSort(ar);

        for (int i : print) {
            System.out.println(i);
        }
    }

    public static int[] mergeSort(int[] arr) {
        int l = arr.length;
        int mid = l / 2;
        int[] arrReturn = null;

        if (l > 1) {
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, l);

            mergeSort(left);
            mergeSort(right);

            arrReturn = merge(arr, left, right);
        }
        return arrReturn;
    }

    private static int[] merge(int[] arr, int[] left, int[] right) {

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
        return arr;
    }
    
}
