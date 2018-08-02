package banking2;

public class Account {
	private double balance;

	public Account(double init_balance) {
		this.balance = init_balance;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amt) {
		balance += amt;
	}

	public void withdraw(double amt) {
		if (amt <= balance) {
			balance -= amt;
		} else {
			System.out.println("Óà¶î²»×ã");
		}
	}
}
