package week2.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {

		// Create an arrays using the literal way
		// syntax : type[] name = {moreThanOneValue};
		int[] empId= {234,678,243,534,912};
		// Consecutive memory location --> in an organized order
		// an organized order --> Index, will always starts with 0
		// to retrieve a value using array
		// syntax : arrayName[indexValue]
		Arrays.sort(empId);
		System.out.println("Print all the empId's");
		for (int i = 0; i < empId.length; i++) {
			System.out.println(empId[i]);
		}	
		// Create an arrays using the instantiation way
		// syntax : type[] name = new type[size];
		String[] empName = new String[empId.length];
		empName[0]="Bhuvanesh";
		empName[1]="Vineeth";
		empName[2]="Harrish";
		empName[3]="Saranya";
		empName[4]="Seenivasan";
		empName[0]="Vinoth";
		for (int i = 0; i < empName.length; i++) {
			if (empName[i]=="Vinoth") {
				System.out.println("Current employee of the company");
			}
		}
	}
}
