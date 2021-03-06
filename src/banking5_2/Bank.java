package banking5_2;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomer;

	public Bank() {
		customers = new Customer[5];
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
