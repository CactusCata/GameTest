package fr.cactuscata.game.entity;

import fr.cactuscata.game.utils.exceptions.IDNotFoundException;
import fr.cactuscata.game.utils.exceptions.NameNotFoundException;

public enum EntityType {

	HUMAN((byte) 0, (short) 90, (short) 130),
	ZOMBIE((byte) 1, (short) 40, (short) 80);

	private final byte id;
	private final short minLife, maxLife;
	private final String name;

	private EntityType(byte id, short minLife, short maxLife) {
		this.id = id;
		this.minLife = minLife;
		this.maxLife = maxLife;
		this.name = Character.toUpperCase(this.name().charAt(0)) + this.name().substring(1);
	}

	public byte getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static EntityType getByID(byte id) {

		for (EntityType entityType : EntityType.values())
			if (entityType.getId() == id)
				return entityType;
		throw new IDNotFoundException(id, EntityType.class);

	}

	public static EntityType getByName(String name) {

		for (EntityType entityType : EntityType.values())
			if (entityType.getName().equals(name))
				return entityType;
		throw new NameNotFoundException(name, EntityType.class);

	}

	public short getMinLife() {
		return minLife;
	}

	public short getMaxLife() {
		return maxLife;
	}

}
