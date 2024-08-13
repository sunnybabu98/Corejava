package inheritancepack.two;

public class Demo {

	public static void main(String[] args) {
		
		HDFCBank hdfcBank = new HDFCBank();
		System.out.println(hdfcBank.accountType1);
		System.out.println(hdfcBank.accountType2);
		System.out.println(hdfcBank.minimumBalance);
		
		hdfcBank.openAccount();
		hdfcBank.depositMoney();
		hdfcBank.withdrawMoney();
		hdfcBank.openAccountOnline();
		
	}

}
