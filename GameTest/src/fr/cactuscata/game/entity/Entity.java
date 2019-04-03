package fr.cactuscata.game.entity;

import fr.cactuscata.game.entity.stats.Statistics;
import fr.cactuscata.game.inventory.Inventory;
import fr.cactuscata.game.utils.registers.say.Namable;
import fr.cactuscata.game.world.location.Location;

public abstract class Entity implements Namable {

	private final EntityType entityType;
	private final Inventory inventory = new Inventory(this);
	private final Statistics stats;

	public Entity(EntityType entityType, Location location, Statistics stats) {
		this.entityType = entityType;
		this.stats = stats;
	}

	public abstract String getName();

	public Inventory getInventory() {
		return this.inventory;
	}

	public EntityType getEntityType() {
		return entityType;
	}

	public Statistics getStats() {
		return stats;
	}
}
