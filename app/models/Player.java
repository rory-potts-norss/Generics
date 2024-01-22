package app.models;

public class Player {

	private String name;

	@Override
	public String toString() {
		return name;
	}

	public Player(String name) {
		this.name = name;
	}

}