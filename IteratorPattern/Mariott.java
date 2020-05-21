package it;

import java.util.HashMap;

public class Mariott {
	HashMap<Integer, RoomItem> hashmap = new HashMap<Integer, RoomItem>();

	int hashKey = 0;

	public Mariott() {
		addItem(5, "Classic 1", 100, 30);
		addItem(17, "VIP", 15, 3000);
		addItem(10, "Duoble room", 40, 200);
		addItem(1, "Dorm", 5, 5000);

	}

	public void addItem(int floor, String quality, int numofRooms, double pricePernight) {

		RoomItem item = new RoomItem(floor, quality, numofRooms, pricePernight);

		hashmap.put(hashKey, item);

		hashKey++;

	}

	public HashMap<Integer, RoomItem> getItems() {

		return hashmap;

	}

	public Iterator createIterator() {
		return new MariottIterator(hashmap);
	}

}
