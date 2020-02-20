package lab4;

public class BakuIceCream extends IceCreamStore {

	@Override
	IceCream createIceCream(String ii) {
		if (ii.equals("Cherry Blossom")) {
			return new BakuStyleCherryBlossom();
		} else if (ii.equals("Cookie Dough")) {
			return new BakuStyleCookieDough();
		} else if (ii.equals("Peanut Cream")) {
			return new BakuStylePeanutCream();
		} else if (ii.equals("Rocky Road")) {
			return new BakuStyleRockyRoad();
		} else {
			return null;
		}
	}

}
