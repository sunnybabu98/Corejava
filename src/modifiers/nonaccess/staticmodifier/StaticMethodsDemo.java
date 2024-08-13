package modifiers.nonaccess.staticmodifier;

public class StaticMethodsDemo {
	
	static int a = 5;
	int b = 10;
	
	//static methods can only access static stuff directly
	//static methods have to access non-sttaic stuff by creating object for the class
	public static void main(String[] args) {
		
		System.out.println(a);
		StaticMethodsDemo smd = new StaticMethodsDemo();
		System.out.println(smd.b);
		smd.sampleOne();
		sampleTwo();
		
	}
	
	//No rules and No regulations
	//non-static methods can access both static and non-static stuff directly
	public void sampleOne() {
		System.out.println(a);
		System.out.println(b);
		sampleTwo();
		sampleThree();
		System.out.println("Inside sampleOne");		
	}
	
	public static void sampleTwo() {
		System.out.println("Inside sampleTwo");
	}
	
	public void sampleThree() {
		System.out.println("Inside sampleThree"); 
	}

}
