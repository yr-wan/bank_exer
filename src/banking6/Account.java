package banking6;

public class Account {
	protected double balance;
	
	public Account(double init_balance) {
		this.balance = init_balance;
	}
	
	public double getBalance() {
		return balance;
	}
	public boolean deposit(double amt) {
		balance += amt;
		return true;
	}

	public boolean withdraw(double amt) {
		if (amt <= balance) {
			balance -= amt;
			return true;
		} else {
			System.out.println("Óà¶î²»×ã");
			return false;
		}
	}
}


