package filehandling;

import java.io.File;

public class CreatingNonExistantFoldersDemo {

	public static void main(String[] args) {
		
		File folder1 = new File(System.getProperty("user.dir")+"\\QAFox");
		
		if(!folder1.exists()) {
			folder1.mkdir();
			System.out.println("Folder doesn't exists.Hence created");
		}else {
			System.out.println("Folder already exists. Hence not created");
		}
	
		File folder2 = new File(System.getProperty("user.dir")+"\\QAFoxTraining");
		
		if(!folder2.exists()) {
			folder2.mkdir();
			System.out.println("Folder doesn't exists.Hence created");
		}else {
			System.out.println("Folder already exists. Hence not created");
		}

	}

}
