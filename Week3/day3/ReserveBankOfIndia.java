package week3.day3;

public interface ReserveBankOfIndia {
	// Interface will only provides the design, 
	//or information using which the class is to build
	// unimplemented or Abstract method-> can only be created
	void repoRate();//{body of the method}
	void reverseRepoRate();
	void crr();
	// Backward Comparability is established here
	default void nationalPaymentCorporationIndia() {
		System.out.println("It oversees and improves payment systems like NEFT and RTGS");
	}

}
