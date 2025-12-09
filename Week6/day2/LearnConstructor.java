package week6.day2;

public class LearnConstructor {
	int a; // global variable : Only declared here
	String name;
	public LearnConstructor() {
		a=9;
		name="bhuvanesh";
		System.out.println(a +"  : "+name);
	}
	LearnConstructor(String companyName){
		System.out.println("The company Name is "+companyName);
	}
	LearnConstructor(String companyName,String location){
		System.out.println("The company Name is "+companyName);
		System.out.println("The company is located near "+location);
	}
	
public static void main(String[] args) {
	new LearnConstructor("TestLeaf","chennai");
	new LearnConstructor();
	
}
}
