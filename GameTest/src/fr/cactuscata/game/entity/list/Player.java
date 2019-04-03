package fr.cactuscata.game.entity.list;

import fr.cactuscata.game.entity.Entity;
import fr.cactuscata.game.entity.EntityType;
import fr.cactuscata.game.entity.stats.Experience;
import fr.cactuscata.game.entity.stats.Statistics;
import fr.cactuscata.game.world.location.Location;

public class Player extends Entity {

	private String playerName;
	private final Experience experience;

	public Player(String playerName, Location location) {
		super(EntityType.HUMAN, location, new Statistics(90, 0, 0));
		this.experience = new Experience();
		this.playerName = playerName;
	}

	@Override
	public String getName() {
		return this.playerName;
	}

	public Experience getExperience() {
		return experience;
	}

}
