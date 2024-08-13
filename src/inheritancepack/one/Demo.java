package inheritancepack.one;

public class Demo {

	public static void main(String[] args) {
		
		HDFCBank hdfcBank = new HDFCBank();
		
		System.out.println(hdfcBank.accountType1);
		System.out.println(hdfcBank.accountType2);
		
		hdfcBank.openAccount();
		hdfcBank.depositMoney();
		hdfcBank.withdrawMoney();
		
	}

}
