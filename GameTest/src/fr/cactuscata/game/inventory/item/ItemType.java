package fr.cactuscata.game.inventory.item;

import fr.cactuscata.game.utils.exceptions.IDNotFoundException;
import fr.cactuscata.game.utils.exceptions.NameNotFoundException;

public enum ItemType {

	AIR(0, (byte) 10),
	STONE(1, (byte) 10),
	DIRT(2, (byte) 5);

	private final int id;
	private final byte maxStackSize;
	private final String name;

	private ItemType(int id, byte maxStackSize) {
		this.maxStackSize = maxStackSize;
		this.id = id;
		this.name = Character.toUpperCase(this.name().charAt(0)) + this.name().substring(1);
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public byte getMaxStackSize() {
		return maxStackSize;
	}

	public static ItemType getByID(byte id) {

		for (ItemType itemType : ItemType.values())
			if (itemType.getId() == id)
				return itemType;
		throw new IDNotFoundException(id, ItemType.class);

	}

	public static ItemType getByName(String name) {

		for (ItemType itemType : ItemType.values())
			if (itemType.getName().equals(name))
				return itemType;
		throw new NameNotFoundException(name, ItemType.class);

	}

}
