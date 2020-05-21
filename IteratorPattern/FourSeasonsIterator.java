package it;

import java.util.TreeMap;

public class FourSeasonsIterator implements Iterator {
	TreeMap<Integer, RoomItem> treeMap;
	int hashKey = 0;

	public FourSeasonsIterator(TreeMap<Integer, RoomItem> treeMap) {
		this.treeMap = treeMap;
	}

	public Object next() {
		Object object = treeMap.get(hashKey);
		hashKey = hashKey + 1;
		return object;
	}

	public boolean hasNext() {
		if (hashKey >= treeMap.size()) {
			return false;
		} else {
			return true;
		}
	}
}