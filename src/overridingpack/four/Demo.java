package overridingpack.four;

public class Demo {

	public static void main(String[] args) {
		
		HDFCBank hBank = new HDFCBank();
		hBank.deposit();
		hBank.deposit(3000);

	}

}
