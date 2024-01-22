package app.models;

public class Pokemon {

	private String name;
	private int level;

	@Override
	public String toString() {
		return String.format("%s (lvl %d)", name, level);
	}

	public Pokemon(String name, int level) {
		this.name = name;
		this.level = level;
	}

}