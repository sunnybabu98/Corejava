package day10;

public class Employe {
     //variable 
	int eid;
	String ename;
	String job;
	int sal;
	//method
	void display(){
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
		
	}
	public static void main(String[] args) {
		Employe emp1 = new Employe();//object
		emp1.eid=101;
		emp1.ename="sunny";
		emp1.job="Test Engineer";
		emp1.sal=45000;
		emp1.display();
		
		Employe emp2 = new Employe();//object
		emp2.eid=102;
		emp2.ename="bunny";
		emp2.job=" Engineer";
		emp2.sal=45000;
		emp2.display();
	}

}
