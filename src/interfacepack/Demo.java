package interfacepack;

public class Demo {

	public static void main(String[] args) {
		
		//new Bank(); //Objects cannot be created for an interface
		System.out.println(Bank.ACCOUNT_TYPE_1);
		System.out.println(Bank.ACCOUNT_TYPE_2);
		HDFCBank hdfc = new HDFCBank();
		hdfc.openAccount();
		hdfc.depositMoney();
		hdfc.transferMoney();
		hdfc.withdrawMoney();
		hdfc.attachAdhaarAndPan();
		Bank.newTaxation();
		Bank bank = new HDFCBank();
		bank.openAccount();
		bank.depositMoney();
		bank.transferMoney();
		bank.withdrawMoney();
		
	}

}
