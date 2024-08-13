package inheritancepack.five;

public class Cat extends Animal {
	
	public void sampleCat() {
		
		animalType = "Cat";
		System.out.println(animalType);
		animalColor = "Grey";
		System.out.println(animalColor);
		eat();
		sleep();
		
	}
	
}
