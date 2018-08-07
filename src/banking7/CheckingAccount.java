package banking7;

//信用卡账户
public class CheckingAccount extends Account {
	private Double overdraftProtection;// 透支额度

	public CheckingAccount(double balance) {
		super(balance);
	}

	public CheckingAccount(double balance, double protect) {
		super(balance);
		this.overdraftProtection = protect;
	}

	public void withdraw(double amt) throws OverdraftException {
		if (amt <= balance) {
			balance -= amt;
		} else{
			if(overdraftProtection == null){
				throw new OverdraftException("no overdraft protection", amt - balance);
			}else if((amt - balance) >= overdraftProtection){
				throw new OverdraftException("Insufficient funds for overdraft protection", amt - balance);
			}else{
				overdraftProtection -= (amt - balance);
				balance = 0;
			}
		}

	}
}
