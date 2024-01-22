package app;

import java.util.logging.Logger;

import app.models.Pokemon;
import app.models.Item;
import app.models.Player;
import app.v1.PlayerBag;
import app.v1.PlayerTeam;
import app.v1.PlayerBox;

public class OldApp {

	public static void main(String[] args) {
		var logger = Logger.getLogger(OldApp.class.getName());

		var player = new Player("Pythagoras");
		var pikachu = new Pokemon("Pikachu", 63);
		var rapadash = new Pokemon("Rapadash", 100);
		var alcremie = new Pokemon("Alcremie", 74);
		var caterpie = new Pokemon("Caterpie", 5);
		var ditto = new Pokemon("Ditto", 30);
		var potion = new Item("Potion", 37);
		var revive = new Item("Revive", 9);

		try {
			var playersBox = new PlayerBox("Box 1", player);
			playersBox.add(caterpie).add(ditto);
			logger.info(playersBox.toString());

			var playersBag = new PlayerBag("Health Items", player);
			playersBag.add(potion).add(revive);
			logger.info(playersBag.toString());

			var playersTeam = new PlayerTeam("Main Team", player);
			playersTeam.add(pikachu).add(rapadash).add(alcremie);
			logger.info(playersTeam.toString());
		} catch (Exception e) {
			logger.severe(e.getMessage());
		}
	}

}
