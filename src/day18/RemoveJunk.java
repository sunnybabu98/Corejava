package day18;

public class RemoveJunk {

	public static void main(String[] args) {

		  String s = "å°?ç±³ä½“éªŒç‰ˆ latin string 01234567890";
		  String s1 = "@#$@#$@ testing #@$@#$@#$ Selenium !@#$@#$@# &&&& Java";
		  
		  //Regular Expression: [^a-zA-Z0-9]
		  
		  s = s.replaceAll("[^a-zA-Z0-9]", "");
		  System.out.println(s);
		  
		  s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		  System.out.println(s1);
		  
		  
		 }

		}
