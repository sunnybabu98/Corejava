package aamostaskjava;

public class countsumdigit {

	public static void main(String[] args) {
		int num = 456789;
		int sum = 0;
		while(num>0) {
			sum = sum+num%10;//4+5+6+7+8+9
			num=num/10;
		}
		System.out.println("sum of digit:"+sum);
	}

}
