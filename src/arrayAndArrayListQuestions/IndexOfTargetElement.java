package arrayAndArrayListQuestions;

public class IndexOfTargetElement {

	public static void main(String[] args) {
		
		IndexOfTargetElement i = new IndexOfTargetElement();
		int[] arr = {1,3,5,6};
		int value = i.searchInsert(arr, 7);
		
		System.out.println("index of target " + value);
	}
	
	
	 public int searchInsert(int[] nums, int target) {
		 int l = nums.length;
		 
		 for(int i=0; i<l; i++) {
			 
			 if(nums[i] == target) {
				 target = i;
				 System.out.println("if " + target);
				 break;
			 }
			 
				 if(nums[i] > target) {
					 target = i-2;
						System.out.println("else if " + target);
						
			 }
				 else {
					 for (int j : nums) {
							if(j != target) {
								target = nums.length+1;
								//System.out.println("number not in arrary "  + target);
							}
						}
					 break;
				 }
			 }
		 
		 
		return target;
	        
	    }
}
