package modifiers.access.privatemodifier.one;

public class Animal {
	
	private int legs = 4;
	private boolean tail = true;
	
	private void eat() {
		System.out.println("Animal is eating");
	}
	
	private void sleep() {
		System.out.println("Animal is sleeping");
	}
	
	public void sample() {
		
		System.out.println(legs);
		System.out.println(tail);
		eat();
		sleep();
		
	}

}
