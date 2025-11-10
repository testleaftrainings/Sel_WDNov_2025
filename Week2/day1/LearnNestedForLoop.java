package week2.day1;


public class LearnNestedForLoop {

	public static void main(String[] args) {
		// print the star pattern
		
		for (int i = 0; i < 6; i++) {// row 
			for (int j = 0; j <=i; j++) {// colum
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
