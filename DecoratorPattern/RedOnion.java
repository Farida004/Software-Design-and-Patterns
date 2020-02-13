package DecoratorPattern;

public class RedOnion extends PizzaTopping {
	Pizza pizzaType;

	public RedOnion(Pizza type) {
		this.pizzaType = type;
	}

	@Override
	public String getDescription() {

		return pizzaType.getDescription() + " Red Onion ";
	}

	@Override
	public double getCost() {

		return 3.00 + pizzaType.getCost();
	}

}
