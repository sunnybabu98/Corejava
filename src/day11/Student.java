package day11;

public class Student {
public static void main(String[] args) {
	//StudentMain std = new StudentMain();
	//using object reference
	/*std.sid=100;
	std.sname="sunny";
	std.grade='a';
	std.printstudentdetails();
	//using method reference
	std.StudentData(102, "Bunnybabu",'c');*/
	
	//using constructor
	StudentMain std = new StudentMain(101,"sunny",'g');
	std.printstudentdetails();
}
}
