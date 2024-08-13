package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateNonExistantFilesDemo {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File(System.getProperty("user.dir")+"\\Motoori.txt");
		
		System.out.println(f1.exists()); //true
		
		File f2 = new File(System.getProperty("user.dir")+"\\qafoxtraining.txt");
		
		System.out.println(f2.exists()); // false
		
		// I want to create the file in the Project if it doesn't exists
		
		if(!f1.exists()) {
			f1.createNewFile();
		}else {
			System.out.println("File already exists. Hence not created");
		}
		
		if(!f2.exists()) {
			f2.createNewFile();
			System.out.println("File not exists. Hence created.");
		}else {
			System.out.println("File already exists. Hence not created");
		}
		
	}

}
