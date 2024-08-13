package collectionsframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		set.addAll(Arrays.asList(new Integer[]{9,1,5,7,9,2,3,6,1,4,8,99,122,132,231,456,99,999}));
		
		for(Integer e : set) {
			System.out.println(e);
		}
		
		//System.out.println(set);
		

		
//		List<Integer> list = new ArrayList<>();
//		
//		list.addAll(Arrays.asList(new Integer[] {9,1,5,7,9,2,3,6,1,4,8,99,122,132,231,456,99,999}));
		
//		for(Integer e : list) {
//			System.out.println(e);
//		}
		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		//System.out.println(list);

	}

}
