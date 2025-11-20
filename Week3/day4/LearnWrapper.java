package week3.day4;

public class LearnWrapper {

	public static void main(String[] args) {

		// Covert the value from one datatype to another
		String productPrice ="₹2,34,514.00";
		// sorting string ---> LHS 
		//sorting integer ---> RHS {20000,90}
		String replacedString = productPrice.replaceAll("[₹,]","");
		System.out.println(replacedString);
		Double valueOf = Double.valueOf(replacedString);
		System.out.println(valueOf);
	}
}
