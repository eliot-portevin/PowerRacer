package server.lobby;

import java.util.Arrays;

/**
 * UpdateManager for further use.
 * 
 * @author marco
 *
 */
class UpdateManager extends Thread {

	private boolean terminate;

	public UpdateManager() {
		ServerGUI.addToConsole("UpdateManager created.");
	}

	public void run() {
		ServerGUI.addToConsole("UpdateManager started.");
		try {
			while (!terminate) {
				for (int i = 0; i < LobbyManager.lobbyList.size(); i++) {
					if (LobbyManager.lobbyList.get(i).getLobbylist().size() == 0) {
						LobbyLogic.sendLobbyDeletion(LobbyManager.lobbyList
								.get(i).getLobbyID());
						ServerGUI.addToConsole("Lobby with ID: "
								+ LobbyManager.lobbyList.get(i).getLobbyID()
								+ " destroyed.");
						LobbyManager.lobbyList.remove(i);
					}
				}
				Thread.sleep(5000);
			}
		} catch (Exception e) {
			ServerGUI.addToConsole("Exception in UpdateManager:");
			ServerGUI.addToConsole(Arrays.toString(e.getStackTrace())
					.replaceAll(", ", "\n"));
		}
	}

	public void terminate() {
		terminate = true;
	}

}
