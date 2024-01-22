package app.v1;

import java.util.ArrayList;
import java.util.List;

import app.models.Player;
import app.models.Pokemon;

public class PlayerTeam {

	private String name;
	private Player player;
	private List<Pokemon> pokemon = new ArrayList<>();
	private int maxPokemon = 6;

	public PlayerTeam add(Pokemon mon) throws Exception {
		if (pokemon.size() == maxPokemon)
			throw new Exception(String.format("%s is full!", name));
		pokemon.add(mon);
		return this;
	}

	@Override
	public String toString() {
		List<String> names = new ArrayList<>();
		for (Pokemon mon : pokemon) {
			names.add(mon.toString());
		}
		return String.format("%s's %s: %s", this.player.toString(), this.name, String.join(", ", names));
	}

	public PlayerTeam(String name, Player player) {
		this.name = name;
		this.player = player;
	}

}