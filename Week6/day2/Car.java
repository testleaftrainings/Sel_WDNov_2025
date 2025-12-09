package week6.day2;

public class Car extends Vechicle {

	public Car(int num) {
		super(num);
	}

	@Override
	public void brandName(String name) {
		super.brandName("Hyndai");
		System.out.println("The brandname form the car class is " + name);
	}

	public static void main(String[] args) {
		Car car = new Car(9887);
		car.brandName("Honda");
	}
}
