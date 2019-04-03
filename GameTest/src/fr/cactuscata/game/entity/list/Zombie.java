package fr.cactuscata.game.entity.list;

import fr.cactuscata.game.entity.Entity;
import fr.cactuscata.game.entity.EntityType;
import fr.cactuscata.game.entity.stats.Statistics;
import fr.cactuscata.game.world.location.Location;

public class Zombie extends Entity {

	private String entityName;

	public Zombie(String entityName, Location location) {
		super(EntityType.ZOMBIE, location, new Statistics(90, 0, 0));
		this.entityName = entityName;
	}

	@Override
	public String getName() {
		return this.entityName;
	}

}
