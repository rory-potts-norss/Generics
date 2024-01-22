package app.models;

public class Item {

	private String name;
	private int quantity;

	@Override
	public String toString() {
		return String.format("%s x %d", name, quantity);
	}

	public Item(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

}