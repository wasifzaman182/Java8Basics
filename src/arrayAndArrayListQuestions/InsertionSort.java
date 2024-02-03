 package arrayAndArrayListQuestions;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = new int[] {2,0,4,5,8};
		int[] arr2 = insertionSort(arr);
		
		for (int i : arr2) {
			System.out.println(i);
		}

	}

	public static int[] insertionSort(int[] arr) {
		for(int i= 1; i<arr.length; i++ ) {
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		return arr;
	}
}
