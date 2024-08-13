package inheritancepack.four;

public class Bank {
	
	String accountType1 = "Savings";
	String accountType2 = "Current";
	
	public void openAccount() {
		System.out.println("Bank account opened");
//		System.out.println(accountType1);
//		System.out.println(accountType2);
//		depositMoney();
//		withdrawMoney();
	}
	
	public void depositMoney() {
		System.out.println("Money deposited in Bank");
	}
	
	public void withdrawMoney() {
		System.out.println("Money withdrawn from Bank");
	}

}
