package server.lobby;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

/**
 * CheckinServer-thread, because it needs to listen permanently.
 * 
 * @author marco
 *
 */
class CheckinServer extends Thread {

	private static int PORT;
	private boolean terminate;

	/**
	 * Constructor for CheckinServer
	 */
	public CheckinServer(int port) {
		ServerGUI.addToConsole("CheckinServer created.");
		PORT = port;
	}

	/**
	 * Run-method for the CheckinServer, creates ServerSocket, accepts
	 * connection and creates a new user for each connection in the
	 * playermanager.
	 */
	public void run() {
		ServerGUI.addToConsole("CheckinServer started and listening on port: "
				+ PORT + ".");
		try (ServerSocket s_Socket = new ServerSocket(PORT)) {
			while (!terminate) {
				Socket in_Socket = s_Socket.accept();
				if (PlayerManager.hasSpace()) {
					PlayerManager.addUser(in_Socket);
				} else {
					Player tempPlayer = PlayerManager
							.addUserOnlyForDenial(in_Socket);
					LobbyLogic.sendFullServer(tempPlayer);
					LobbyLogic.removePlayerComplete(tempPlayer);
					ServerGUI
							.addToConsole("Refused one connection because server is full.");
				}
			}
		} catch (Exception e) {
			ServerGUI.addToConsole("Exception in CheckinServer:");
			ServerGUI.addToConsole(Arrays.toString(e.getStackTrace())
					.replaceAll(", ", "\n"));
		}
	}

	public void terminate() {
		terminate = true;
	}

}
