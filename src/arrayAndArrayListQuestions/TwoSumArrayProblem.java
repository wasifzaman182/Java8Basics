package arrayAndArrayListQuestions;

public class TwoSumArrayProblem {
	int target;
	int[] sum;
	// result;
	
	public int[] sum(int[] sum, int target) {

		 
		 this.sum = sum;
			this.target = target;

			
			for(int i=0; i<this.sum.length; i++) {

				for(int j=i+1; j<this.sum.length; j++){

				if((this.sum[i] + this.sum[j]) == this.target) {

					int[] result = {i,j};
					return result;
				}

				}
				 
				}
			return new int[0]	; 
	}
}
