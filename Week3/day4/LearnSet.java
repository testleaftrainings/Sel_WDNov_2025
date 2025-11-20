package week3.day4;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
        
		// Interface <genericType> setName = new ImplementationClass<>();
		Set<String> fruitBucket ;
		fruitBucket = new HashSet<String>();
		fruitBucket.add("Apple");
		fruitBucket.add("Orange");
		fruitBucket.add("Grape");
		fruitBucket.add("Muskmelon");
		fruitBucket.add("apple");
		// regex 
		//fruitBucket.forEach(System.out::println);
		// tradational for loop
//		for (int i = 0; i < fruitBucket.size(); i++) {
//			System.out.println(fruitBucket.get(i)); // set does not have the method get()
//		}
		// ForEach loop 
		for (String setValue : fruitBucket) {
			System.out.println(setValue);
		}
		System.out.println("------Insertion Order-----");
		Set<String> insertionBucket = new LinkedHashSet<String>();
		//insertionBucket.addAll(fruitBucket);
		insertionBucket.add("Apple");
		insertionBucket.add("Orange");
		insertionBucket.add("Grape");
		insertionBucket.add("Muskmelon");
		insertionBucket.add("apple");
		insertionBucket.forEach(System.out::println);
		
		System.out.println("------Sorted Order-----");
		Set<String> sortedBucket = new TreeSet<String>(insertionBucket);
		sortedBucket.forEach(System.out::println);
	}

}
