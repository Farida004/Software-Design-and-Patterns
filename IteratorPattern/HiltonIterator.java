package it;

import java.util.ArrayList;
import java.util.List;

public class HiltonIterator implements Iterator {
	List items;
	int position = 0;

	public HiltonIterator(List items) {
		this.items = items;
	}

	public Object next() {
		Object object = items.get(position);
		position = position + 1;
		return object;
	}

	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}
}