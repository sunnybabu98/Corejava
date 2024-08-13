package stringhandling;

public class EqualsDemo {

	public static void main(String[] args) {
		
		String str1 = "Arun";
		String str2 = "Varun";
		String str3 = "Arun";
		
		System.out.println(str1.equals(str2)); //false
		System.out.println(str1.equals(str3)); //true

	}

}
