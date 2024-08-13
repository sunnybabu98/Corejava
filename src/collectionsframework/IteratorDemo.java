package collectionsframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.addAll(Arrays.asList(new Integer[]{9,1,5,7,2,3,6,4,8,12,29,33,99,122,77}));
		
		Iterator<Integer> itr = list.iterator();  
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("------------------------");
		
		Set<Integer> set = new HashSet<>();
		
		set.addAll(Arrays.asList(new Integer[]{9,1,5,7,2,3,6,4,8,12,29,33,99,122,77}));
		
		Iterator<Integer> itr2 = set.iterator();
		
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
