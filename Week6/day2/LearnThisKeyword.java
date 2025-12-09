package week6.day2;

public class LearnThisKeyword {
	long area;
	int charges;
	
	public LearnThisKeyword(int charges){
		this.charges=charges;
		System.out.println("Charges per square feet is "+this.charges);
		
	}
	public LearnThisKeyword(long area) {
		this(200);
		area = area*area;
		System.out.println("total squarefeet is : "+area);
		this.area= area;
		double total ;
		total= this.area*charges;
		System.out.println("total painting charges along with labour is :"+ total);
	}
	

	public static void main(String[] args) {
		
		LearnThisKeyword obj = new LearnThisKeyword(40L);
		
	}

}
