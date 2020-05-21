package it;

import java.util.TreeMap;

public class FourSeasons {

	TreeMap<Integer, RoomItem> treeMap = new TreeMap<Integer, RoomItem>();
	int key = 0;

	public FourSeasons() {

		addItem(1, "Classic 1", 12, 30);
		addItem(4, "VIP", 3, 1500);
		addItem(3, "Duoble room", 30, 100);
		addItem(2, "Dorm", 2, 2000);
	}

	public void addItem(int floor, String quality, int numofRooms, double pricePernight) {
		RoomItem item = new RoomItem(floor, quality, numofRooms, pricePernight);

		treeMap.put(key, item);

		key++;

	}

	public TreeMap<Integer, RoomItem> getItems() {
		return treeMap;
	}

	public Iterator createIterator() {
		return new FourSeasonsIterator(treeMap);
	}
}