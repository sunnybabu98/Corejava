package methodspack;

public class MultipleTimesCallingDemo {

	public static void main(String[] args) {
		
		System.out.println("Start of main method");
		
		sampleMethodA();  // 1st time
		sampleMethodA();  // 2nd time
		sampleMethodA();  // 3rd time
		sampleMethodA();  // 4th time
		sampleMethodA();  // 5th time
		
		System.out.println("End of main method");

	}
	
	public static void sampleMethodA() {
		
		System.out.println("Inside sampleMethodA");
		
	}

}
