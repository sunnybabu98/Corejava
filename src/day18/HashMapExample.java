package day18;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	 public static void main(String[] args) {
		  
		 // Create a HashMap
	        HashMap<Integer, String> hm = new HashMap<>();
	        
	        // Adding values to HashMap
	        hm.put(101, "John");
	        hm.put(102, "Scott");
	        hm.put(103, "David");
	        hm.put(104, "Smith");
	        hm.put(105, "Kim");
	        
	        // Print the HashMap
	        System.out.println(hm);
	        
	        // Remove a pair from HashMap
	        hm.remove(103);
	        System.out.println("After removing pair from HashMap: " + hm);
	        
	        // Add another pair to HashMap
	        hm.put(106, "XYZ");
	        System.out.println(hm);
	        
	        // Get value associated with key 104
	        System.out.println("The Value is: " + hm.get(104)); // Output: Smith
	        
	        // Read pairs from HashMap using entrySet()
	        for (Map.Entry<Integer, String> m : hm.entrySet()) {
	            System.out.println(m.getKey() + "   " + m.getValue());
	        }
	    }
	}	