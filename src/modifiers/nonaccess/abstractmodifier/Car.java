package modifiers.nonaccess.abstractmodifier;


//Partial implementation or Partial abstraction
//Objects cannot be created for abstract classes
public abstract class Car {
	
	//abstract int a = 5;
	
	public void startCar() {
		System.out.println("Car started");
	}
		
	public void stopCar() {
		
		System.out.println("Car stopped");
		
	}
	
	public abstract void chargeCar(); // only declared or defined
	public abstract void openSunroof(); // only declared or defined
	public abstract void cruiseControlOn(); // only declared or defined

}
