package stringhandling;

public class IndexOfDemo {

	public static void main(String[] args) {
		
		String str = "I love Java programming";
		
		System.out.println(str.indexOf("Java"));
		
		System.out.println(str.indexOf('m'));
		
		System.out.println(str.indexOf("Python")); // -1
		System.out.println(str.indexOf('z')); // -1

	}

}
