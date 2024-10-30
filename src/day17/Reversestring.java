package day17;

public class Reversestring {
	 public static void main(String[] args) {
		 String str = "Sunny babu kusuma";
	
		 StringBuilder reversed = new StringBuilder(str).reverse();
		 System.out.println("The reverse string is:"+reversed);
	 }
}
