package DecoratorPattern;

public class RomaTomatoes extends PizzaTopping {
	Pizza pizzaType;

	public RomaTomatoes(Pizza type) {
		this.pizzaType = type;
	}

	@Override
	public String getDescription() {

		return pizzaType.getDescription() + " Roma Tomatoes ";
	}

	@Override
	public double getCost() {

		return 25.00 + pizzaType.getCost();
	}

}
