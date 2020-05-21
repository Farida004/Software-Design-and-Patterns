package it;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Hilton h = new Hilton();
		Mariott mr = new Mariott();
		FourSeasons fs = new FourSeasons();

		Client client = new Client(mr, h, fs);
		client.printRooms();
	}
}