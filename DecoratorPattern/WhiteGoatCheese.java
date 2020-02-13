package DecoratorPattern;

public class WhiteGoatCheese extends PizzaTopping {
	Pizza pizzaType;

	public WhiteGoatCheese(Pizza type) {
		this.pizzaType = type;
	}

	@Override
	public String getDescription() {

		return pizzaType.getDescription() + " White Goat Cheese ";
	}

	@Override
	public double getCost() {

		return 30.00 + pizzaType.getCost();
	}

}
