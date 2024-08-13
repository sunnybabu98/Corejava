package filehandling;

import java.io.File;

public class IsFileIsDirectlyDeleteDemo {

	public static void main(String[] args) {
		
		File f1 = new File(System.getProperty("user.dir")+"\\abc.txt");
		
		System.out.println(f1.isFile()); //true
		System.out.println(f1.isDirectory()); // false
		
		File f2 = new File(System.getProperty("user.dir")+"\\QAFoxTraining");
		
		System.out.println(f2.isFile()); //false
		System.out.println(f2.isDirectory()); // true
		
		f1.delete();
		
		f2.delete();
		
	}

}
