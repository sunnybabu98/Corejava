package overridingpack.three;

public class Animal {
	
	public Animal() {
		System.out.println("Inside consturctor of Animal class");		
	}

}

class Dog extends Animal {
	
	public Dog(){
		System.out.println("Inside constructor of Dog class");		
	}
	
	//Since there is no possibility of duplicate parent class constructors in child class
	//Hence constructor Overriding is not possible in Java
//	public Animal() {
//		
//	}
	
}
