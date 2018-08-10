package banking8.reports;

import java.util.Iterator;

import banking8.Account;
import banking8.Bank;
import banking8.CheckingAccount;
import banking8.Customer;
import banking8.SavingAccount;

public class CustomerReport {
	Bank bank = Bank.getBanking();
	Customer customer;

	public void generateReport() {
		// Generate a report
		System.out.println("\t\t\tCUSTOMERS REPORT");
		System.out.println("\t\t\t================");

		//for (int cust_idx = 0; cust_idx < bank.getNumOfCustomers(); cust_idx++) {
		Iterator<Customer> customers = bank.getCustomers();
		while (customers.hasNext()) {
			customer = customers.next();

			System.out.println();
			System.out.println("Customer: " + customer.getLastName() + ", " + customer.getFirstName());

			//for (int acct_idx = 0; acct_idx < customer.getNumOfAccounts(); acct_idx++) {
			Iterator<Account> accounts = customer.getAccounts();
			while(accounts.hasNext()){
				Account account = accounts.next();
				String account_type = "";

				// Determine the account type
				/***
				 * Step 1: Use the instanceof operator to test what type of
				 * account we have and set account_type to an appropriate value,
				 * such as "Savings Account" or "Checking Account".
				 ***/
				if (account instanceof SavingAccount) {
					account_type = "Savings Account: ";
				}
				if (account instanceof CheckingAccount) {
					account_type = "Checking Account: ";
				}

				// Print the current balance of the account
				/***
				 * Step 2: Print out the type of account and the balance. Feel
				 * free to use the currency_format formatter to generate a
				 * "currency string" for the balance.
				 ***/
				System.out.println(account_type + "current balance is гд" + account.getBalance());

			}
		}
	}
}
