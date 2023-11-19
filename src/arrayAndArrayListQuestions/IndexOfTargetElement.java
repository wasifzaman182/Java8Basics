package arrayAndArrayListQuestions;

public class IndexOfTargetElement {

	public static void main(String[] args) {
		
		IndexOfTargetElement i = new IndexOfTargetElement();
		int[] arr = {1,3,5,6};
		int value = i.searchInsert(arr, 2);
		
		System.out.println("index of target " + value);
	}
	
	
	 public int searchInsert(int[] nums, int target) {
		 for(int i=0; i<nums.length; i++) {
			 if(nums[i] == target) {
				 
				 target = i;
			 }

		 }
		 
		return target;
	        
	    }
}
