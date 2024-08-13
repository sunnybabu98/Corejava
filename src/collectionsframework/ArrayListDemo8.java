package collectionsframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo8 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
//		String[] ar = {"Arun","Varun","Tharun","Kishore","Praveen","Rakesh"};
//		List<String> clist = Arrays.asList(ar);
//		list.addAll(clist);
		
		list.addAll(Arrays.asList(new String[]{"Arun","Varun","Tharun","Kishore","Praveen","Rakesh"}));
		
		System.out.println(list);
	
//		list.add("Arun");
//		list.add("Varun");
//		list.add("Tharun");
//		list.add("Kishore");
//		list.add("Praveen");
//		list.add("Rakesh");

	}

}
