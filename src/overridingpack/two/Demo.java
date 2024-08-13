package overridingpack.two;

public class Demo {

	public static void main(String[] args) {
		
		HDFCBank hBank = new HDFCBank();
		hBank.openAccount();
		hBank.depositMoney();
		hBank.withdrawMoney();
		
		Bank bank = new Bank();
		bank.openAccount();
		bank.depositMoney();
		bank.withdrawMoney();
		
		Bank bank2 = new HDFCBank();
		bank2.openAccount();
		bank2.depositMoney();
		bank2.withdrawMoney();

	}

}
