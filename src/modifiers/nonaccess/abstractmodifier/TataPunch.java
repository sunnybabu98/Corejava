package modifiers.nonaccess.abstractmodifier;

public class TataPunch extends Car{
	
	@Override
	public void cruiseControlOn() {
		System.out.println("Cruise Control of the car is on");
	}
	
	@Override
	public void chargeCar() {	
		System.out.println("Car charged");
	}
	
	@Override
	public void openSunroof() {
		System.out.println("Sunroof opened");
	}

}
