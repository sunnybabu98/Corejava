package classobjectdemo.one;

public class Demo {

	public static void main(String[] args) {
		
		Car bmwX3 = new Car();
		
		bmwX3.model = "X3";
		bmwX3.company = "BMW";
		bmwX3.color = "Blue";
		bmwX3.milage = 12.3;
		bmwX3.price = 5500000;
		bmwX3.wheels = 4;
		
		bmwX3.startCar();
		bmwX3.stopCar();
		bmwX3.getCarDetails();
		
		Car hod = new Car();
		
		hod.model = "Odessy";
		hod.company = "Honda";
		hod.color = "White";
		hod.milage = 14.23;
		hod.price = 15600000;
		hod.wheels = 4;
		
		hod.startCar();
		hod.stopCar();
		hod.getCarDetails();
		
		Car msvdi = new Car();
		
		msvdi.model = "SwiftVDI";
		msvdi.company = "Maruti";
		msvdi.color = "Red";
		msvdi.milage = 23.12;
		msvdi.price = 800000;
		msvdi.wheels = 4;
		
		msvdi.startCar();
		msvdi.stopCar();
		msvdi.getCarDetails();
		
		Car hyi20 = new Car();
		
		hyi20.model = "i20";
		hyi20.company = "Hyundai";
		hyi20.color = "Grey";
		hyi20.milage = 16.82;
		hyi20.price = 1200000;
		hyi20.wheels = 4;
		
		hyi20.startCar();
		hyi20.stopCar();
		hyi20.getCarDetails();
		

	}

}
