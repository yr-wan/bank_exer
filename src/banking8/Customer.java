package banking8;

import java.util.ArrayList;
import java.util.Iterator;

public class Customer {
	private String firstName;
	private String lastName;
	private ArrayList<Account> accounts;

	public Customer(String f, String l) {
		firstName = f;
		lastName = l;
		accounts = new ArrayList<Account>();
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void addAccount(Account acct) {
		accounts.add(acct);
	}

	public int getNumOfAccounts() {
		return accounts.size();
	}

	public Account getAccount(int index) {
		return accounts.get(index);
	}
	
	public Iterator<Account> getAccounts(){
		Iterator<Account> i = accounts.iterator();
		return i;
	}
}
