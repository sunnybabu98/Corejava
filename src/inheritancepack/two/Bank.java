package inheritancepack.two;

public class Bank {
	
	String accountType1 = "Savings";
	String accountType2 = "Current";
	
	public void openAccount() {
		System.out.println("Bank account opened");
	}
	
	public void depositMoney() {
		System.out.println("Money deposited in Bank");
	}
	
	public void withdrawMoney() {
		System.out.println("Money withdrawn from Bank");
	}

}
