package lab4;

public class Test {
	public static void main(String[] args) {
		IceCreamStore chetotam = new BakuIceCream();

		IceCream eda = chetotam.orderIceCream("Cherry Blossom");
		System.out.println(eda.getName() + " is ready ");

	}
}
