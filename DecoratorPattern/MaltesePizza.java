package DecoratorPattern;

public class MaltesePizza extends Pizza {
	public MaltesePizza() {
		description = "Pizza Maltese";
	}

	@Override
	public double getCost() {
		return 20.00;
	}

}
