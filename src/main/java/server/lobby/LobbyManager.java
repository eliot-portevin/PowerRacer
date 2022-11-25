package server.lobby;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * LobbyManager which holds all the Lobby objects. Has a reference to
 * PlayerManager and an ArrayList with all the created lobbies.
 */
public class LobbyManager {

	static ArrayList<Lobby> lobbyList = new ArrayList<>();
	private static final AtomicInteger lobbyIdGenerator = new AtomicInteger();

	/**
	 * Creates a new Lobby and adds the creatorPlayer to it.
	 *
	 * @param player the relevant player
	 * @param parts  the packet parts
	 */
	public static void addLobby(Player player, String parts) {
		Lobby lobby = new Lobby(getNewID(), player);
		lobby.setTrack(Byte.parseByte(parts));
		lobbyList.add(lobby);
		player.setLobby(lobby);
		ServerGUI.addToConsole("New Lobby created with ID: "
				+ lobby.getLobbyID() + " and track: " + lobby.getTrack());
	}

	/**
	 * Lets a new random run to give back an unused ID for a new Lobby.
	 */
	private static int getNewID() {
		return lobbyIdGenerator.getAndIncrement();
	}

	/**
	 * Returns the Lobby-object which got the right lobbyID.
	 *
	 * @param lobbyID the relevant lobby's ID
	 * @return the lobby with the specified ID
	 */
	public static Lobby getLobby(int lobbyID) {
		return lobbyList.stream()
				.filter(lobby -> lobby.lobbyID == lobbyID)
				.findAny().orElse(null);
	}

	public static String getAllOpenLobbys() {
		StringBuilder result = new StringBuilder();
		for (Lobby lobby : lobbyList) {
			result.append(lobby.getLobbyID());
			result.append(":");
			result.append(lobby.getTrack());
			result.append(":");
		}
		return result.toString();
	}

	public static boolean isLobbyReady(Lobby lobby) {
		int readyCount = 0;
		for (int i = 0; i < lobby.getLobbylist().size(); i++) {
			if (lobby.getLobbylist().get(i).getLobbyReady()) {
				readyCount += 1;
			}
		}
		return readyCount == lobby.getLobbylist().size();
	}

}
