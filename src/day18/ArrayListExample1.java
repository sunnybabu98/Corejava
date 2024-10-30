package day18;

import java.util.ArrayList;

public class ArrayListExample1 {
	 public static void main(String[] args) {
		  
		  //Declaration
		 ArrayList<String> list = new ArrayList<>();
	        
	        // Add values to the ArrayList
	        list.add("John");
	        list.add("David");
	        list.add("Scott");
	        list.add("Smith");

	        // Print the size of the ArrayList (optional)
	        System.out.println(list.size());

	        // Iterate through the ArrayList and print each element
	        for (String s : list) {
	            System.out.print(s);
	        }
	    }
	}