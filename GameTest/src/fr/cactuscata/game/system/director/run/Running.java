package fr.cactuscata.game.system.director.run;

public class Running {

	private boolean running;

	/**
	 * Running equals <code>true</code>
	 */
	public Running() {
		this(true);
	}

	public Running(boolean running) {
		this.running = running;
	}

	public void changeRunning(boolean running) {
		this.running = running;
	}

	public boolean isRunning() {
		return this.running;
	}

	public void toggle() {
		this.running = !this.running;
	}
}
