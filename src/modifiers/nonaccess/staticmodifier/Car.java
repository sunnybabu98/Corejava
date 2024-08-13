package modifiers.nonaccess.staticmodifier;

public class Car {
	
	static String company = "BMW";
	static String model = "X3";
	static String color = "Blue";
	static int wheels = 4;
	
	public static void startCar() {
		System.out.println("Car started");
	}
	
	public static void stopCar() {
		System.out.println("Car stopped");		
	}
	
}