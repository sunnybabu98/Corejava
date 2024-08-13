package collectionsframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
//		Integer[] ar = {9,5,7,1,6,4,2,3,8,122,99,77,9,13,17};
//		List<Integer> arlist = Arrays.asList(ar);
//		al.addAll(arlist);
		
//		Integer[] ar = {9,5,7,1,6,4,2,3,8,122,99,77,9,13,17};
//		al.addAll(Arrays.asList(ar));
		
		al.addAll(Arrays.asList(new Integer[] {9,5,7,1,6,4,2,3,8,122,99,77,9,13,17}));
		
		for(Integer e : al) {
			System.out.println(e);
		}

	}

}
