package app;

import java.util.logging.Logger;

import app.models.Item;
import app.models.Player;
import app.models.Pokemon;
import app.v2.Collection;

public class NewApp {

	public static void main(String[] args) {
		var logger = Logger.getLogger(NewApp.class.getName());

		var player = new Player("Pythagoras");
		var pikachu = new Pokemon("Pikachu", 63);
		var rapadash = new Pokemon("Rapadash", 100);
		var alcremie = new Pokemon("Alcremie", 74);
		var caterpie = new Pokemon("Caterpie", 5);
		var ditto = new Pokemon("Ditto", 30);
		var potion = new Item("Potion", 37);
		var revive = new Item("Revive", 9);

		try {
			var playersBox = new Collection<Player, Pokemon>("Box 1", 30, player);
			playersBox.add(caterpie).add(ditto);
			logger.info(playersBox.toString());

			var playersBag = new Collection<Player, Item>("Health Items", 99, player);
			playersBag.add(potion).add(revive);
			logger.info(playersBag.toString());

			var playersTeam = new Collection<Player, Pokemon>("Main Team", 6, player);
			playersTeam.add(pikachu).add(rapadash).add(alcremie);
			logger.info(playersTeam.toString());
		} catch (Exception e) {
			logger.severe(e.getMessage());
		}
	}

}
