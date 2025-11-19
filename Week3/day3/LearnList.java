package week3.day3;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		//List<WrapperClass> nameOfTheList = new ImplementationClass<>();
		List<String> mentorsList ;
		mentorsList = new ArrayList<String>();
		// include the elements into list using the add()
		mentorsList.add("Bhuvanesh");//0,1,2
		mentorsList.add("Harrish");
		mentorsList.add("Vineeth");
		mentorsList.add("Vinoth");
		mentorsList.add("Saranya");
		// retrieve  the elements from list using get(index)
		// retrieve  the last elements from list using getLast()
		System.out.println(mentorsList.getLast());
		System.out.println("*******");
		//System.out.println(mentorsList);
		//mentorsList.forEach(System.out::println);
		// remove  the elements from list using 
		System.out.println("Remove value from the list is : "+mentorsList.remove(4));
		//The list will be empty after this call
		//mentorsList.clear();
		System.out.println("--updated list--");
		mentorsList.forEach(System.out::println);
		// validate the value inside the list 
		System.out.println("--validation--");
		boolean validation = mentorsList.contains("Saranya");
		System.out.println(validation);
		


		
	}

}
