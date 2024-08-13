package modifiers.access.publicmodifier.two;

import modifiers.access.publicmodifier.one.Car;

public class Sample {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.model = "Roma";
		car1.company = "Ferrari";
		System.out.println(car1.model);
		System.out.println(car1.company);
		car1.startCar();
		car1.stopCar();
		
	}

}
