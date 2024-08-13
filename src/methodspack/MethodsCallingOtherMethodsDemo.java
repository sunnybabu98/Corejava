package methodspack;

public class MethodsCallingOtherMethodsDemo {

	public static void main(String[] args) {
		
		System.out.println("Start of main method");
		
		sampleA();
		
		System.out.println("End of main method");
		
	}
	
	public static void sampleA() {
		
		System.out.println("Start of sampleA");
		
		sampleB();
		
		System.out.println("End of sampleA");
		
	}
	
	public static void sampleB() {
		
		System.out.println("Start of sampleB");
		
		sampleC();
		
		System.out.println("End of sampleB");
		
	}
	
	public static void sampleC() {
		
		System.out.println("Start of sampleC");
		
		String[] arr = {"Arun","Varun","Tharun"};
		
		//main(arr); //Why we should not call a main method - It will result in StackOverFlowError
		
		System.out.println("End of sampleC");
		
	}

}
