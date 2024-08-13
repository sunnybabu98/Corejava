package filehandling;

import java.io.File;
import java.io.IOException;

public class CreatingFilesDemo {

	public static void main(String[] args) throws IOException {
		
		//Representing the file
		File qafoxFile = new File(System.getProperty("user.dir")+"\\Files\\qafox.txt");
		
		//Create the above represented file
		qafoxFile.createNewFile();
	
		System.out.println("End of this program.");

	}

}
