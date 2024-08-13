package modifiers.access.publicmodifier.one;

public class Demo {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.model = "X3";
		car1.company = "BMW";
		System.out.println(car1.model);
		System.out.println(car1.company);
		car1.startCar();
		car1.stopCar();
		

	}

}
