package day12;

public class Add {
   int a=10,b=20;
   
   void sum() {
	   System.out.println(a+b);
   }
   void sum(int a, int b){
	   System.out.println(a+b);
   }
   void sum(int x,double y) {
	   System.out.println(x+y);
   }
   void sum(double x,int y) {
	   System.out.println(x+y);
   }
   void sum(int a, int b,int c){
	   System.out.println(a+b+c);
   }
}
