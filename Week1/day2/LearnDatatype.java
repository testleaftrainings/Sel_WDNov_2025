package week1.day2;

public class LearnDatatype {

	public static void main(String[] args) {
		// Client want to collect the employee's age - byte
		// syntax to create a variable :  1) declaration 2) initialization
		//                         datatype variableName;
		//      				   variableName = value  ;
		byte age; 
		age = 34;
		// Client want to collect the employee's id - short
		short empID = 343;
		// Client want to collect the employee's salary
		int empSalary = 100000;
		// Client want to collect the employee's Contact number
		long empPhoneNumber = 7898905641L;
		// Client want to collect the employee's pension scheme
		boolean empPensionScheme = true;
		// Client want's to display the interest rate
		float empInterestRate = 6.8597f;
		// Client want to collect the employee's Name
		String empName ="Bhuvanesh Moorthy";
		// company logo 
		char logo = '€';
		System.out.println("ABC PRIVATE LIMITED EMPLOYEE PORTAL");
		System.out.println("employee's age :"+age);
		System.out.println("employee's ID :"+empID);
		System.out.println("employee's salary: "+empSalary);
		System.out.println("employee's Contact number :"+empPhoneNumber);
		System.out.println("employee's pension scheme status :"+empPensionScheme);
		System.out.println("employee's interest rate for pension scheme :"+empInterestRate);
		System.out.println("employee's Name :"+empName);
		System.out.println(logo);
	}
}
