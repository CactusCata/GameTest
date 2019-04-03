package fr.cactuscata.game.entity.stats;

public class Statistics {

	private int health, maxHealth, defense, attack;
	private boolean die = false;

	public Statistics(int maxHealth, int health, int defense, int attack) {
		this.health = health;
		this.maxHealth = maxHealth;
		this.defense = defense;
		this.attack = attack;
	}

	public Statistics(int maxHealth, int defense, int attack) {
		this(maxHealth, maxHealth, defense, attack);
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void addDamage(int damage) {
		this.health -= damage;
		if (this.health <= 0) {
			this.die = true;
		}
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public boolean isDie() {
		return die;
	}

	public void setDie(boolean die) {
		this.die = die;
	}
}
