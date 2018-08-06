package com.yrwan08.exer.jicheng;

/*
 *如果（取款金额<账户余额），
 *可直接取款
 *如果（取款金额>账户余额），
 *计算需要透支的额度
 *判断可透支额overdraft是否足够支付本次透支需要，如果可以
 *	将账户余额修改为0，冲减可透支金额
 *如果不可以
 *	提示用户超过可透支额的限额
 * 
 */
public class CheckAccount extends Account {
	private double overdraft;

	public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("你的账户余额为：" + balance);
			System.out.println("你的可透支额为：" + overdraft);
		} else {
			if ((amount - balance) <= overdraft) {
				overdraft -= (amount - balance);
				balance = 0;
				System.out.println("你的账户余额为：" + balance);
				System.out.println("你的可透支额为：" + overdraft);
			} else {
				System.out.println("超过可透支额的限额！");
				System.out.println("你的账户余额为：" + balance);
				System.out.println("你的可透支额为：" + overdraft);
			}
		}
	}
}
