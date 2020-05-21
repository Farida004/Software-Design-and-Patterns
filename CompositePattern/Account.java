package lab;

import java.util.ArrayList;
import java.util.Iterator;

public class Account extends Component {
	ArrayList<Component> components = new ArrayList<Component>();
	Iterator iterator = null;
	String name;
	double balance;

	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public void add(Component acomp) {
		components.add(acomp);
	}

	public void remove(Component acomp) {
		components.remove(acomp);
	}

	public Component getChild(int i) {
		return (Component) components.get(i);
	}

	public String getName() {
		return name;
	}

	public double getBalance() {

		return balance;
	}

	public Iterator createIterator() {
		if (iterator == null) {
			iterator = new CompositeIterator(components.iterator());
		}
		return iterator;
	}

	public void print() {
		System.out.println("---------------------");
		System.out.println("\n" + getName());
		System.out.println(getBalance());
		System.out.println("---------------------");
		Iterator iterator = components.iterator();
		while (iterator.hasNext()) {
			Component component = (Component) iterator.next();
			component.print();
		}
	}
}