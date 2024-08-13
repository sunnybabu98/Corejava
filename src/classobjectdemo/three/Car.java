package classobjectdemo.three;

public class Car {
	
	String model;
	String company;
	String color;
	double milage;
	double price;
	int wheels;
	
	public void initVar(String model,String company,String color,double milage,double price,int wheels) {
		
		this.model = model;
		this.company = company;
		this.color = color;
		this.milage = milage;
		this.price = price;
		this.wheels = wheels;
				
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
