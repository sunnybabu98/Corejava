package filehandling;

import java.io.File;

public class CreateFoldersDemo {

	public static void main(String[] args) {
		
		//Represent the folder
		File folder1 = new File(System.getProperty("user.dir")+"\\ArunMotoori");
		
		//Creates the folder
		folder1.mkdir();
		
		System.out.println("End of this program");

	}

}
