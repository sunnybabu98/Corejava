package classobjectdemo.four;

public class Demo {

	public static void main(String[] args) {
		
		Car bmwX3 = new Car("X3", "BMW", "Blue", 12.3, 5500000);
	
		bmwX3.startCar();
		bmwX3.stopCar();
		bmwX3.getCarDetails();
		
		Car hod = new Car("Odessy","Honda","White",14.23,15600000);
		
		hod.startCar();
		hod.stopCar();
		hod.getCarDetails();
		
		Car msvdi = new Car("SwiftVDI","Maruti","Red",23.12,800000);

		msvdi.startCar();
		msvdi.stopCar();
		msvdi.getCarDetails();
		
		Car hyi20 = new Car("i20", "Hyundai", "Grey", 16.82,1200000);
	
		hyi20.startCar();
		hyi20.stopCar();
		hyi20.getCarDetails();
		

	}

}
