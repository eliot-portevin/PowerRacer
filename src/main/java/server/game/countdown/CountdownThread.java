package server.game.countdown;

import server.game.GameLogic;
import server.lobby.PlayerManager;
import shared.game.PowerRacerGame;

public class CountdownThread extends Thread {

	private final PowerRacerGame game;

	/**
	 * Constructor for CountdownThread
	 *
	 * @param game the game to be counted down
	 */
	public CountdownThread(PowerRacerGame game) {
		this.game = game;
	}

	public void run() {
		try {
			Thread.sleep(1000);
			for (int i = 3; i >= 0; i--) {
				for (int j = 0; j < PlayerManager.playerList.size(); j++) {
					if (PlayerManager.playerList.get(j).getGame() != null) {
						if (PlayerManager.playerList.get(j).getGame() == game) {
							PlayerManager.playerList.get(j).commandQueue
									.add("GCODI:countdown:" + i);
						}
					}
				}
				Thread.sleep(1000);
			}
			GameLogic.startTimer(game);
		} catch (Exception e) {
			System.err.println("Countdown: " + e);
		}
	}

}
