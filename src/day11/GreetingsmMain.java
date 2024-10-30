package day11;

public class GreetingsmMain {

	public static void main(String[] args) {
		
		Greetings gr = new Greetings();
		gr.m1();//1
		
		
		String s = gr.m2();//2
		System.out.println(s);
		
		gr.m3("Sunny");//3
		
		String var = gr.m4("Sunny");//2
		System.out.println(var);
	}

}
