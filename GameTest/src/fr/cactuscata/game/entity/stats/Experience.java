package fr.cactuscata.game.entity.stats;

public class Experience {

	private long experience;
	private int level;

	public Experience(long experience, int level) {
		this.setLevel(level);
		this.setExperience(experience);
	}

	public Experience() {
		this(0L, 1);
	}

	public long getExperience() {
		return experience;
	}

	public void setExperience(long experience) {
		this.experience = experience;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}
