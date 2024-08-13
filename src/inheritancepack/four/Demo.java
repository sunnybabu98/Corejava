package inheritancepack.four;

public class Demo {

	public static void main(String[] args) {
		
		HDFCBank hdfc = new HDFCBank();
		
		hdfc.sampleHDFC();
		System.out.println(hdfc.accountType1);
		System.out.println(hdfc.accountType2);
		hdfc.openAccount();
		hdfc.depositMoney();
		hdfc.withdrawMoney();

	}

}
