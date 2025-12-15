package week7.day1;

public class LearnExceptionHandling {

	public static void main(String[] args) throws InterruptedException {

		int [] array= {3,6,9};
		
		try {
			// 23/0--> ? zero
		    // java.lang.ArithmeticException
			System.out.println(23/1); 
			System.out.println(array[3]); //java.lang.ArrayIndexOutOfBoundsException
			// driver.findElement("locator");// NoSuchElement
			throw new Exception("CheckTheLocator");
		} catch (ArithmeticException e) {
			System.out.println(23/1); 
			Thread.sleep(3000);
			try {
				System.out.println(array[3]); //java.lang.ArrayIndexOutOfBoundsException
				throw new Exception("CheckTheLocator");
				
			} catch (ArrayIndexOutOfBoundsException e2) {
				System.out.println(array[array.length-1]);
			} catch (Exception e1) {
				System.out.println("driver.findElement(alternativeLocator)");
			}
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(array[array.length-1]);
		} catch (Exception e) {
			System.out.println("driver.findElement(alternativeLocator)");
		}
		finally {
			System.out.println("Finally block will implement the forcefully action here");
		}
	}

}
