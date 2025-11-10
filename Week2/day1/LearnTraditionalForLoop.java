package week2.day1;

public class LearnTraditionalForLoop {

	public static void main(String[] args) {
		// print the odd number within the range of 10 
		// segment 1 : Declaration & Initialization
		// segment 2 : Condition --> true/false 
		// segment 3 : Iteration --> post incremental operation
		
		/// how many times variable 'i' want to check whether the number is odd or not ? 10 times 
		// loop 1 :
		// (s1;s2;s3)-->(1; 1<=10(true); 1)
		//............
		// loop 11 :
				// (s1;s2;s3)-->(11; 11<=10(false); gets out from the loop)
		
		for (int i = 1; i <=10 ; i++) {
			//solution==0;
			if (i%2!=0) {
				System.out.println(i);
			}
		}
	}
	

}
