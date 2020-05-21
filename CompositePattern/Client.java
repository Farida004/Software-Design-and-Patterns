package lab;

import java.util.Iterator;

public class Client {
	Component allAccounts;
	double sum;

	public Client(Component allAccounts) {
		this.allAccounts = allAccounts;
	}

	public void getBalance() {
		Iterator<Component> iterator = (Iterator<Component>) allAccounts.createIterator();
		while (iterator.hasNext()) {
			Component component = (Component) iterator.next();
			try {
				sum += component.getBalance();
			} catch (UnsupportedOperationException e) {
			}
		}
		System.out.println("\nTotal sum of balances is: " + sum);
	}

	public void printAccount() {
		allAccounts.print();
	}
}