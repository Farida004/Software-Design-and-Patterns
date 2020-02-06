package Lab2;

import java.util.ArrayList;

public class BidDataobject implements Subject {
	private ArrayList<Observer> observers;
	private String slotAuthor;
	private int slotPrice;
	private String slotName;

	public BidDataobject() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}

	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(slotAuthor, slotPrice, slotName);
		}

	}

	public void dataChanged() {
		notifyObservers();
	}

	public void setData(String slotAuthor, int slotPrice, String slotName) {
		this.slotAuthor = slotAuthor;
		this.slotPrice = slotPrice;
		this.slotName = slotName;
		dataChanged();
	}

}
