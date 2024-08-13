package overridingpack.four;

public class Bank {
	
	public void deposit() {
		System.out.println("Amount deposited in Bank");
	}

	
}

class HDFCBank extends Bank {

	@Override
	public void deposit() {
		System.out.println("Amount deposited in HDFC Bank");
	}
	
	//Overloaded method
	public void deposit(int amount) {
		System.out.println(amount+" got deposted in HDFC Bank");
	}
	
}
