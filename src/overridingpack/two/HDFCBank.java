package overridingpack.two;

class HDFCBank extends Bank {
	
	@Override
	public void openAccount() {
		System.out.println("HDFC Bank account opened");
	}
	
	@Override
	public void depositMoney() {
		System.out.println("Money deposited into the HDFC Bank");
	}
	
	@Override
	public void withdrawMoney() {
		System.out.println("Money withdrawn from the HDFC Bank");
	}
	
}

