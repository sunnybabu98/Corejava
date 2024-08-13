package classobjectdemo.two;

public class Car {
	
	String model;
	String company;
	String color;
	double milage;
	double price;
	int wheels;
	
	public void initVar(String mod,String com,String col,double mil,double pri,int whe) {
		
		model = mod;
		company = com;
		color = col;
		milage = mil;
		price = pri;
		wheels = whe;
				
	}
	
	public void startCar() {
		System.out.println("Car having "+model+" model and company "+company+" has started");
	}
	
	public void stopCar() {
		System.out.println("Car having "+model+" model and company "+company+" has stopped");
	}
	
	public void getCarDetails() {
		
		System.out.println("Model of the car is: "+model);
		System.out.println("Company of the car is: "+company);
		System.out.println("Color of the car is: "+color);
		System.out.println("Milage of the car is: "+milage);
		System.out.println("Price of the car is: "+price);
		System.out.println("Number of wheels of the car are: "+wheels);
		System.out.println("------------------------");
	}
	
}
