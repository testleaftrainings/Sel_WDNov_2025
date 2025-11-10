package week2.day1;

public class LearnIncrementalOperator {

	public static void main(String[] args) {
     int i =1;
     int j =1;
     //post incremental i++ --> i+1 --> 2
     // retrieve the value 1st, then performs the incremental operation 
     System.out.println(i++); // output --> 1
     System.out.println(i);// output --> 2 
     // pre incremental operators 
     // performs the incremental operation 1st --> 1+1 --> 2
     System.out.println(++j); // output --> 2
	}

}
