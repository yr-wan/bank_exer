package banking6;

//信用卡账户
public class CheckingAccount extends Account {
	private double overdraftProtection;// 透支额度

	public CheckingAccount(double balance) {
		super(balance);
	}

	public CheckingAccount(double balance, double protect) {
		super(balance);
		this.overdraftProtection = protect;
	}

	public boolean withdraw(double amt) {
		if (amt <= balance) {
			balance -= amt;
			return true;
		} else if ((amt - balance) <= overdraftProtection) {
			overdraftProtection -= (amt - balance);
			balance = 0;
			return true;
		} else {
			System.out.println("超过可透支额的限额！");
			return false;
		}

	}
}
