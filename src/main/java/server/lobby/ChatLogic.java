package server.lobby;

/**
 * ChatLogic handles all the chat-messages to and from players/server.
 */
class ChatLogic {

	/**
	 * Send a message to all users.
	 */
	public static void worldMessage(Player player, String msg) {
		String packet = "CALLM:" + player.name + ":" + msg;
		for (int i = 0; i < PlayerManager.playerlist.size(); i++) {
			PlayerManager.playerlist.get(i).commandQueue.add(packet);
		}
	}

	/**
	 * Send a message to all the users in the game lobby.
	 */
	public static void lobbyMessage(Player player, String msg) {
		String packet = "CLOBM:" + player.name + ":" + msg;
		for (int i = 0; i < player.getLobby().getLobbylist().size(); i++) {
			player.getLobby().getLobbylist().get(i).commandQueue.add(packet);
		}
	}

	/**
	 * Send a message to a certain user (whispering). Checks for exceptions "sender=receiver" and "cant find receiver".
	 */
	public static void privateMessage(String fromPlayer, String toPlayer, String msg) {
		Player from = PlayerManager.getPlayerWithName(fromPlayer);

		// Sender does not exist
		if (from == null) {
			ServerGUI.addToConsole("Sender of whisper does not exist: " + fromPlayer);
			return;
		}

		Player to = PlayerManager.getPlayerWithName(toPlayer);

		// Receiver does not exist or sender is receiver
		if (to == null || from == to) {
			String packet = "CWHID:" + fromPlayer + ":" + toPlayer + ":" + msg;
			from.send(packet);
			return;
		}

		// Regular case
		String packet = "CWHIM:" + fromPlayer + ":" + toPlayer + ":" + msg;
		from.send(packet);
		to.send(packet);
	}

	/**
	 * Send a special Message to all players on the server.
	 */
	public static void serverBroadcast(String msg) {
		String packet = "SBROI:" + msg;
		for (int i = 0; i < PlayerManager.playerlist.size(); i++) {
			PlayerManager.playerlist.get(i).commandQueue.add(packet);
		}
	}
}
