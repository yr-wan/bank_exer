package banking7;

//实现单例模式
public class Bank {
	private Customer[] customers;
	private int numberOfCustomer;

	private Bank() {
		customers = new Customer[5];
	}

	private static Bank bank = new Bank();

	public static Bank getBanking() {
		return bank;
	}

	public void addCustomer(String f, String l) {
		Customer cust = new Customer(f, l);
		customers[numberOfCustomer] = cust;
		numberOfCustomer++;
	}

	public int getNumOfCustomers() {
		return numberOfCustomer;
	}

	public Customer getCustomer(int index) {
		return customers[index];
	}
}
