package Lab2;

public class Auctioneer {
	public static void main(String[] args) {
		BidDataobject bid = new BidDataobject();
		Bidder farida = new Bidder(bid);
		bid.setData("ktoto", 32943974, "kartina");
		farida.display();
		bid.setData("ktotosdks",123, "ruchka");
		farida.display();
	}
}
