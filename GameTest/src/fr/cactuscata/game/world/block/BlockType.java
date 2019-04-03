package fr.cactuscata.game.world.block;

public enum BlockType {

	STONE((byte) 1),
	DIRT((byte) 2),
	GRASS((byte) 3);

	private final byte id;
	private final String name;

	private BlockType(byte id) {
		this.id = id;
		this.name = Character.toUpperCase(this.name().charAt(0)) + this.name().substring(1);
	}

	public String getName() {
		return name;
	}

	public byte getId() {
		return id;
	}

}
