package filehandling;

import java.io.File;

public class RepresentingAFileDemo {

	public static void main(String[] args) {
		
		//Representation of a file in Java which is outside the Project workspace
		//Better not to represent a file outside the project workspace
		File f1 = new File("C:\\Users\\arunm\\Downloads\\Batch2Files\\Arun.txt");
		
		//Representation of a file in Java which is inside the Project workspace
		//But don't give full path
		File f2 = new File("C:\\QAFox\\BatchTwo\\JavaProjectOne\\Motoori.txt");
		//Give this kind of shortcut way
		File f3 = new File("Motoori.txt");
		
		File f4 = new File("Files\\Batch2.txt");
		
		//Dynamically getting the path of the Project
		String projectLocation = System.getProperty("user.dir");
		System.out.println(projectLocation);
		
		//The best way to represent files in Java within the Project workspace
		File f5 = new File(System.getProperty("user.dir")+"\\Motoori.txt");
		File f6 = new File(System.getProperty("user.dir")+"\\Files\\Batch2.txt");
		
		// Either double backward slash or single forward slash
		File f7 = new File("C:/Users/arunm/Downloads/Batch2Files/Arun.txt");
		
		File f8 = new File(System.getProperty("user.dir")+"/Motoori.txt");
		File f9 = new File(System.getProperty("user.dir")+"/Files/Batch2.txt");
		
		
		
//		String str = "Arun\\Motoori"; // \\ is the escape sequence for \
//		System.out.println(str);

	}

}
