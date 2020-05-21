package it;

public class RoomItem {
	int floor;
	String quality;
	int numofRooms;
	double pricePernight;

	public RoomItem(int floor, String quality, int numofRooms, double pricePernight) {
		this.floor = floor;
		this.quality = quality;
		this.numofRooms = numofRooms;
		this.pricePernight = pricePernight;
	}

	public int getfloor() {
		return floor;
	}

	public String getquality() {
		return quality;
	}

	public int numOfRooms() {
		return numofRooms;
	}

	public double getPrice() {
		return pricePernight;
	}
}