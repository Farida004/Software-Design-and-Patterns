package it;

import java.util.ArrayList;
import java.util.List;

public class Hilton {
	List roomItem;

	public Hilton() {
		roomItem = new ArrayList();

		addItem(1, "Classic 1", 12, 30);
		addItem(4, "VIP", 3, 1500);
		addItem(3, "Duoble room", 30, 100);
		addItem(2, "Dorm", 2, 2000);
	}

	public void addItem(int floor, String quality, int numofRooms, double pricePernight) {
		RoomItem menuItem = new RoomItem(floor, quality, numofRooms, pricePernight);
		roomItem.add(menuItem);
	}

	public List getItems() {
		return roomItem;
	}

	public Iterator createIterator() {
		return new HiltonIterator(roomItem);
	}
}