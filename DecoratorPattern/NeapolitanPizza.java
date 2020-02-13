package DecoratorPattern;

public class NeapolitanPizza extends Pizza {
	public NeapolitanPizza() {
		description = "Pizza Neapolitana";
	}

	@Override
	public double getCost() {
		return 34.99;
	}

}
