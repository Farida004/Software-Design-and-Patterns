package Lab2;

public class Bidder implements Observer {
	String author;
	int price;
	String name;
	BidDataobject bidData;

	public Bidder(BidDataobject ddaataa) {
		this.bidData = ddaataa;
		ddaataa.registerObserver(this);

	}

	@Override
	public void update(String slotAuthor, int slotPrice, String slotName) {
		this.author = slotAuthor;
		this.price = slotPrice;
		this.name = slotName;
	}

	@Override
	public void display() {
		System.out.println("Author: " + author + ", Price: " + price + ", Name: " + name);
	}

}
