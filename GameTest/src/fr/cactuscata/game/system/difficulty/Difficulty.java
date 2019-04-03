package fr.cactuscata.game.system.difficulty;

import fr.cactuscata.game.utils.exceptions.IDNotFoundException;
import fr.cactuscata.game.utils.exceptions.NameNotFoundException;

public class Difficulty {

	private byte difficulty;

	public Difficulty() {
		this.setDifficulty(DifficultyLevel.EASY.level);
	}

	public Difficulty(byte difficulty) {
		this.setDifficulty(difficulty);
	}

	public byte getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(byte difficulty) {
		if (difficulty > DifficultyLevel.maximumLevel() && difficulty < DifficultyLevel.minimumLevel())
			throw new IllegalArgumentException("La difficulté ne peut être situé qu'entre "
					+ DifficultyLevel.minimumLevel() + " et " + DifficultyLevel.maximumLevel() + ".");

		this.difficulty = difficulty;
	}

	public static enum DifficultyLevel {

		PRATICE((byte) 0),
		EASY((byte) 1),
		NORMAL((byte) 2),
		HARD((byte) 3),
		HARDCORD((byte) 4);

		private final byte level;
		private final String name;

		private DifficultyLevel(byte level) {
			this.level = level;
			this.name = Character.toUpperCase(this.name().charAt(0)) + this.name().substring(1);
		}

		public static DifficultyLevel getByID(byte level) {

			for (DifficultyLevel difficultyLevel : DifficultyLevel.values())
				if (difficultyLevel.level == level)
					return difficultyLevel;
			throw new IDNotFoundException(level, DifficultyLevel.class);

		}

		public static DifficultyLevel getByName(String name) {

			for (DifficultyLevel difficultyLevel : DifficultyLevel.values())
				if (difficultyLevel.name.equals(name))
					return difficultyLevel;
			throw new NameNotFoundException(name, DifficultyLevel.class);

		}

		public static byte minimumLevel() {
			byte minValue = (byte) 0;

			for (DifficultyLevel difficultyLevel : DifficultyLevel.values())
				if (minValue > difficultyLevel.level)
					minValue = difficultyLevel.level;
			return minValue;

		}

		public static byte maximumLevel() {
			byte maxValue = (byte) 0;

			for (DifficultyLevel difficultyLevel : DifficultyLevel.values())
				if (maxValue < difficultyLevel.level)
					maxValue = difficultyLevel.level;
			return maxValue;

		}

	}

}
