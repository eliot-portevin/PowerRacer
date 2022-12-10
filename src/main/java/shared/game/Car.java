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

	private final ControlType controlType;

	/*
	 * The first constructor should be called to set the car on the "startline",
	 * the second one is for testing.
	 */
	public Car(double x, double y, int carType, PowerRacerGame powerRacerGame, ControlType controlType) {
		this.game = powerRacerGame;
		this.x = x;
		this.y = y;
		this.carType = carType;
		this.controlType = controlType;
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
	 * Acceleration formula: v = v + a - (v * friction)
	 */

	/**
	 * Updates this car's speed and rotation according to the friction factor of the underlying terrain.
	 *
	 * @param frictionCoefficient the friction of the car's current terrain
	 */
	public void updateSpeedAndRotation(double frictionCoefficient) {
		if (game.getBotOn()) {
			setAutopilotInput();
			updateSpeedAndRotation(upIsPressed, downIsPressed, rightIsPressed, leftIsPressed, frictionCoefficient);
			return;
		}

		boolean accelerate = getAccelerate();
		boolean brake = getBrake();
		boolean turnRight = getTurnRight();
		boolean turnLeft = getTurnLeft();

		updateSpeedAndRotation(accelerate, brake, turnRight, turnLeft, frictionCoefficient);
	}

	public boolean getAccelerate() {
		return switch (controlType) {
			case SIMPLE -> upIsPressed || downIsPressed || leftIsPressed || rightIsPressed;
			case TANK -> upIsPressed;
		};
	}

	public boolean getBrake() {
		return switch (controlType) {
			case SIMPLE -> !getAccelerate() && speed > 0;
			case TANK -> downIsPressed;
		};
	}

	public boolean getTurnRight() {
		return switch (controlType) {
			case SIMPLE -> inputRotationValid() && shortestRotationDirection(getCanonicalRotation(), getInputRotation()) > 0;
			case TANK -> rightIsPressed;
		};
	}

	public boolean getTurnLeft() {
		return switch (controlType) {
			case SIMPLE -> inputRotationValid() && shortestRotationDirection(getCanonicalRotation(), getInputRotation()) < 0;
			case TANK -> leftIsPressed;
		};
	}

	private int shortestRotationDirection(double currentRotation, double targetRotation) {
		double diff = targetRotation - currentRotation;

		// If we cannot approach the target direction closer by turning, return 0
		double absDiff = Math.abs(diff);
		if (absDiff <= handling / 2 || absDiff >= 2 * Math.PI - (handling / 2)) {
			return 0;
		}

		if (diff >= Math.PI || (diff < 0 && Math.abs(diff) < Math.PI)) {
			return -1;
		} else {
			return 1;
		}
	}

	private void updateSpeedAndRotation(boolean accelerate, boolean brake, boolean turnRight, boolean turnLeft, double frictionCoefficient) {
		/*
		 * Check if up & down or left & right are pressed simultaneously if so, do nothing.
		 */
		if (accelerate && !brake) {
			speed += acceleration - (speed * frictionCoefficient);
		} else if (brake && !accelerate) {
			speed += breaking - (speed * frictionCoefficient);
		} else {
			speed -= (speed * frictionCoefficient);
		}
		if (speed < acceleration / 10 && speed > breaking / 10) {
			speed = 0;
		}

		if (speed != 0) {
			if (turnLeft && !turnRight) {
				// mod 2PI if you complete a full circle
				rotation = (rotation - (handling)) % (2 * Math.PI);
			} else if (turnRight && !turnLeft) {
				// mod 2PI if you complete a full circle
				rotation = (rotation + (handling)) % (2 * Math.PI);
			}
		}
	}

	private void setAutopilotInput() {
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

	/**
	 * Calculates the angle representation of the directional input in radians.
	 */
	private double getInputRotation() {
		double x = 0, y = 0;
		if (upIsPressed) {
			y--;
		}
		if (downIsPressed) {
			y++;
		}
		if (rightIsPressed) {
			x++;
		}
		if (leftIsPressed) {
			x--;
		}
		return (Math.atan2(y, x) + 2 * Math.PI) % (2 * Math.PI);
	}

	private boolean inputRotationValid() {
		return upIsPressed != downIsPressed || leftIsPressed != rightIsPressed;
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

	/**
	 * @return The rotation in the interval (-2Pi, 2Pi)
	 */
	public double getRotation() {
		return rotation;
	}

	/**
	 * @return The canonical rotation in the interval [0, 2Pi)
	 */
	public double getCanonicalRotation() {
		return (rotation + 2 * Math.PI) % (2 * Math.PI);
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
