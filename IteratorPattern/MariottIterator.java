package it;

import java.util.HashMap;

public class MariottIterator implements Iterator {
	HashMap<Integer, RoomItem> hashmap;
	int hashKey = 0;

	public MariottIterator(HashMap<Integer, RoomItem> hashmap) {
		this.hashmap = hashmap;
	}

	public Object next() {
		Object object = hashmap.get(hashKey);
		hashKey = hashKey + 1;
		return object;
	}

	public boolean hasNext() {
		if (hashKey >= hashmap.size()) {
			return false;
		} else {
			return true;
		}
	}
}