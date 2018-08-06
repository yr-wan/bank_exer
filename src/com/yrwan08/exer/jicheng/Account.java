package com.yrwan08.exer.jicheng;

public class Account {
	protected int id;
	protected double balance;
	protected double annualInterestRate;

	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getMonthlyInterest() {
		return annualInterestRate / 12;
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("ÄãµÄÕË»§Óà¶îÎª£º" + balance);

		} else {
			System.out.println("Óà¶î²»×ã£¡");
			System.out.println("ÄãµÄÕË»§Óà¶îÎª£º" + balance);
		}
	}

	public void deposit(double amount) {
		balance += amount;
	}

}
