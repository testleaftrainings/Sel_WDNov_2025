package week3.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		//List<WrapperClass> nameOfTheList = new ImplementationClass<>();
		List<String> mentorsList ;
		mentorsList = new ArrayList<String>();
		// include the elements into list using the add()
		mentorsList.add("Bhuvanesh");//0,1,2
		mentorsList.add("Vinoth");
		mentorsList.add("Vineeth");
		mentorsList.add("Harrish");
		mentorsList.add("Saranya");
		mentorsList.add("Bhuvanesh");
		//The list will be empty after this call
		//mentorsList.clear();
		// sorting the list 
		//mentorsList.sort();
		Collections.sort(mentorsList);
		System.out.println("--updated list--");
		//mentorsList.forEach(System.out::println);
		System.out.println("--for--");
		for (int i = 0; i < mentorsList.size(); i++) {
			System.out.println(mentorsList.get(i));
		}
			}

}
