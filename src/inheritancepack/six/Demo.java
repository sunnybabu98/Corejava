package inheritancepack.six;

public class Demo {

	public static void main(String[] args) {
		
//		Dog dog = new Dog();
//		dog.type = "Dog";
//		dog.color = "Brown";
//		System.out.println(dog.type);
//		System.out.println(dog.color);
//		System.out.println(dog.tail);
//		System.out.println(dog.legs);
//		dog.eat();
//		dog.sleep();
//		dog.bark();
		
//		Animal animal = new Animal();
//		animal.type = "Animal";
//		System.out.println(animal.type);
//		animal.color = "Black";
//		System.out.println(animal.color);
//		animal.eat();
//		animal.sleep();
		
		Animal animal = new Dog();
		animal.type = "Dog";
		System.out.println(animal.type);
		animal.color = "Brown";
		System.out.println(animal.color);
		System.out.println(animal.tail); // false
		//System.out.println(animal.legs);
		animal.eat();
		animal.sleep();
		//animal.bark();
	}

}
