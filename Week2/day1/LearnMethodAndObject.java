package week2.day1;

public class LearnMethodAndObject {
	String value ="calucated the Painting cost of the house";
	// void methodName(){boby of the method}
	// area of the square : a*a
	public int areaOfSquare(int a) {
		int c;
		c = a*a;
		return c;	
	}
	public void totalCost(int squareFeet, int charges) {
		int total ;
		total= squareFeet*charges;
		System.out.println("total painting charges along with labour is :"+ total);
	}
	
	//QA(methods and varibales) ->Lead/Manager(Object) ->CEO(class)
	public static void main(String[] args) {
	// Create a Object , by which methods or variables can be executed
		// ClassName objName  = new  ClassName();
		LearnMethodAndObject lmo = new LearnMethodAndObject();
		System.out.println(lmo.value);
		int areaOfSquare = lmo.areaOfSquare(40);// return  // to store a expression as local variable --> ctrl+2,
		System.out.println("total area to be painted in the house :"+areaOfSquare);
		lmo.totalCost(areaOfSquare, 400);// void
		
		// medium range
		LearnMethodAndObject lmo1 = new LearnMethodAndObject();
		System.out.println(lmo1.value);
		int areaOfSquare1 = lmo1.areaOfSquare(80);// return  // to store a expression as local variable --> ctrl+2,
		System.out.println("total area to be painted in the house :"+areaOfSquare1);
		lmo.totalCost(areaOfSquare1, 250);// void
		}
}
