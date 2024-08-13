package modifiers.nonaccess.abstractmodifier;

public abstract class HondaAmaze2022 extends Car {
	
	@Override
	public void cruiseControlOn() {
		System.out.println("Cruise Control is on");		
	}
	
	//Two abstract methods will be inherited

}

abstract class HondaAmaze2023 extends HondaAmaze2022{
	
	@Override
	public void chargeCar() {
		System.out.println("Car charged");		
	}
	
	//One abstract method will be inherited
	
}

class HondaAmaze2024 extends HondaAmaze2023{

	@Override
	public void openSunroof() {
		System.out.println("Sunroof opened");		
	}
	
}
 
