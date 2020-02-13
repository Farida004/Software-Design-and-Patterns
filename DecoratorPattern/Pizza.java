package DecoratorPattern;

public abstract class Pizza {
	String description = "Some Pizza";

	public Pizza() {

	}

	public String getDescription() {
		return description;
	}

	public abstract double getCost();

}
