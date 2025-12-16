package week7.day2;

import java.util.Locale;

import com.github.javafaker.Faker;

public class LearnFakerClass {

	public static void main(String[] args) {
		Faker faker = new Faker(Locale.US);
		// form page in the create Lead(duplicate test data)/Account(unqiue test data) functionality
		// cname , fname , lname, email
		String cname = faker.company().name().replaceAll("[^A-Za-z]", "");
		System.out.println(cname);
		String fname = faker.name().firstName();
		System.out.println(fname);
		String lname = faker.name().lastName();
		System.out.println(lname);
		String email;
		email=fname.toLowerCase()+"."+lname.toLowerCase()+"@"+cname.toLowerCase()+".com";
		System.out.println(email);
		// Test DATA Management

	}

}
