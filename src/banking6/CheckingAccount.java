package banking6;

//���ÿ��˻�
public class CheckingAccount extends Account {
	private double overdraftProtection;// ͸֧���

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
			System.out.println("������͸֧����޶");
			return false;
		}

	}
}
