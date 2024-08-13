package classobjectdemo.two;

public class Demo {

	public static void main(String[] args) {
		
		Car bmwX3 = new Car();
		
		bmwX3.initVar("X3", "BMW", "Blue", 12.3, 5500000, 4);
				
		bmwX3.startCar();
		bmwX3.stopCar();
		bmwX3.getCarDetails();
		
		Car hod = new Car();
		
		hod.initVar("Odessy","Honda","White",14.23,15600000,4);
				
		hod.startCar();
		hod.stopCar();
		hod.getCarDetails();
		
		Car msvdi = new Car();
		
		msvdi.initVar("SwiftVDI","Maruti","Red",23.12,800000,4);
		
		msvdi.startCar();
		msvdi.stopCar();
		msvdi.getCarDetails();
		
		Car hyi20 = new Car();
		
		hyi20.initVar("i20", "Hyundai", "Grey", 16.82,1200000,4);
	
		hyi20.startCar();
		hyi20.stopCar();
		hyi20.getCarDetails();
		

	}

}
