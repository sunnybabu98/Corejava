package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionsDemo {

	public static void main(String[] args) throws FileNotFoundException  {
		
//		int a = 5, b = 0, c;
//		c = a/b;
		
		File file1 = new File("abcd.txt");
		FileInputStream fis = new FileInputStream(file1);
		
		System.out.println("End of this program.");

	}

}
