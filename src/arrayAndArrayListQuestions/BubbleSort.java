package arrayAndArrayListQuestions;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] array = new int[]{2,5,4,6,7,8,10};
	int[] returnArray = bubbleSort(array);
		
		for(int b=0; b<returnArray.length; b++) {
			System.out.println(returnArray[b]);
		}
		

	}

	public  static  int[] bubbleSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j-1] > arr[j]) {
					int temp =arr[j-1];
					arr[j-1] =arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
