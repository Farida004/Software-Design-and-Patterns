package DecoratorPattern;

public class BagelPizza extends Pizza {
	public BagelPizza() {
		description = "Pizza Bagel";
	}

	@Override
	public double getCost() {
		return 25.00;
	}

}
