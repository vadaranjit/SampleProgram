package interfaceExample;

public class Sbi implements Bank {

	@Override
	public void balance() {
		System.out.println("balance");		
	}

	@Override
	public void deposit() {
		System.out.println("deposit");		
	}
	
	public static void main(String args[]) {
		Sbi obs = new Sbi();
		obs.deposit();
		obs.balance();
		Bank.demo();
	}
}
