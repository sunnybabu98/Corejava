package stringhandling;

public class SplitMethodDemo {

	public static void main(String[] args) {
		
		String str = "I love Java programming";
		
		String[] ar = str.split(" ");
		
		System.out.println(ar[0]); // I
		System.out.println(ar[1]); //love
		System.out.println(ar[2]); // Java
		System.out.println(ar[3]); // programming
		
		String str2 = "My-name-is-Arun-Motoori";
		
		String[] ar1 = str2.split("-");
		
		System.out.println(ar1[0]); // My
		System.out.println(ar1[1]); // name
		System.out.println(ar1[2]); // is
		System.out.println(ar1[3]); // Arun
		System.out.println(ar1[4]); // Motoori
		
		
	}

}
