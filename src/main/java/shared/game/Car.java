package shared.game;

import java.util.*;

import shared.game.powerup.Powerup;

/**
 * Car Object represents the logics of the Car.
 *
 * @author simeon
 */

public class Car {
	private boolean upIsPressed = false;
	private boolean downIsPressed = false;
	private boolean leftIsPressed = false;
	private boolean rightIsPressed = false;
	private boolean spaceIsPressed = false;

	private double x; // xposition
	private double y; // yposition
	private double rotation = 0;
	double speed = 0;

	int checkpoint, lap;

	public Powerup powerup;

	public static final byte RACER = 0, PACER = 1, DRAGSTER = 2, SPEEDSTER = 3, TRACTOR = 4;
	public static final String[] CAR_NAMES = {"Racer", "Pacer", "Dragster", "Speedster", "Tractor"};

	/*
	 * Default Value for car constructor.
	 */
	private String carName = "Default";
	private int imageNum = 0;
	private double acceleration = 1.3;
	private double breaking = -1;
	private double handling = Math.PI / 24; // How much the car will rotate per
	private final PowerRacerGame game;
	int carType;

	// calculation interval

	/*
	 * The first constructor should be called to set the car on the "startline",
	 * the second one is for testing.
	 */
	public Car(double x, double y, int carType, PowerRacerGame powerRacerGame) {
		this.game = powerRacerGame;
		this.x = x;
		this.y = y;
		this.carType = carType;
		/*
		 * This constructor chooses which car should be created.
		 */
		switch (carType) {
			case RACER -> {
				acceleration = 1.4;
				breaking = -0.5;
				handling = Math.PI / 30;
				carName = "Racer";
				imageNum = 0;
			}
			case PACER -> {
				acceleration = 1.42;
				handling = Math.PI / 32;
				carName = "Pacer";
				imageNum = 1;
			}
			case DRAGSTER -> {
				acceleration = 1.6;
				breaking = -0.4;
				handling = Math.PI / 48;
				carName = "Dragster";
				imageNum = 2;
			}
			case SPEEDSTER -> {
				acceleration = 1.45;
				carName = "Speedster";
				imageNum = 3;
			}
			case TRACTOR -> {
				acceleration = 1.35;
				carName = "Tractor";
				imageNum = 4;
			}
			default -> {
			}
			// Car has default values
		}

	}


	/*
	 * Functions to handle car movement through keyboard input.
	 */

	/*
	 * Acceleration formula: v = v + a - (v * friction)
	 */
	protected void accelerate(double friction) {
		speed = speed + acceleration - (speed * friction);
	}

	protected void slowDown(double friction) {
		speed = speed - breaking - (speed * friction);
	}

	protected void turnLeft() {
		rotation = (rotation + handling) % (2 * Math.PI);
	}

	protected void turnRight() {
		rotation = -(rotation + handling) % (2 * Math.PI);
	}

	/**
	 * Updates this car's speed and rotation according to the friction factor of
	 * the underlying terrain.
	 *
	 * @param frictionCoefficient the friction of the car's current terrain
	 */
	public void updateSpeedAndRotation(double frictionCoefficient) {
		if (game.getBotOn()) {
			/*
			  Auto-Drive
			 */
			upIsPressed = true;
			double rotLeft = this.getRotation() - Math.PI / 2;
			ArrayList<MagicLine> magicLineList = new ArrayList<>();
			for (int i = 0; rotLeft + i * handling <= rotLeft + Math.PI; i++) {
				MagicLine ML = new MagicLine(rotLeft + i * handling);
				magicLineList.add(ML);
			}
			int bestSteps = 0;
			int bestMagicLine = 0;
			for (int i = 0; i < magicLineList.size(); i++) {
				if (magicLineList.get(i).calculateSteps(game, this) > bestSteps) {
					bestSteps = magicLineList.get(i).calculateSteps(game, this);
					bestMagicLine = i;
				}
			}
			if (bestMagicLine < magicLineList.size() / 2 - 1) {
				leftIsPressed = true;
				rightIsPressed = false;
			} else if (bestMagicLine > magicLineList.size() / 2 - 1) {
				rightIsPressed = true;
				leftIsPressed = false;
			} else {
				rightIsPressed = false;
				leftIsPressed = false;
			}
		}

		/*
		 * Check if up & down or left & right are pressed simultaniously if so,
		 * do nothing.
		 */
		if (upIsPressed && !downIsPressed) {
			speed += acceleration - (speed * frictionCoefficient);
		} else if (downIsPressed && !upIsPressed) {
			speed += breaking - (speed * frictionCoefficient);
		} else {
			speed -= (speed * frictionCoefficient);
		}
		if (speed < acceleration / 10 && speed > breaking / 10) {
			speed = 0;
		}

		if (speed != 0) {
			if (leftIsPressed && !rightIsPressed) {
				// mod 2PI if you complete a full circle
				rotation = (rotation - (handling)) % (2 * Math.PI);
				// rotation = (rotation - (handling/20*speed)) % (2 * Math.PI);
			} else if (rightIsPressed && !leftIsPressed) {
				// mod 2PI if you complete a full circle
				rotation = (rotation + (handling)) % (2 * Math.PI);
			}
		}

	}

	public void setUp(boolean upIsPressed) {
		this.upIsPressed = upIsPressed;
	}

	public void setDown(boolean downIsPressed) {
		this.downIsPressed = downIsPressed;
	}

	public void setLeft(boolean leftIsPressed) {
		this.leftIsPressed = leftIsPressed;
	}

	public void setRight(boolean rightIsPressed) {
		this.rightIsPressed = rightIsPressed;
	}

	public void setPosition(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setRotation(double rotation) {
		this.rotation = rotation;
	}

	public void setCheckpoint(int checkpoint) {
		this.checkpoint = checkpoint;
	}

	public void increaseCheckpoint() {
		checkpoint++;
	}

	public void increaseLap() {
		lap++;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getSpeed() {
		return speed;
	}

	public double getRotation() {
		return rotation;
	}

	public String getName() {
		return carName;
	}

	public int getImageNum() {
		return imageNum;
	}

	public int getCheckpoint() {
		return checkpoint;
	}

	public int getLap() {
		return lap;
	}

	protected String printInfo() {
		return "\t---Carproperties---" + "\nName:\t\t" + carName + "\nAcceleration:\t" + this.acceleration
				+ "\nBreaking:\t" + breaking + "\nHandling:\t" + handling + "\n\n\t---Game Info---\n"
				+ "Pos:\t\t" + this.getX() + "/" + this.getY() + "\n" + "Speed: \t\t" + speed + "\n"
				+ "Rotation: \t" + rotation + "\n";
	}

	public boolean getUpIsPressed() {
		return this.upIsPressed;
	}

	public boolean getDownIsPressed() {
		return this.downIsPressed;
	}

	public boolean getLeftIsPressed() {
		return this.leftIsPressed;
	}

	public boolean getRightIsPressed() {
		return this.rightIsPressed;
	}

	public Powerup getPowerup() {
		return powerup;
	}

	public void setPowerup(Powerup powerup) {
		this.powerup = powerup;
	}

	public boolean getSpaceIsPressed() {
		return spaceIsPressed;
	}

	public void setSpace(boolean spaceIsPressed) {
		this.spaceIsPressed = spaceIsPressed;
	}
}
