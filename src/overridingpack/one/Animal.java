package overridingpack.one;

public class Animal {
	
	String type = "Animal";
	String color = "Black";
	
	public void eat() {
		System.out.println("Animal is eating");
	}
	
	public void sleep() {
		System.out.println("Animal is sleeping");
	}

}

class Dog extends Animal {
	
	//invisible inherited eat() method from Animal
	
	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
	
	public void bark() {
		System.out.println("Dog is barking");
	}
	
}

class Cat extends Animal {
	
	public void eat() {
		System.out.println("Cat is eating");		
	}
	
}
