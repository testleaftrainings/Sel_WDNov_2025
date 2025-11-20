package week3.day4;

public class LearnStaticKeyword {
	// Global variable
	static String browser;// declaration
	String browser1;
	public static void loadUrl() {
		System.out.println("Browser : "+browser+" is launched and url is loaded");
	}
	
	{
	System.out.println("non static or Instance block");	
	}
	
	static {
		browser="Chrome";// initializing the static variable
		System.out.println("static block");	
	}
	

	public static void main(String[] args) {
		System.out.println(browser);
		loadUrl();
		// non static variable
		LearnStaticKeyword lsk = new LearnStaticKeyword();
		// System.out.println(lsk.browser1);
	}
}
