package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFileInFolderDemo {

	public static void main(String[] args) throws IOException {
		
		File file1 = new File(System.getProperty("user.dir")+"\\QAFox\\arun1.txt");
		
		file1.createNewFile();
	
		
		File file2 = new File("QAFox","motoori1.txt");
		
		file2.createNewFile();
		
		System.out.println("End of this program.");

	}

}
