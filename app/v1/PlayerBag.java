package app.v1;

import java.util.ArrayList;
import java.util.List;

import app.models.Item;
import app.models.Player;

public class PlayerBag {

	private String name;
	private Player player;
	private List<Item> items = new ArrayList<>();
	private int maxItems = 99;

	public PlayerBag add(Item item) throws Exception {
		if (items.size() == maxItems)
			throw new Exception(String.format("%s is full!", name));
		items.add(item);
		return this;
	}

	@Override
	public String toString() {
		// @TODO reduce this method to 1 line
		List<String> names = new ArrayList<>();
		for (Item item : items) {
			names.add(item.toString());
		}
		return String.format("%s's %s: %s", this.player.toString(), this.name, String.join(", ", names));
	}

	public PlayerBag(String name, Player player) {
		this.name = name;
		this.player = player;
	}

}