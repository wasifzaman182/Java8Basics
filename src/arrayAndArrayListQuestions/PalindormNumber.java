package arrayAndArrayListQuestions;

public class PalindormNumber {

	
	public boolean isPalindrome(int x) {
		
		String v = String.valueOf(x);  //first convert integer into string
		int l = v.length();            // find the length of string
		
				for(int i=0; i<l; i++) {    //loop is iterating till the half of the length, because if from start and end(half) of string is 
											  //matching then a value is paliondrome otherewise not a palindrome.
			if(v.charAt(i) !=v.charAt(l-i-1))   //comparing if starting and ending is matching or not if not retrun false;
				return false;
			System.out.println("value of i " + i);
		}
		return true;
	}
}
