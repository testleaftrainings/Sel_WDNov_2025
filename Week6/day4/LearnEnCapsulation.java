package week6.day4;

public class LearnEnCapsulation {
	
    // EnCapsulation : Binding the data and the code together
	private String browerName; // data

	// getter 
	public String getBrowerName() {
		return browerName;//code
	}

	// setter
	public void setBrowerName(String browerName) {
		this.browerName = browerName;// code
	}
	
	public static void main(String[] args) {
		LearnEnCapsulation le = new LearnEnCapsulation();
		le.browerName="Chrome";
		System.out.println(le.browerName);
	}

}
