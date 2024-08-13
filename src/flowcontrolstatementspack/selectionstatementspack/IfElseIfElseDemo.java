package flowcontrolstatementspack.selectionstatementspack;

public class IfElseIfElseDemo {

	public static void main(String[] args) {
		
		//int a = 9, b = 8, c = 6, d = 4, e = 1;
		//int a = 5, b = 8, c = 6, d = 4, e = 1;
		//int a = 9, b = 5, c = 6, d = 4, e = 1;
		//int a = 9, b = 8, c = 6, d = 0, e = 1;
		int a = 5, b = 6, c = 7, d = 0, e = 1;
		
		if(a<b) {
			System.out.println("a is less than b");
		}else if(b<c) {
			System.out.println("b is less than c");
		}else if(c<d) {
			System.out.println("c is less than d");
		}else if(d<e) {
			System.out.println("d is less than e");
		}else {
			System.out.println("e is the least of all.");
		}
		
		System.out.println("End of this program.");
	
	}

}
