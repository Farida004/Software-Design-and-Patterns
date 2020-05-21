package lab;

public class Test {
	public static void main(String args[]) {
		Component deposit1 = new Account("Deposit 1", 100);
		Component deposit2 = new Account("Deposit 2", 200);
		Component deposit3 = new Account("Deposit 3", 300);
		Component savings1 = new Account("Savings 1", 400);
		Component savings2 = new Account("Savings 2", 500);
		Component allAccounts = new Account("All Accounts", 0);

		allAccounts.add(deposit1);
		allAccounts.add(deposit2);
		allAccounts.add(deposit3);
		allAccounts.add(savings1);
		allAccounts.add(savings2);

		savings1.add(new Savings("Bill", 150));
		savings1.add(new Savings("John", 250));
		savings1.add(new Savings("Nara", 350));
		savings2.add(new Savings("Fidan", 450));
		savings2.add(new Savings("SDNP", 550));
		savings2.add(new Savings("Eshe chtoto", 650));

		deposit1.add(new Deposit("Farida", 120));
		deposit2.add(new Deposit("Ktoto ", 130));
		deposit3.add(new Deposit("Masua12", 140));
		deposit3.add(new Deposit("Someone", 150));

		Client client = new Client(allAccounts);
		client.printAccount();
		client.getBalance();
	}
}