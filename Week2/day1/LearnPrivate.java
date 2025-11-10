package week2.day1;

public class LearnPrivate {

	public static void main(String[] args) {
		LearnMethodAndObject lp = new LearnMethodAndObject();
		System.out.println(lp.value);
		int areaOfSquare = lp.areaOfSquare(30);// return  // to store a expression as local variable --> ctrl+2,
		System.out.println("total area to be painted in the house :"+areaOfSquare);
		lp.totalCost(areaOfSquare, 250);// void

	}

}
