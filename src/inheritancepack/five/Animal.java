package inheritancepack.five;

public class Animal {
	
	String animalType;
	String animalColor;
	
	public void eat() {
		System.out.println("Animal is eating");		
	}
	
	public void sleep() {
		System.out.println("Animal is sleep");
	}
	
	public void animalSample() {
		
		animalType = "Animal";
		animalColor = "Black";
		
		eat();
		sleep();
		
	}
	
}
