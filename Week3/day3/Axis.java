package week3.day3;

public class Axis extends AxisHQ {
	
	@Override
	public void repoRate() {
		System.out.println("For the month of november repo rate at 5.50%");
	}

	@Override
	public void reverseRepoRate() {
		System.out.println("For the month of november reverse repo rate at 3.35%");
	}

	@Override
	public void crr() {
		System.out.println("For the month of november Cash Reserve Ratio (CRR): 3.00%");
	}
	
	public static void main(String[] args) {
		Axis branch = new Axis();
		branch.repoRate();
		branch.reverseRepoRate();
		branch.crr();
		branch.headOfficeLocation();
		branch.retailLoanLimit();
		branch.nationalPaymentCorporationIndia();
		
	}

	@Override
	void retailLoanLimit() {
	System.out.println("Retail loan amount less than 10 lakhs can be proved by the branch");
		
	}

}
