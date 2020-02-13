package DecoratorPattern;

public class PizzaTest {
	public static void main(String[] args) {
		Pizza pizza = new BagelPizza();
		System.out.println(pizza.getDescription() + " " + pizza.getCost() + "₼");
		pizza = new RomaTomatoes(pizza);
		pizza = new RedOnion(pizza);
		pizza = new WhiteGoatCheese(pizza);
		pizza = new MarinatedBeef(pizza);
		System.out.println(pizza.getDescription() + " " + pizza.getCost() + "₼");

	}

}
