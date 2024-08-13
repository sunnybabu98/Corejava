package inheritancepack.six;

public class Sample {

	public static void main(String[] args) {
		
		String animalName = "cat";
		
		Animal animal = null;
		
		if(animalName.equals("dog")) {
			animal = new Dog();
		}else if(animalName.equals("cat")) {
			animal = new Cat();
		}
		
		animal.eat();
		animal.sleep();
		
		
//		Animal animal = new Dog();
//		animal.eat();
//		animal.sleep();
//		animal = new Cat();
//		animal.eat();
//		animal.sleep();
		
		
		
		

	}

}
