package shared.game;

/**
 * Final class containing all preset track byte arrays, so this information does
 * not need to be read from a file each time.
 * 
 * @author Florian
 *
 */
public final class PresetTracks {
	public static final byte[][] RACETRACK_GRASS = {
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 24, 17, 17, 6, 28, 17, 17, 27, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 24, 17, 1, 1, 1, 6, 28, 1, 1, 1, 17, 27, 0, 0, 0, 0 },
			{ 0, 0, 0, 24, 1, 1, 1, 1, 18, 6, 28, 18, 1, 1, 1, 1, 27, 0, 0, 0 },
			{ 0, 0, 24, 1, 1, 1, 18, 26, 0, 0, 0, 0, 25, 18, 1, 1, 1, 27, 0, 0 },
			{ 0, 0, 15, 1, 1, 26, 0, 0, 0, 0, 0, 0, 0, 0, 25, 1, 1, 16, 0, 0 },
			{ 0, 24, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 1, 1, 27, 0 },
			{ 0, 15, 1, 1, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 25, 1, 1, 16, 0 },
			{ 0, 15, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 1, 16, 0 },
			{ 0, 15, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 5, 5, 0 },
			{ 0, 7, 7, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 1, 16, 0 },
			{ 0, 15, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 1, 16, 0 },
			{ 0, 15, 1, 1, 27, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 24, 1, 1, 16, 0 },
			{ 0, 25, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 1, 1, 26, 0 },
			{ 0, 0, 15, 1, 1, 27, 0, 0, 0, 0, 0, 0, 0, 0, 24, 1, 1, 16, 0, 0 },
			{ 0, 0, 25, 1, 1, 1, 17, 27, 0, 0, 0, 0, 24, 17, 1, 1, 1, 26, 0, 0 },
			{ 0, 0, 0, 25, 1, 1, 1, 1, 17, 17, 4, 17, 1, 1, 1, 1, 26, 0, 0, 0 },
			{ 0, 0, 0, 0, 25, 18, 1, 1, 1, 1, 4, 1, 1, 1, 18, 26, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 25, 18, 18, 18, 4, 18, 18, 26, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

	public static final byte[][] RACETRACK_ICE = {
			{ 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23 },
			{ 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23 },
			{ 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 24, 17, 17, 10, 17, 17, 27, 23, 23 },
			{ 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 24, 1, 1, 1, 10, 1, 1, 1, 27, 23 },
			{ 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 24, 1, 1, 1, 1, 10, 1, 1, 1, 16, 23 },
			{ 23, 23, 23, 23, 23, 24, 17, 17, 17, 17, 13, 17, 17, 17, 17, 17,
					27, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 24, 17, 17, 17,
					17, 17, 22, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 24, 1, 1, 1, 1, 1, 10, 1, 1, 1, 16, 23 },
			{ 23, 23, 23, 23, 24, 1, 1, 1, 1, 1, 13, 1, 1, 1, 1, 1, 1, 27, 23,
					23, 23, 23, 23, 23, 23, 23, 24, 1, 1, 1, 1, 1, 1, 17, 17,
					17, 17, 17, 17, 17, 22, 23, 23, 23, 23, 23, 23, 24, 1, 1,
					1, 1, 18, 18, 10, 1, 1, 1, 16, 23 },
			{ 23, 23, 23, 24, 1, 1, 1, 1, 1, 1, 13, 1, 1, 1, 1, 1, 1, 1, 27,
					23, 23, 23, 23, 23, 23, 24, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
					1, 1, 1, 1, 17, 17, 17, 17, 17, 17, 17, 1, 1, 1, 1, 26, 23,
					23, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 1, 1, 1, 13, 1, 1, 1, 1, 1, 1, 1, 16,
					23, 23, 23, 23, 23, 24, 1, 1, 1, 1, 1, 1, 18, 1, 1, 1, 1,
					1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 26, 23, 23, 23,
					23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 1, 18, 18, 13, 18, 18, 18, 18, 1, 1, 1,
					16, 23, 23, 23, 23, 24, 1, 1, 1, 1, 1, 26, 23, 23, 25, 1,
					1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 26, 23, 23,
					23, 23, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 23, 23, 23, 23, 23, 23, 15, 1,
					1, 16, 23, 23, 23, 23, 15, 1, 1, 1, 1, 1, 27, 23, 23, 24,
					1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 26, 23, 23,
					23, 23, 23, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 3, 23, 23, 15, 1, 1,
					16, 23, 23, 23, 23, 15, 1, 1, 1, 1, 1, 1, 1, 17, 1, 1, 1,
					1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 26, 23, 23, 23, 23, 23,
					23, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 3, 23, 23, 15, 1, 1,
					16, 23, 23, 23, 23, 15, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
					1, 1, 1, 1, 18, 18, 18, 18, 18, 18, 26, 23, 23, 23, 23, 23,
					23, 23, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 3, 23, 23, 15, 1, 1,
					16, 23, 23, 23, 23, 15, 1, 1, 1, 1, 1, 1, 1, 1, 1, 18, 18,
					18, 18, 18, 18, 18, 21, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 3, 23, 23, 15, 1, 1,
					16, 23, 23, 23, 23, 15, 1, 1, 1, 18, 18, 18, 18, 18, 18,
					21, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 19, 18, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 3, 23, 23, 12, 12, 12,
					12, 23, 23, 23, 23, 15, 1, 1, 16, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 3, 3, 3, 3, 3, 3,
					3, 3, 3, 3, 3, 3, 3, 3, 15, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 3, 23, 23, 15, 1, 1,
					16, 23, 23, 23, 23, 15, 1, 1, 16, 23, 23, 23, 23, 23, 23,
					3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
					3, 23, 20, 17, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 3, 23, 23, 15, 1, 1,
					16, 23, 23, 23, 23, 11, 11, 11, 11, 23, 23, 23, 23, 23, 23,
					3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
					3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 3, 23, 23, 15, 1, 1, 1,
					17, 17, 17, 17, 1, 1, 1, 16, 23, 23, 3, 3, 3, 3, 3, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
					3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 3, 23, 23, 15, 1, 1, 1,
					1, 1, 1, 1, 1, 1, 1, 16, 23, 23, 3, 3, 3, 3, 3, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 3, 23, 23, 25, 1, 1, 1,
					1, 1, 1, 1, 1, 1, 1, 26, 23, 23, 3, 3, 3, 3, 3, 23, 23, 23,
					23, 24, 17, 8, 17, 17, 17, 17, 17, 17, 17, 27, 23, 23, 23,
					3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 3, 23, 23, 23, 25, 1,
					1, 1, 1, 1, 1, 1, 1, 26, 23, 23, 23, 3, 3, 3, 3, 3, 23, 23,
					23, 24, 1, 1, 8, 1, 1, 1, 1, 1, 1, 1, 1, 27, 23, 23, 3, 3,
					23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 3, 23, 23, 23, 23, 25,
					18, 18, 18, 18, 18, 18, 26, 23, 23, 23, 23, 3, 3, 3, 3, 3,
					23, 23, 24, 1, 1, 1, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 27, 23,
					3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 7, 7, 7, 7, 7, 23, 3, 3, 3, 3, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 3, 3, 3, 3, 3,
					23, 23, 15, 1, 1, 18, 8, 18, 18, 1, 1, 1, 1, 1, 1, 1, 16,
					23, 3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 3, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 3, 3, 3, 3, 3,
					23, 23, 15, 1, 16, 23, 23, 23, 23, 15, 1, 1, 26, 25, 1, 1,
					16, 23, 3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
					3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 23, 23, 15, 1,
					16, 23, 3, 3, 23, 15, 1, 16, 23, 23, 15, 1, 16, 23, 3, 3,
					23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
					3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 23, 23, 15, 1,
					16, 23, 3, 3, 23, 15, 1, 16, 23, 23, 15, 1, 16, 23, 3, 3,
					23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
					3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 23, 23, 15, 1,
					16, 23, 3, 3, 23, 15, 1, 16, 23, 23, 15, 1, 16, 23, 3, 3,
					23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
					3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 23, 23, 15, 1,
					16, 23, 3, 3, 23, 15, 1, 16, 23, 23, 15, 1, 16, 23, 3, 3,
					23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3,
					3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 23, 23, 15, 1,
					16, 23, 3, 3, 23, 15, 1, 16, 23, 23, 15, 1, 16, 23, 3, 3,
					23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 23,
					23, 15, 1, 16, 23, 3, 3, 23, 15, 1, 16, 23, 23, 15, 1, 16,
					23, 3, 3, 23, 15, 1, 18, 21, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 23, 23, 24, 17, 17, 5,
					17, 27, 23, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 23,
					23, 15, 1, 16, 23, 3, 3, 23, 15, 1, 16, 23, 23, 15, 1, 16,
					23, 3, 3, 23, 15, 16, 3, 3, 3 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 23, 24, 1, 1, 1, 5, 1,
					1, 27, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 23, 23,
					15, 1, 16, 23, 3, 3, 23, 15, 1, 16, 23, 23, 15, 1, 16, 23,
					3, 3, 23, 15, 1, 17, 22, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 23, 15, 1, 1, 18, 5,
					18, 1, 16, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 23,
					23, 15, 1, 16, 23, 3, 3, 23, 15, 1, 1, 27, 24, 1, 1, 16,
					23, 3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 23, 15, 1, 16, 23, 23,
					23, 15, 16, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 23,
					23, 15, 1, 16, 23, 3, 3, 23, 25, 1, 1, 1, 1, 1, 1, 26, 23,
					3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 23, 15, 1, 1, 27, 23,
					24, 1, 16, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 23,
					23, 15, 1, 16, 23, 3, 3, 23, 23, 25, 1, 1, 1, 1, 26, 23,
					23, 3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23,
					15, 1, 16, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 23,
					23, 15, 1, 16, 23, 3, 3, 23, 23, 23, 15, 1, 1, 16, 23, 3,
					3, 3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23,
					15, 1, 16, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 23,
					23, 15, 1, 16, 23, 3, 3, 23, 23, 23, 15, 1, 1, 16, 23, 3,
					3, 3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23,
					15, 1, 16, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 23,
					23, 15, 1, 16, 23, 3, 3, 3, 3, 23, 15, 1, 1, 16, 23, 3, 3,
					3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23,
					15, 1, 16, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 23,
					23, 15, 1, 16, 23, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23, 3, 3,
					3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23,
					15, 1, 16, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 23, 23, 23, 23,
					23, 15, 1, 16, 23, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23, 3, 3,
					3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23,
					15, 1, 16, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 23, 23, 23, 23,
					23, 15, 1, 16, 23, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23, 3, 3,
					3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23,
					15, 1, 16, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 23, 23, 23, 23,
					23, 6, 6, 6, 23, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23, 3, 3,
					3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23,
					15, 1, 16, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 23, 23, 23, 20,
					17, 1, 1, 16, 23, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23, 3, 3,
					3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23,
					15, 1, 16, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 23, 23, 23, 15,
					1, 1, 1, 16, 23, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23, 3, 3,
					3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 18, 21, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23,
					15, 1, 16, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 23, 23, 23, 15,
					1, 1, 1, 16, 23, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23, 3, 3,
					3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 16, 3, 3, 3, 3, 3, 3, 23, 15, 1, 1, 16, 23,
					15, 1, 16, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 23, 23, 23, 15,
					1, 1, 1, 16, 23, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23, 3, 3,
					3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 16, 3, 3, 3, 3, 3, 3, 23, 15, 1, 1, 16, 23,
					15, 1, 16, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 23, 23, 23, 15,
					1, 1, 1, 16, 23, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23, 3, 3,
					3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 17, 22, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23,
					15, 1, 16, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 23, 23, 23, 15,
					1, 1, 1, 16, 23, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23, 3, 3,
					3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23,
					15, 1, 16, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 23, 23, 23, 15,
					1, 1, 1, 16, 23, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23, 3, 3,
					3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23,
					15, 1, 16, 23, 23, 23, 3, 3, 3, 3, 3, 3, 3, 23, 23, 23, 15,
					1, 1, 1, 16, 23, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23, 3, 3,
					3, 3, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23,
					15, 1, 16, 23, 23, 23, 23, 23, 3, 3, 23, 23, 23, 23, 23,
					23, 15, 1, 1, 1, 16, 23, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23,
					23, 23, 23, 23, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 16, 23, 23, 23, 23, 23, 15, 1, 1, 16,
					23, 15, 1, 1, 17, 17, 17, 17, 22, 3, 3, 20, 17, 17, 17, 17,
					17, 1, 1, 1, 1, 16, 23, 23, 3, 3, 3, 23, 15, 1, 1, 16, 23,
					23, 23, 23, 23, 23, 15, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 1, 17, 17, 4, 17, 17, 1, 1, 1, 16, 23,
					15, 1, 1, 1, 1, 1, 1, 16, 3, 3, 15, 1, 1, 1, 1, 1, 1, 1, 1,
					1, 16, 23, 23, 3, 3, 3, 23, 15, 1, 1, 1, 17, 17, 9, 17, 17,
					17, 1, 1, 1, 16, 23 },
			{ 23, 23, 23, 15, 1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 16, 23, 15,
					1, 1, 1, 1, 1, 1, 16, 3, 3, 15, 1, 1, 1, 1, 1, 1, 1, 1, 1,
					16, 23, 23, 3, 3, 3, 23, 15, 1, 1, 1, 1, 1, 9, 1, 1, 1, 1,
					1, 1, 16, 23 },
			{ 23, 23, 23, 25, 1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 26, 23, 25,
					1, 1, 1, 1, 1, 1, 1, 17, 17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
					26, 23, 23, 3, 3, 3, 23, 15, 1, 1, 1, 1, 1, 9, 1, 1, 1, 1,
					1, 1, 16, 23 },
			{ 23, 23, 23, 23, 25, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 26, 23, 23, 23,
					25, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 26,
					23, 23, 23, 3, 3, 3, 23, 25, 1, 1, 1, 1, 1, 9, 1, 1, 1, 1,
					1, 1, 26, 23 },
			{ 23, 23, 23, 23, 23, 25, 18, 18, 18, 18, 4, 18, 18, 18, 26, 23,
					23, 23, 23, 23, 25, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18,
					18, 18, 18, 18, 18, 26, 23, 23, 23, 23, 3, 3, 3, 23, 23,
					25, 1, 1, 1, 1, 9, 1, 1, 1, 1, 1, 26, 23, 23 },
			{ 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 3, 3, 3, 23, 23,
					23, 25, 18, 18, 18, 9, 18, 18, 18, 18, 26, 23, 23, 23 },
			{ 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23,
					23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23 } };

	public static final byte[][] RACETRACK_SMALL = {
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 20, 17, 17, 17, 17, 17, 17, 17, 17, 6, 17, 17,
					17, 17, 17, 17, 17, 22, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 20, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 1, 1,
					1, 1, 1, 22, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 20, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 1, 1, 1, 1, 1,
					1, 1, 1, 1, 22, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 1, 1, 18, 18, 18, 18, 18, 18, 6, 18, 18,
					18, 18, 18, 1, 1, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 1, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					19, 1, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 15, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 15, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 15, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 15, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 15, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 15, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 15, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 15, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 15, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 15, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 5, 5, 5, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					15, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 7, 7, 7, 7, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 15, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 15, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 15, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 15, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 15, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 15, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 15, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 15, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 15, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 15, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 1, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					20, 1, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 15, 1, 1, 1, 1, 17, 17, 17, 17, 17, 4, 17, 17, 17,
					17, 17, 17, 1, 1, 1, 1, 16, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 19, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 1,
					1, 1, 1, 1, 21, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 19, 1, 1, 1, 1, 1, 1, 1, 1, 4, 1, 1, 1, 1, 1, 1,
					1, 1, 1, 21, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 19, 18, 18, 18, 18, 18, 18, 18, 4, 18, 18, 18,
					18, 18, 18, 18, 18, 21, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0 } };
	public static final byte[][] RACETRACK_SAND = {
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 20, 17, 17, 10, 17, 17, 22, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2 },
			{ 2, 2, 2, 20, 1, 1, 1, 10, 1, 1, 1, 22, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					20, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17,
					17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17,
					17, 22, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 20, 1, 1, 1, 1, 10, 1, 1, 1, 1, 22, 2, 2, 2, 2, 2, 2, 20,
					17, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
					1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 22, 2, 2, 2, 2,
					2, 2 },
			{ 2, 2, 15, 1, 1, 1, 1, 10, 18, 1, 1, 1, 16, 2, 2, 2, 2, 2, 2, 15,
					1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
					1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 18, 1, 1, 1, 22, 2, 2, 2, 2,
					2 },
			{ 2, 2, 15, 1, 1, 1, 21, 2, 2, 19, 1, 1, 16, 2, 2, 2, 2, 2, 2, 15,
					1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
					1, 1, 1, 1, 1, 1, 1, 1, 1, 21, 2, 19, 1, 1, 16, 2, 2, 2, 2,
					2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 15, 1, 16, 2, 2, 2, 2, 2, 2, 15,
					1, 1, 1, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18,
					18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 21, 2,
					2, 2, 19, 1, 16, 2, 2, 2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 15, 1, 16, 2, 2, 2, 2, 2, 2, 15,
					1, 1, 21, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 16, 2, 2, 2,
					2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 15, 1, 16, 2, 2, 2, 2, 2, 2, 15,
					1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 20, 1, 16, 2, 2, 2,
					2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 15, 1, 16, 2, 2, 2, 2, 2, 2, 15,
					1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 20, 1, 1, 16, 2, 2, 2,
					2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 15, 1, 16, 2, 2, 2, 2, 2, 2, 15,
					1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 16, 2, 2, 2,
					2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 15, 1, 16, 2, 2, 2, 2, 2, 2, 15,
					1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 16, 2, 2, 2,
					2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 15, 1, 1, 22, 2, 2, 2, 2, 20, 1,
					1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 16, 2, 2, 2,
					2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 15, 1, 1, 1, 17, 17, 9, 17, 1, 1,
					1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 16, 2, 2, 2,
					2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 15, 1, 1, 1, 1, 1, 9, 1, 1, 1, 1,
					21, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 8, 8, 8, 8, 2, 2, 2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 19, 1, 1, 1, 1, 1, 9, 1, 1, 1,
					21, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 16, 2, 2, 2,
					2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 19, 18, 18, 18, 18, 9, 18, 18,
					21, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 16, 2, 2,
					2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 20,
					17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 1, 1, 1, 16, 2,
					2, 2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 20, 17, 17, 17, 17,
					1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 16, 2, 2, 2,
					2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 20, 17, 17, 17, 17, 17, 17, 1, 1, 1, 1,
					1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 21, 2, 2,
					2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 20, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 18, 18,
					18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 21, 2,
					2, 2, 2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 20, 1, 1, 1, 1, 1, 18, 18, 18, 18, 18, 18, 21,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 15, 1, 1, 1, 1, 21, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 7, 7, 7, 7, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 15, 1, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 6, 6, 6, 6, 6, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 15, 1, 1, 1, 1, 22, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 15, 1, 1, 1, 1, 1, 17, 17, 17, 17, 17, 17, 17,
					17, 17, 17, 17, 17, 17, 22, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 19, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
					1, 1, 1, 1, 1, 17, 17, 17, 17, 22, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 19, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
					1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 17, 22, 2, 2, 2, 2, 2, 2, 2,
					2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 19, 18, 18, 18, 18, 18, 18, 18, 18, 18,
					18, 18, 18, 18, 18, 18, 18, 1, 1, 1, 1, 1, 1, 1, 1, 17, 17,
					22, 2, 2, 2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 19, 18, 1, 1, 1, 1, 1, 1, 1, 1, 1, 22, 2, 2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 19, 18, 18, 18, 18, 1, 1, 1, 1, 1, 22, 2, 2,
					2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 19, 18, 1, 1, 1, 16, 2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 16, 2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 16, 2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 16, 2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 16, 2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 16, 2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 20, 17, 17, 17, 17,
					17, 17, 22, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 16,
					2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 20, 17, 17, 17, 22, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 20, 1, 1, 1, 1,
					1, 1, 1, 1, 22, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 16,
					2, 2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 20, 1, 1, 1, 1, 1, 22, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 20, 1, 1, 1, 1, 1, 1,
					1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 16, 2,
					2, 2 },
			{ 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 20, 1, 1, 1, 1, 1, 1, 1, 22, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 1, 18, 18,
					18, 18, 1, 1, 1, 22, 2, 2, 2, 2, 2, 2, 2, 2, 2, 5, 5, 5, 5,
					2, 2, 2 },
			{ 2, 2, 15, 1, 1, 1, 22, 2, 2, 2, 15, 1, 1, 1, 1, 1, 1, 1, 1, 22,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 21, 2, 2, 2,
					2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 16,
					2, 2, 2 },
			{ 2, 2, 15, 1, 1, 1, 1, 17, 17, 17, 1, 1, 1, 18, 18, 18, 1, 1, 1,
					16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 16, 2, 2, 2,
					2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1,
					16, 2, 2, 2 },
			{ 2, 2, 19, 1, 1, 1, 1, 1, 1, 1, 1, 1, 16, 2, 2, 2, 15, 1, 1, 16,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 16, 2, 2, 2, 2,
					2, 19, 1, 1, 1, 22, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 16,
					2, 2, 2 },
			{ 2, 2, 2, 19, 1, 1, 1, 1, 1, 1, 1, 1, 21, 2, 2, 2, 15, 1, 1, 16,
					2, 2, 2, 2, 2, 2, 20, 17, 17, 17, 17, 17, 1, 1, 16, 2, 2,
					2, 2, 2, 2, 15, 1, 1, 16, 2, 2, 2, 2, 2, 2, 2, 20, 1, 1, 1,
					16, 2, 2, 2 },
			{ 2, 2, 2, 2, 19, 18, 18, 18, 18, 18, 18, 21, 2, 2, 2, 2, 15, 1, 1,
					1, 17, 17, 4, 17, 17, 17, 1, 1, 1, 1, 1, 1, 1, 1, 16, 2, 2,
					2, 2, 2, 2, 19, 1, 1, 1, 17, 17, 17, 17, 17, 17, 17, 1, 1,
					1, 1, 16, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 15, 1, 1, 1, 1,
					1, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 18, 21, 2, 2, 2, 2, 2,
					2, 2, 15, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 16, 2, 2,
					2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 19, 1, 1, 1, 1,
					1, 4, 1, 1, 1, 1, 18, 18, 18, 18, 18, 21, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 19, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 21, 2,
					2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 19, 18, 18,
					18, 18, 4, 18, 18, 18, 21, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 19, 18, 18, 18, 18, 1, 1, 1, 1, 1, 1, 1, 21,
					2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 19, 18, 18, 18, 18, 18, 21, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
					2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 } };

	public static final byte[][] DBIS_TEST_TRACK = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,20,17,17,17,17,7,17,17,17,17,17,17,17,17,27,0,0},
			{0,0,0,24,17,17,17,17,17,17,17,17,17,17,17,1,1,1,1,1,7,1,1,1,1,1,1,1,1,1,27,0},
			{0,0,24,1,1,18,18,18,18,18,18,18,18,18,18,1,1,1,1,1,7,1,1,1,1,1,1,1,1,1,16,0},
			{0,24,1,1,26,0,0,0,0,0,0,0,0,0,0,19,18,18,18,18,7,18,18,18,18,18,18,1,1,1,16,0},
			{0,15,1,16,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,2,0,0,0,0,0,2,15,1,1,16,0},
			{0,4,4,4,0,2,0,0,0,0,0,2,0,0,0,0,0,0,0,0,2,0,0,0,0,0,2,15,1,1,16,0},
			{0,15,1,16,0,2,0,0,0,0,0,2,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,15,1,1,16,0},
			{0,15,1,16,0,2,0,0,0,0,0,2,0,0,0,0,0,0,0,0,2,0,0,0,0,0,2,15,1,1,16,0},
			{0,15,1,16,0,0,2,2,2,2,2,0,0,0,0,0,0,0,0,0,2,0,0,0,0,0,2,15,1,1,16,0},
			{0,15,1,16,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,15,1,1,16,0},
			{0,15,1,1,17,17,17,17,17,17,17,17,17,22,0,0,0,0,0,0,0,0,0,0,0,0,0,15,1,1,16,0},
			{0,15,1,1,1,1,1,1,1,1,1,1,1,16,0,0,0,0,0,0,0,0,0,0,0,0,24,1,1,1,26,0},
			{0,19,18,18,18,18,18,18,18,18,18,1,1,16,0,0,0,0,0,0,0,0,0,0,0,0,15,1,1,26,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,5,5,5,0,0,0,0,0,0,0,0,0,0,0,0,15,1,16,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,15,1,16,0,0,0,0,0,0,0,0,0,0,0,0,10,10,10,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,24,1,1,16,0,0,0,0,0,0,0,0,0,0,0,0,15,1,1,27,0,0},
			{0,20,17,17,17,17,17,17,17,17,1,1,1,26,0,0,0,0,0,0,0,0,0,0,0,0,25,1,1,1,27,0},
			{0,15,1,1,1,1,1,1,1,1,1,1,26,0,24,17,17,27,0,0,0,0,0,0,0,0,1,25,1,1,16,0},
			{0,15,1,1,1,18,18,18,18,18,18,26,0,24,1,1,1,1,27,0,0,0,0,0,0,0,0,0,15,1,16,0},
			{0,15,1,1,16,2,2,2,2,2,2,2,0,15,1,26,25,1,1,27,0,2,2,0,0,0,2,0,15,1,16,0},
			{0,15,1,1,16,2,0,0,2,0,0,2,0,15,16,0,0,15,1,16,2,0,0,2,0,0,2,0,15,1,16,0},
			{0,15,1,1,16,2,0,0,2,0,0,2,0,15,16,0,0,8,8,8,2,0,0,2,0,0,2,0,15,1,16,0},
			{0,15,1,1,16,2,0,0,2,0,0,2,0,15,16,0,0,15,1,16,2,0,0,2,0,0,2,0,15,1,16,0},
			{0,25,1,1,16,0,2,2,0,2,2,0,0,15,16,0,0,15,1,16,2,0,0,0,2,2,0,0,15,1,16,0},
			{0,0,15,1,16,0,0,0,0,0,0,0,24,1,16,0,0,15,1,16,0,0,0,0,0,0,0,24,1,1,16,0},
			{0,0,15,1,1,17,17,17,17,17,6,17,1,1,16,0,0,15,1,1,17,17,17,9,17,17,17,1,1,1,16,0},
			{0,0,15,1,1,1,1,1,1,1,6,1,1,1,16,0,0,15,1,1,1,1,1,9,1,1,1,1,1,1,16,0},
			{0,0,15,1,1,1,1,1,1,1,6,1,1,1,26,0,0,15,1,1,1,1,1,9,1,1,1,1,1,1,26,0},
			{0,0,25,18,18,18,18,18,18,18,6,18,18,26,0,0,0,19,18,18,18,18,18,9,18,18,18,18,18,26,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};

}
