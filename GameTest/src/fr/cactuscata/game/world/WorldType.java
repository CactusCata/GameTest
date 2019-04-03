package fr.cactuscata.game.world;

import fr.cactuscata.game.utils.exceptions.IDNotFoundException;
import fr.cactuscata.game.utils.exceptions.NameNotFoundException;

public enum WorldType {

	NORMAL((byte) 0),
	HELL((byte) 1),
	HEAVEN((byte) 2);

	private final String name;
	private final int id;

	private WorldType(byte id) {
		this.name = Character.toUpperCase(this.name().charAt(0)) + this.name().substring(1);
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return id;
	}

	public static WorldType getByID(byte id) {

		for (WorldType worldType : WorldType.values())
			if (worldType.getId() == id)
				return worldType;
		throw new IDNotFoundException(id, WorldType.class);

	}

	public static WorldType getByName(String name) {

		for (WorldType worldType : WorldType.values())
			if (worldType.getName().equals(name))
				return worldType;
		throw new NameNotFoundException(name, WorldType.class);

	}

}
