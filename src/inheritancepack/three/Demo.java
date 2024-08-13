package inheritancepack.three;

public class Demo {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		System.out.println(bank.accountType1);
		System.out.println(bank.accountType2);
		//System.out.println(bank.minimumBalance); - Not possible
		bank.openAccount();
		bank.depositMoney();
		bank.withdrawMoney();
		//bank.openAccountOnline(); - Not possible
		
		
	}

}
