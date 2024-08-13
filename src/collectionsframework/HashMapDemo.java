package collectionsframework;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<String,Object> hmap = new HashMap<>();
		
		hmap.put("FirstName","Arun");
		hmap.put("LastName","Motoori");
		hmap.put("Company","QAFox");
		hmap.put("Experience",17);
		hmap.put("Location","Hyderabad");
		hmap.put("Location","Secunderabad");
		hmap.put("Place","Secunderabad");
		hmap.put("Job Status",false);
		hmap.put("Profession","Trainer");
		hmap.put("Designation","Trainer");
		
//		System.out.println(hmap.get("Location"));
//		System.out.println(hmap.get("Profession"));
//		System.out.println(hmap.get("Designation"));
		
//		for(String k : hmap.keySet()) {
//			System.out.println(k+" : "+hmap.get(k));
//		}
		
		for(Entry<String,Object> e : hmap.entrySet()) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		

	}

}
