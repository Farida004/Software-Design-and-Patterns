package lab;

public class Savings extends Component {
	String name;
	double balance;

	public Savings(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void print() {
		System.out.print("Name:  " + getName() + ". ");
		System.out.println("Balance: " + getBalance());
	}
}