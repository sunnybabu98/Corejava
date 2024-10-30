package day11;

public class StudentMain {
    int sid;
    String sname;
    char grade;
    
    void printstudentdetails() {
    	System.out.println(sid+"  "+sname+" "+grade);
    }
    
	void StudentData(int id,String name,char gr) {
		sid = id;
		sname = name;
		grade = gr;
	}
	StudentMain(int id,String name,char gr){
		sid = id;
		sname = name;
		grade = gr;
	}
	
}
