package collectionsframework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo2 {

	public static void main(String[] args) {
		
		Map<String,Object> map = new HashMap<>();
		
		map.put("FirstName","Arun");
		map.put("LastName","Motoori");
		map.put("Company","QAFox");
		map.put("Experience",17);
		map.put("Location","Hyderabad");
		map.put("Location","Secunderabad");
		map.put("Place","Secunderabad");
		map.put("Job Status",false);
		map.put("Profession","Trainer");
		map.put("Designation","Trainer");
		
//		System.out.println(hmap.get("Location"));
//		System.out.println(hmap.get("Profession"));
//		System.out.println(hmap.get("Designation"));
		
//		for(String k : hmap.keySet()) {
//			System.out.println(k+" : "+hmap.get(k));
//		}
		
		for(Entry<String,Object> e : map.entrySet()) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		

	}

}
