package week1.day2;

public class LearnSelectionStatement {

	public static void main(String[] args) {
		boolean empPensionScheme = false;
		if (empPensionScheme) {
			float empInterestRate = 6.8597f;
			System.out.println("employee's interest rate for pension scheme :"+empInterestRate);
		}
		else {
			System.out.println("Please subscribe with anyone of the employee pension scheme");
		}
		
		int a = 5;
		int b = 8;
		  //false
		if (a==b) {
			System.out.println("both the values are same");
		}
		      //false  
		else if (a<=b) {
			System.out.println("b is greter than a");
		}
		else if (a>=b) {
			System.out.println("a is greter than b");
		}
		else {
			System.out.println("both the values were not same");
		}
		// switch case 
		// cross browser testing
		switch (b) {
		case 3:
			System.out.println("sprint review meeting is scheduled");
			break;

		default:
			System.out.println("Value is out of range");
			break;
		}
		
	}
}
