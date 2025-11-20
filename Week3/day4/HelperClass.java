package week3.day4;
// class level
// The type LearnStaticKeyword cannot subclass the final class HelperClass
public final class HelperClass  extends LearnStaticKeyword {
	//variable level
	final double pi = 3.1423; // it cannot be modified
	// method level
	public final void scientificCals() {
		System.out.println("Calculation implementation cannot be overridden");
	}
	
	public static void main(String[] args) {
		HelperClass hc = new HelperClass();
		System.out.println(hc.pi);
	}

}
