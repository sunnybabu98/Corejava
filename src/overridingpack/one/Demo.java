package overridingpack.one;

public class Demo {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.eat(); // Overriding
		dog.sleep(); 
		
		Cat cat = new Cat();
		cat.eat();  //Override
		cat.sleep();
 
	}

}
