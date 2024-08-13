package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionsDemoTwo {

	public static void main(String[] args) {
		
		System.out.println("Start of the program.");
		
		File file1 = new File("xyz.txt");
		
		try {
			FileInputStream fis = new FileInputStream(file1);
		}catch(FileNotFoundException e) {
			System.out.println("File is not found at the given location. Hence unable to read it.");
		}
		
		System.out.println("End of this program.");

	}

}
