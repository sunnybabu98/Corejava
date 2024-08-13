package collectionsframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo7 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		//Collection<Integer> al2 = new ArrayList<>(); // Possible but not encouraged
		
		list.addAll(Arrays.asList(new Integer[] {9,5,7,1,6,4,2,3,8,122,99,77,9,13,17}));
		
		for(Integer e : list) {
			System.out.println(e);
		}

	}

}
