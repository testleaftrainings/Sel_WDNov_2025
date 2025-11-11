package week2.day2;

public class LearnString {

	public static void main(String[] args) {
     
		// Literal way of assigning the value 
		String companyName ="Testleaf"; //String Constant pool
		// instantiation way of assigning the value
		String name = new String("testleaf"); // Heap Memory
		String companyNameOne ="Testleaf"; //String Constant pool
		if (companyName.equalsIgnoreCase(name)) {
			System.out.println("Both the values are same");
		}
		else {
			System.out.println("Both the values are different");
		}
		int length = companyName.length();
		System.out.println("*** using contains***");
		boolean contains = companyName.contains("lea");
		System.out.println(contains);
		System.out.println("*** using toCharArray***");
		// convert the string into a char , print the each character within the string
		char[] charArray = companyName.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		System.out.println("*** using charAt***");
		for (int i = 0; i < length; i++) {
			System.out.println(companyName.charAt(i));
		}
		
	}

}
