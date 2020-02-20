package lab4;

public abstract class IceCreamStore {
	public IceCream orderIceCream(String s) {
		IceCream ice;
		ice = createIceCream(s);
		ice.prepare();
		ice.pourToBlender();
		ice.blend();
		ice.addChunkyChocolate();
		ice.freeze();
		ice.decorate();
		ice.putInCup();

		return ice;

	}

	abstract IceCream createIceCream(String ice);
}
