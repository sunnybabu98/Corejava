package modifiers.nonaccess.staticmodifier;

public class Demo {

	public static void main(String[] args) {
		
//		Car car1 = new Car();
//		System.out.println(car1.company);
//		System.out.println(car1.model);
//		System.out.println(car1.color);
//		System.out.println(Car.wheels);
//		
//		car1.startCar();
//		Car.stopCar();
		
		System.out.println(Car.company);
		System.out.println(Car.model);
		System.out.println(Car.color);
		System.out.println(Car.wheels);
		Car.startCar();
		Car.stopCar();

	}

}
