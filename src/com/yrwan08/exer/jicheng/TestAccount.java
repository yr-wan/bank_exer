package com.yrwan08.exer.jicheng;

public class TestAccount {
	public static void main(String[] args) {
		Account acct = new Account(1122, 20000, 4.5);
		acct.withdraw(30000);
		acct.withdraw(2500);
		acct.deposit(3000);
		System.out.println("月利率为：" + acct.getMonthlyInterest());
		System.out.println();
		System.out.println();

		CheckAccount ca = new CheckAccount(1122, 20000, 4.5, 5000);
		ca.withdraw(5000);
		System.out.println();
		ca.withdraw(18000);
		System.out.println();
		ca.withdraw(3000);
	}
}
