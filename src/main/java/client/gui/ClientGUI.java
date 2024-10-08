package client.gui;

import client.lobby.Client;
import server.discovery.DiscoveryClient;
import server.discovery.DiscoveryServer;
import server.lobby.CreateServer;
import server.lobby.ServerGUI;
import shared.game.Car;
import shared.game.ControlType;
import shared.game.PowerRacerGame;
import shared.game.RaceTrack;
import shared.game.powerup.Powerup;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Main GUI class, which is also run to start the game.
 *
 * @author Florian
 */
public class ClientGUI {
	static DiscoveryServer discServ;
	static ClientGUI clientGUI;
	Client client;

	public JFrame frame;
	static boolean serverOn;
	int select, resX = 1280, resY = 720, trackSelect, carSelect;
	ControlType controlType = ControlType.TANK;
	JLabel feedback, readyLabel, serverIp;
	JList<String> list;
	InetAddress[] addresses;
	public JButton refreshButton, connectIpButton;
	JTextField ipField;
	JTextArea chatBox;
	boolean lobby, ready;
	ArrayList<String> lobbyListData, lobbyListTrackData;
	Camera camera;
	JButton serverButton;
	JButton helpButton;
	JButton chatHelpButton;
	private int port = 21000;
	JComboBox<ImageIcon> carSelection;

	public static final String STANDARD_RESOLUTION_360P = "640x360",
			HIGH_DEFINITION_RESOLUTION_720P = "1280x720",
			FULL_HIGH_DEFINITION_RESOLUTION_1080P = "1920x1080",
			QUAD_HIGH_DEFINITION_RESOLUTION_1440P = "2560x1440",
			QUAD_FULL_HIGH_DEFINITION_RESOLUTION_4K = "3840x2160";

	public static final String TANK_CONTROLS = "Tank", SIMPLE_CONTROLS = "Directional";

	public static void main(String[] args) {

		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			// Do nothing
		}

		if (args.length == 2) {
			switch (args[0]) {
				case "server" -> {
					createServer(Integer.parseInt(args[1]));
					ServerGUI.runServerConsole();
				}
				case "client" -> {
					clientGUI = new ClientGUI();
					clientGUI.port = Integer.parseInt(args[1].split(":")[1]);
					clientGUI.connect(args[1].split(":")[0]);
				}
				default -> System.out.println("ERROR: Faulty arguments!");
			}
		} else {
			clientGUI = new ClientGUI();
			clientGUI.refresh();
		}
	}

	private static void createServer(int port) {
		new DiscoveryServer();
		CreateServer.create(port);
		try {
			ServerGUI.addToConsole("Started server at IP: " + InetAddress.getLocalHost().getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Runs the RefreshThread, which uses the DiscoveryClient to update the
	 * Server list.
	 */
	public void refresh() {
		new RefreshThread(refreshButton);
	}

	/**
	 * Instantiates a new Client object with the IP address.
	 *
	 * @param ip Server IP
	 */
	public void connect(String ip) {
		client = new Client(ip, this, port);
	}

	/**
	 * Resets the GUI to the Server select screen.
	 */
	public static void reset() {
		if (clientGUI.camera != null) {
			clientGUI.camera.terminate();
		}
		clientGUI = new ClientGUI();
		clientGUI.refresh();
	}

	/**
	 * Resets the GUI, but also displays a message letting the player know he
	 * was kicked, and why.
	 *
	 * @param message The reason why the player was kicked
	 */
	public static void kickReset(String message) {
		reset();
		try {
			Thread.sleep(100);
		} catch (InterruptedException ignored) {
		}
		JOptionPane.showMessageDialog(clientGUI.frame,
				"You have been kicked from the server because:\n" + message);
	}

	/**
	 * Sets the feedback JLabel to the argument text.
	 *
	 * @param text feedback text
	 */
	public void setFeedback(String text) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime time = LocalDateTime.now();
		feedback.setText("[" + formatter.format(time) + "] " + text);
	}

	/**
	 * Sets the ready boolean and changes the text and color of the JLabel.
	 *
	 * @param ready self explanatory
	 */
	public void setReady(boolean ready) {
		this.ready = ready;
		if (ready) {
			readyLabel.setText("<html><font color='green'>Ready</font></html>");
			carSelection.setEnabled(false);
		} else {
			readyLabel
					.setText("<html><font color='red'>Not Ready</font></html>");
			carSelection.setEnabled(true);
		}
	}

	/**
	 * Adds the argument message to the JTextArea chatBox and scrolls its Focus
	 * down to the new message.
	 *
	 * @param message text to be added to chat
	 */
	public void addToChat(String message) {
		chatBox.append("\n\n" + message);
		chatBox.setCaretPosition(chatBox.getDocument().getLength());
	}

	/**
	 * Analyzes the argument message and adds the correct packet to the
	 * {@link Client}'s commandQueue.
	 *
	 * @param message input taken directly from user chat
	 */
	public void sendChatRequest(String message) {
		message = message.replace(":", "\\;");
		String[] messageSplit = message.split(" ");
		if (message.length() > 0 && messageSplit.length > 0) {
			setFeedback("");
			switch (messageSplit[0]) {
				case "\\w" -> {
					if (messageSplit.length > 2) {
						client.commandQueue.add("CWHIR:"
								+ client.name
								+ ":"
								+ messageSplit[1]
								+ ":"
								+ message.substring(messageSplit[0].length()
								+ messageSplit[1].length() + 2));
					} else {
						addToChat("Whisper incomplete: Missing name or message!");
					}
				}
				case "\\a" -> {
					if (messageSplit.length > 1) {
						client.commandQueue
								.add("CALLR:" + message.substring(3));
					} else {
						addToChat("Missing message!");
					}
				}
				case "\\n" -> {
					if (messageSplit.length > 1) {
						client.commandQueue.add("NAMCR:"
								+ message.substring(3).replace(",", "."));
					} else {
						addToChat("Missing name!");
					}
				}
				case "\\l" -> client.commandQueue.add("WHOOR");
				case "\\h" -> client.commandQueue.add("PREGR");
				case "\\g" -> client.commandQueue.add("CURGR");
				default -> {
					if (lobby) {
						client.commandQueue.add("CLOBR:" + message);
					} else {
						client.commandQueue.add("CALLR:" + message);
					}
				}
			}
		}
		ipField.setText("");
	}

	/**
	 * Expands the list of lobbies with the given lobbyName information.
	 * <p>
	 * Stores lobby list data in ArrayList lobbyListData and then fills new data
	 * array with properly formatted lobby names.
	 *
	 * @param lobbyName the servers name of the lobby
	 * @param trackName the name of the lobby's track
	 */
	public void addToLobbyList(String lobbyName, String trackName) {
		lobbyListData.add(lobbyName);
		lobbyListTrackData.add(trackName);
		String[] data = new String[lobbyListData.size()];
		for (int i = 0; i < data.length; i++) {
			data[i] = "Lobby " + lobbyListData.get(i) + " "
					+ lobbyListTrackData.get(i);
		}
		list.setListData(data);
	}

	/**
	 * Removes the parameter lobby from the list of lobbies.
	 *
	 * @param lobbyName the Server name for the lobby (usually a number)
	 */
	public void removeFromLobbyList(String lobbyName) {
		if (lobbyListData.contains(lobbyName)) {
			lobbyListTrackData.remove(lobbyListData.indexOf(lobbyName));
			lobbyListData.remove(lobbyName);
			String[] data = new String[lobbyListData.size()];
			for (int i = 0; i < data.length; i++) {
				data[i] = "Lobby " + lobbyListData.get(i) + " " + lobbyListTrackData.get(i);
			}
			list.setListData(data);
		}

	}

	/**
	 * Instantiates new JFrame and adds all required components for the server
	 * select screen.
	 */
	public ClientGUI() {
		// create frame
		frame = new JFrame("Client");

		// set frame parameters
		frame.getContentPane().setPreferredSize(new Dimension(500, 500));
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);

		// add window listener to warn user about closing server
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				if (serverOn) {
					if (1 == JOptionPane.showOptionDialog(frame,
							"You are running a server. Are you sure you want to quit?", "Exit?",
							JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null,
							new Object[]{"No", "Yes"}, "No")) {
						// TODO: Close Server here

						discServ.terminate();

						System.exit(0);
					}
				} else {
					System.exit(0);
				}

			}
		});

		// create labels and fields and set their displayed text
		JLabel title = new JLabel("Select Game Server");
		feedback = new JLabel();
		JLabel enterIp = new JLabel("Connect to host:");
		ipField = new JTextField();
		connectIpButton = new JButton("Direct Connect");
		serverIp = new JLabel();
		try {
			serverIp.setText("IP: " + InetAddress.getLocalHost().getHostAddress());
		} catch (UnknownHostException ignored) {
			serverIp.setText("IP: Unknown");
		}

		// create panels
		JPanel panel = new JPanel();
		JPanel serverPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		serverButton = new JButton("Create Server");
		if (serverOn) {
			serverButton.setEnabled(false);
		} else {
			serverIp.setVisible(false);
		}
		refreshButton = new JButton("Refresh");
		JButton joinButton = new JButton("Join");
		joinButton.setEnabled(false);

		// define GroupLayout for buttonPanel
		GroupLayout buttonLayout = new GroupLayout(buttonPanel);
		buttonPanel.setLayout(buttonLayout);
		buttonLayout.setHorizontalGroup(buttonLayout
				.createParallelGroup(GroupLayout.Alignment.TRAILING)
				.addComponent(serverButton).addComponent(refreshButton)
				.addComponent(joinButton).addComponent(serverIp));
		buttonLayout.setVerticalGroup(buttonLayout.createSequentialGroup()
				.addComponent(serverButton).addComponent(refreshButton)
				.addComponent(joinButton).addComponent(serverIp));

		// create server list
		list = new JList<>(new String[]{});
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setLayoutOrientation(JList.VERTICAL);
		list.addListSelectionListener(e -> {
			if (!e.getValueIsAdjusting()) {
				if (list.getSelectedIndex() == -1) {
					// No selection
					joinButton.setEnabled(false);
				} else {
					// Selection
					joinButton.setEnabled(true);
					select = list.getSelectedIndex();
				}
			}
		});
		JScrollPane serverList = new JScrollPane(list);
		serverList.setPreferredSize(new Dimension(300, 400));
		serverPanel.add(serverList);

		// Determine Button events
		refreshButton.addActionListener(e -> refresh());
		serverButton.addActionListener(e -> {
			discServ = new DiscoveryServer();
			CreateServer.createWithGUI();
			serverOn = true;
			serverButton.setEnabled(false);
			serverIp.setVisible(true);
			refresh();
			ServerGUI.addToConsole("Welcome to the Server Console!\nType \"help\" for a list of commands.");
		});
		joinButton.addActionListener(e -> connect(addresses[select].getHostName()));
		ActionListener hostConnectListener = e -> {
			String input = ipField.getText();
			feedback.setText("Connecting...");
			try {
				connectIpButton.setEnabled(false);
				String[] parts = input.split(":");
				if (parts.length == 2) {
					try {
						port = Integer.parseInt(parts[1]);
					} catch (NumberFormatException ex) {
						feedback.setText("Host incorrectly formatted");
						connectIpButton.setEnabled(true);
						return;
					}
				}
				connect(InetAddress.getByName(parts[0]).getHostName());
			} catch (UnknownHostException ex) {
				setFeedback("Unknown Host!");
				connectIpButton.setEnabled(true);
			}
		};
		connectIpButton.addActionListener(hostConnectListener);
		ipField.addActionListener(hostConnectListener);

		// define GroupLayout for main panel
		GroupLayout layout = new GroupLayout(panel);
		panel.setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		layout.setHorizontalGroup(layout
				.createParallelGroup(GroupLayout.Alignment.CENTER)
				.addComponent(title)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(serverPanel)
								.addComponent(buttonPanel))
				.addComponent(feedback)
				.addGroup(
						layout.createSequentialGroup().addComponent(enterIp)
								.addComponent(ipField)
								.addComponent(connectIpButton)));
		layout.setVerticalGroup(layout
				.createSequentialGroup()
				.addComponent(title)
				.addGroup(
						layout.createParallelGroup().addComponent(serverPanel)
								.addComponent(buttonPanel))
				.addComponent(feedback)
				.addGroup(
						layout.createParallelGroup(
										GroupLayout.Alignment.BASELINE)
								.addComponent(enterIp).addComponent(ipField)
								.addComponent(connectIpButton)));

		// add components to frame, pack and set visible
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);

		helpButton = new JButton("Help");
		helpButton.addActionListener(e -> JOptionPane.showMessageDialog(frame,
				"""
						Controls:
						W or Up arrow = accelerate
						S or Down arrow = reverse
						A and D or Left and Right arrows = steer
						SPACE or V = activate Powerup
						- and + or O and P = zoom out and in
						T = toggle player names
						M = toggle Music
						1-5 = change window position
						F = toggle Fullscreen
						C = screenshot""",
				"Help", JOptionPane.PLAIN_MESSAGE));

		chatHelpButton = new JButton("Chat Help");
		chatHelpButton.addActionListener(e -> JOptionPane.showMessageDialog(frame,
				"""
						Chat Commands:
						Whisper: \\w name message
						List players: \\l
						Change name: \\n name
						To broadcast use: \\a message
						List running games: \\g
						List game history: \\h""",
				"Chat Help", JOptionPane.PLAIN_MESSAGE));
	}

	/**
	 * Moves the GUI to a world chat with lobby selection.
	 *
	 * @param name name given by the server
	 */
	public void moveToServer(String name) {
		// save frame position on screen
		int x = frame.getLocationOnScreen().x;
		int y = frame.getLocationOnScreen().y;

		// clean up and create new frame
		frame.dispose();
		frame = new JFrame("Server Lobby");
		frame.setLocation(x, y);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		// add window listener asking whether the user wants to log out on close
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				if (1 == JOptionPane.showOptionDialog(frame, "Would you like to log out?", "Log Out?",
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, new Object[]{"No", "Yes"},
						"No")) {
					client.commandQueue.add("LGOUR");
				}
			}
		});

		// create required panels and textfields
		JPanel panel = new JPanel();
		ipField = new JTextField();
		ipField.setPreferredSize(new Dimension(400, 10));
		ipField.addActionListener(e -> sendChatRequest(ipField.getText()));
		JButton sendButton = new JButton("Send");

		// set first time login content
		if (!lobby) {
			feedback = new JLabel();
			feedback.setPreferredSize(new Dimension(400, 40));
			chatBox = new JTextArea();
			chatBox.setEditable(false);
			chatBox.setLineWrap(true);
		}

		// allow chat vertical scrolling
		JScrollPane scrollPane = new JScrollPane(chatBox,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setPreferredSize(new Dimension(400, 400));

		// define non chat function buttons
		JButton createLobby = new JButton("Create Lobby");
		JButton joinButton = new JButton("Join");
		JButton logOutButton = new JButton("Log Out");
		joinButton.setEnabled(false);

		JLabel selectTrack = new JLabel("Select Track:");
		trackSelect = RaceTrack.RACETRACK_SMALL;
		JComboBox<String> trackSelection = new JComboBox<>(RaceTrack.TRACK_NAMES);
		trackSelection.setSelectedItem(RaceTrack.RACETRACK_SMALL);
		trackSelection.setMaximumSize(logOutButton.getSize());

		trackSelection.addActionListener(e -> trackSelect = trackSelection.getSelectedIndex());

		// create lobby list
		list = new JList<>(new String[]{});
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setLayoutOrientation(JList.VERTICAL);
		list.addListSelectionListener(e -> {
			if (!e.getValueIsAdjusting()) {
				if (list.getSelectedIndex() == -1) {
					// No selection
					joinButton.setEnabled(false);
				} else {
					// Selection
					joinButton.setEnabled(true);
					select = list.getSelectedIndex();
				}
			}
		});
		lobbyListData = new ArrayList<>();
		lobbyListTrackData = new ArrayList<>();
		JScrollPane lobbyList = new JScrollPane(list);
		lobbyList.setPreferredSize(new Dimension(200, 400));

		JButton creditsButton = new JButton("Credits");
		creditsButton.addActionListener(e -> {
			new CreditsWindow(creditsButton);
			creditsButton.setEnabled(false);
		});

		// set GroupLayout for panel
		GroupLayout layout = new GroupLayout(panel);
		panel.setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		layout.setHorizontalGroup(layout
				.createSequentialGroup()
				.addGroup(
						layout.createParallelGroup().addComponent(scrollPane)
								.addComponent(ipField))
				.addComponent(sendButton)
				.addGroup(layout.createParallelGroup().addComponent(lobbyList)
						/* .addComponent(feedback) */)
				.addGroup(
						layout.createParallelGroup().addComponent(createLobby)
								.addComponent(selectTrack)
								.addComponent(trackSelection)
								.addComponent(joinButton)
								.addComponent(logOutButton)
								.addComponent(helpButton)
								.addComponent(chatHelpButton)
								.addComponent(creditsButton)));

		layout.setVerticalGroup(layout
				.createSequentialGroup()
				.addGroup(
						layout.createParallelGroup()
								.addComponent(scrollPane)
								.addComponent(lobbyList)
								.addGroup(
										layout.createSequentialGroup()
												.addComponent(createLobby)
												.addComponent(selectTrack)
												.addComponent(trackSelection)
												.addComponent(joinButton)
												.addComponent(logOutButton)
												.addComponent(helpButton)
												.addComponent(chatHelpButton)
												.addComponent(creditsButton)))
				.addGroup(
						layout.createParallelGroup().addComponent(ipField)
								.addComponent(sendButton)));

		// define button action listeners
		sendButton.addActionListener(e -> sendChatRequest(ipField.getText()));
		logOutButton.addActionListener(e -> client.commandQueue.add("LGOUR"));
		createLobby.addActionListener(e -> client.commandQueue.add("LOBCR:" + trackSelect));
		joinButton.addActionListener(e -> client.commandQueue.add("LOBJR:" + lobbyListData.get(select)));

		// add to frame, pack, set first time login messages and set visible
		frame.getContentPane().add(panel);
		frame.pack();
		if (!lobby) {
			chatBox.setText("""
					Welcome to the Server!
					To chat, enter text in the field below.

					Please keep your messages swearword free!
					Special commands:\s
					Whisper: \\w name message
					List players: \\l
					Change name: \\n name
					To broadcast use: \\a message
					List running games: \\g
					List game history: \\h
					""");
			addToChat("Logged in as: " + name);
			client.commandQueue.add("WHOOR");
		}
		frame.setVisible(true);

	}

	/**
	 * Moves the GUI to the lobby screen by disposing of previous frame and
	 * creating new one.
	 *
	 * @param lobbyName server name for lobby, usually lobby number as String
	 */
	public void moveToLobby(String lobbyName) {
		// dispose and re-instantiate frame
		int x = frame.getLocationOnScreen().x;
		int y = frame.getLocationOnScreen().y;
		frame.dispose();
		frame = new JFrame("Lobby " + lobbyName);
		frame.setLocation(x, y);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		// add window listener
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				if (1 == JOptionPane.showOptionDialog(frame, "Would you like to leave the lobby?",
						"Leave Lobby?", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null,
						new Object[]{"No", "Yes"}, "No")) {
					client.commandQueue.add("LOBLR");
				}
			}
		});

		// define panels and buttons
		JPanel panel = new JPanel();
		JButton sendButton = new JButton("Send");
		JButton leaveLobbyButton = new JButton("Leave Lobby");
		JScrollPane scrollPane = new JScrollPane(chatBox, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setPreferredSize(new Dimension(400, 400));
		feedback.setMinimumSize(new Dimension(400, 20));
		readyLabel = new JLabel("<html><font color='red'>Not Ready</font></html>");
		ready = false;
		JButton toggleReadyButton = new JButton("Toggle Ready");
		JLabel selectRes = new JLabel("Select Resolution:");
		JComboBox<String> resolutionSelection = new JComboBox<>(
				new String[]{STANDARD_RESOLUTION_360P,
						HIGH_DEFINITION_RESOLUTION_720P,
						FULL_HIGH_DEFINITION_RESOLUTION_1080P,
						QUAD_HIGH_DEFINITION_RESOLUTION_1440P,
						QUAD_FULL_HIGH_DEFINITION_RESOLUTION_4K});
		resolutionSelection.setSelectedItem(HIGH_DEFINITION_RESOLUTION_720P);
		resolutionSelection.setMaximumSize(toggleReadyButton.getSize());

		resolutionSelection.addActionListener(e -> {
			switch ((String) Objects.requireNonNull(resolutionSelection.getSelectedItem())) {
				case STANDARD_RESOLUTION_360P -> {
					resX = 640;
					resY = 360;
				}
				case HIGH_DEFINITION_RESOLUTION_720P -> {
					resX = 1280;
					resY = 720;
				}
				case FULL_HIGH_DEFINITION_RESOLUTION_1080P -> {
					resX = 1920;
					resY = 1080;
				}
				case QUAD_HIGH_DEFINITION_RESOLUTION_1440P -> {
					resX = 2560;
					resY = 1440;
				}
				case QUAD_FULL_HIGH_DEFINITION_RESOLUTION_4K -> {
					resX = 3840;
					resY = 2160;
				}
				default -> {
				}
			}
		});

		JLabel selectCar = new JLabel("Select Car:");
		JLabel selectedCar = new JLabel(Car.CAR_NAMES[Car.RACER]);
		carSelect = Car.RACER;
		carSelection = new JComboBox<>(RaceTrack.getCarImageArray());
		carSelection.setSelectedItem(Car.RACER);

		carSelection.setMaximumSize(new Dimension(Camera.TILE_SIDE_LENGTH,
				Camera.TILE_SIDE_LENGTH));

		carSelection.addActionListener(e -> {
			carSelect = carSelection.getSelectedIndex();
			selectedCar.setText(Car.CAR_NAMES[carSelect]);
		});

		JLabel selectControlType = new JLabel("Select Controls:");
		JComboBox<String> controlTypeSelection = new JComboBox<>(new String[]{TANK_CONTROLS, SIMPLE_CONTROLS});
		controlTypeSelection.setSelectedItem(controlType);
		controlTypeSelection.setMaximumSize(toggleReadyButton.getSize());
		controlTypeSelection.addActionListener(e -> {
			switch ((String) Objects.requireNonNull(controlTypeSelection.getSelectedItem())) {
				case TANK_CONTROLS -> controlType = ControlType.TANK;
				case SIMPLE_CONTROLS -> controlType = ControlType.SIMPLE;
				default -> {
				}
			}
		});

		// set GroupLayout for panel
		GroupLayout layout = new GroupLayout(panel);
		panel.setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		layout.setHorizontalGroup(layout
				.createSequentialGroup()
				.addGroup(
						layout.createParallelGroup().addComponent(scrollPane)
								.addComponent(ipField).addComponent(feedback))
				.addGroup(
						layout.createParallelGroup()
								.addComponent(leaveLobbyButton)
								.addComponent(readyLabel)
								.addComponent(toggleReadyButton)
								.addComponent(selectRes)
								.addComponent(resolutionSelection)
								.addComponent(selectControlType)
								.addComponent(controlTypeSelection)
								.addComponent(selectCar)
								.addComponent(carSelection)
								.addComponent(selectedCar)
								.addComponent(sendButton)
				));

		layout.setVerticalGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup()
						.addComponent(scrollPane)
						.addGroup(
								layout.createSequentialGroup()
										.addComponent(leaveLobbyButton)
										.addComponent(readyLabel)
										.addComponent(toggleReadyButton)
										.addComponent(selectRes)
										.addComponent(resolutionSelection)
										.addComponent(selectControlType)
										.addComponent(controlTypeSelection)
										.addComponent(selectCar)
										.addComponent(carSelection)
										.addComponent(selectedCar)
						)
				)
				.addGroup(layout.createParallelGroup()
						.addComponent(ipField)
						.addComponent(sendButton))
				.addComponent(feedback));

		// set button action listeners
		sendButton.addActionListener(e -> sendChatRequest(ipField.getText()));
		leaveLobbyButton.addActionListener(e -> client.commandQueue.add("LOBLR"));
		toggleReadyButton.addActionListener(e -> {
			if (ready) {
				client.commandQueue.add("LOBUR");
			} else {
				client.commandQueue.add("LOBRR:" + carSelect + ":" + controlType);
			}
		});

		// add, pack and set visible
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
		lobby = true;
	}

	/**
	 * Returns the GUI to the server and lobby select display.
	 */
	public void restoreToServer() {
		moveToServer("");
		lobby = false;
	}

	/**
	 * Starts a Camera for the parameter game.
	 *
	 * @param game the game object containing the relevant information
	 */
	public void startCamera(PowerRacerGame game) {
		frame.setVisible(false);
		camera = new Camera(game, resX, resY, this);
	}

	/**
	 * Returns the gui to the lobby from a game.
	 */
	public void returnToLobby() {
		camera.terminate();
		frame.setVisible(true);
	}

	/**
	 * Thread used to call the DiscoveryClient class and get a list of available
	 * servers.
	 *
	 * @author Florian
	 */
	class RefreshThread extends Thread {
		JButton button;

		RefreshThread(JButton button) {
			super();
			this.button = button;
			this.start();
		}

		@Override
		public void run() {
			button.setEnabled(false);

			feedback.setText("Refreshing...");
			addresses = DiscoveryClient.getServerAddresses();
			String[] data = new String[addresses.length];
			for (int i = 0; i < data.length; i++) {
				data[i] = addresses[i].getHostName();
			}
			list.setListData(data);
			feedback.setText("");

			button.setEnabled(true);
		}
	}

	/**
	 * Used to check whether a camera object is set, to avoid null pointers with
	 * bogus packets.
	 *
	 * @return if the camera exists
	 */
	public boolean cameraExists() {
		return camera != null;
	}

	/**
	 * Adds the parameter power up to the camera.
	 *
	 * @param vfx the power up to be added as vfx
	 */
	public void addEffect(Powerup vfx) {
		camera.addVFX(vfx);
	}
}
