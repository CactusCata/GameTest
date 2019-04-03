package fr.cactuscata.game.system;

import fr.cactuscata.game.system.difficulty.Difficulty;
import fr.cactuscata.game.system.director.run.Runner;
import fr.cactuscata.game.system.director.run.Running;

public class System {

	private final Difficulty difficulty = new Difficulty();
	private final Running running = new Running();
	private final Runner runner = new Runner(this.running);

	public Running getRunning() {
		return running;
	}

	public Runner getRunner() {
		return runner;
	}

	public static void shutDown() {
		java.lang.System.exit(-1);
	}

	public Difficulty getDifficulty() {
		return difficulty;
	}

}
