package interfacepack;

public class ICICIBank implements Bank {

	@Override
	public void openAccount() {
		System.out.println("Account opened in ICICI Bank");		
	}

	@Override
	public void depositMoney() {
		System.out.println("Amount withdrawn from ICICI Bank");
	}

	@Override
	public void transferMoney() {
		System.out.println("Amount transferred from ICICI Bank");
	}

	@Override
	public void withdrawMoney() {
		System.out.println("Amount withdrawn from ICIC Bank");
	}


}
