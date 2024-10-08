package server.game;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

import client.gui.RandomMapGenerator;
import server.game.countdown.CountdownThread;
import server.game.powerup.PowerupManager;
import server.lobby.Lobby;
import server.lobby.Player;
import server.lobby.PlayerManager;
import server.lobby.ServerGUI;
import shared.game.ControlType;
import shared.game.PowerRacerGame;

/**
 * Handles the gamelist by adding and removing games.
 *
 * @author marco
 * @author benzumbrunn
 */
public class GameManager {

	private static ArrayList<PowerRacerGame> gamelist;
	Random rand = new Random();

	public GameManager() {
		PlayerManager.gameManager = this;
		setGamelist(new ArrayList<PowerRacerGame>());
		ServerGUI.addToConsole("GameManager created.");
	}

	/**
	 * Adds a game to the server and starts it when all players are ready.
	 *
	 * @param lobby is required to get the players and their cartypes.
	 */
	public static void addGame(Lobby lobby) {
		byte raceTrack = lobby.getTrack();
		if (raceTrack == 4) {
			RandomMapGenerator r = new RandomMapGenerator(64);
			String track = RandomMapGenerator.trackToString(r);
			for (int i = 0; i < lobby.getLobbylist().size(); i++) {
				lobby.getLobbylist().get(i).commandQueue.add("GNRMG:" + track);
			}
		}
		int[] carTypes = new int[lobby.getLobbylist().size()];
		ControlType[] controlTypes = new ControlType[lobby.getLobbylist().size()];
		for (int i = 0; i < lobby.getLobbylist().size(); i++) {
			carTypes[i] = lobby.getLobbylist().get(i).getCarIndex();
			controlTypes[i] = lobby.getLobbylist().get(i).getControlType();
		}
		PowerRacerGame game = new PowerRacerGame(lobby.getLobbylist().size(), raceTrack, carTypes, controlTypes, 4,
				new LinkedBlockingQueue<>());
		getGamelist().add(game);
		ArrayList<String> names = new ArrayList<>();
		for (int i = 0; i < lobby.getLobbylist().size(); i++) {
			names.add(lobby.getLobbylist().get(i).getName());
			lobby.getLobbylist().get(i).setGame(game);
		}
		game.setPlayers(names);
		for (int i = 0; i < lobby.getLobbylist().size(); i++) {
			StringBuilder sb = new StringBuilder(512);
			sb.append("GCRER:");
			sb.append(lobby.getLobbylist().size());
			sb.append(":");
			sb.append(i);
			sb.append(":");
			for (int carType : carTypes) {
				sb.append(carType);
				sb.append(":");
			}
			sb.append(raceTrack);
			sb.append(":");
			for (String name : names) {
				sb.append(name);
				sb.append(":");
			}
			for (Player player : lobby.getLobbylist()) {
				sb.append(player.getControlType());
				sb.append(":");
			}
			lobby.getLobbylist().get(i).commandQueue.add(sb.toString());
			lobby.getLobbylist().get(i).setCarIndex(i);
		}
		game.setPowerupManager(new PowerupManager(game));
		CountdownThread Count = new CountdownThread(game);
		Count.run();
		ServerGUI.addToConsole("Started new game with track: " + raceTrack
				+ " and players: " + game.getPlayers().toString() + ".");
	}

	/**
	 * The getter for the gamelist.
	 *
	 * @return returns the gamelist.
	 */
	public static ArrayList<PowerRacerGame> getGamelist() {
		return gamelist;
	}

	/**
	 * The setter for the gamelist.
	 *
	 * @param gamelist is passed to this class.
	 */
	public static void setGamelist(ArrayList<PowerRacerGame> gamelist) {
		GameManager.gamelist = gamelist;
	}

	/**
	 * Removes a game completely from the manager.
	 *
	 * @param game is passed for removal.
	 */
	public static void removeGame(PowerRacerGame game) {
		for (String s : game.getPlayers()) {
			for (int i = 0; i < PlayerManager.playerList.size(); i++) {
				if (PlayerManager.playerList.get(i).getName().equals(s)) {
					PlayerManager.playerList.get(i).setGame(null);
				}
			}
		}
		game = null;
	}

}
