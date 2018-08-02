package banking5_2;

//���ÿ��˻�
public class CheckingAccount extends Account {
	private SavingAccount protcetedBy = null;// ͸֧����

	public CheckingAccount(double balance) {
		super(balance);
	}

	public CheckingAccount(double balance, SavingAccount protcet) {
		super(balance);
		this.protcetedBy = protcet;
	}

	public boolean withdraw(double amt) {
		if (amt <= balance) {
			balance -= amt;
			return true;
		} else if (protcetedBy != null &&(amt - balance) <= protcetedBy.getBalance()) {
			protcetedBy.withdraw(amt - balance);
			balance = 0;
			return true;
		} else {
			return false;
		}

	}
}
