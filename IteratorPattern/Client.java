package it;

public class Client {
	Mariott mr;
	Hilton h;
	FourSeasons fs;

	public Client(Mariott mr, Hilton h, FourSeasons fs) {
		this.mr = mr;
		this.h = h;
		this.fs = fs;
	}

	public void printRooms() {
		Iterator hIterator = h.createIterator();
		Iterator fsIterator = fs.createIterator();
		Iterator mrIterator = mr.createIterator();
		System.out.println("Hilton Hotel");
		System.out.println("------------------");
		printRoom(hIterator);
		System.out.println("\n");
		System.out.println("Mariott Hotel");
		System.out.println("------------------");
		printRoom(mrIterator);
		System.out.println("\n");
		System.out.println("Four Seasons Hotel");
		System.out.println("------------------");
		printRoom(fsIterator);
	}

	private void printRoom(Iterator iterator) {
		while (iterator.hasNext()) {
			RoomItem roomItem = (RoomItem) iterator.next();
			System.out.println("Floor:" + roomItem.getfloor());
			System.out.println("Price per night:" + roomItem.getPrice());
			System.out.println("Quality:" + roomItem.getquality());
		}
	}
}