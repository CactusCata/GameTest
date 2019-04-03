package fr.cactuscata.game.world.location;

import fr.cactuscata.game.world.World;

public class BlockLocation {

	private short x, y;
	private final World world;

	public BlockLocation(World world, short x, short y) {
		this.world = world;
		this.x = x;
		this.y = y;
	}

	public BlockLocation(BlockLocation blockLocation) {
		this(blockLocation.world, blockLocation.x, blockLocation.y);
	}

	public short getX() {
		return x;
	}

	public void setX(short x) {
		this.x = x;
	}

	public short getY() {
		return y;
	}

	public void setY(short y) {
		this.y = y;
	}

	public World getWorld() {
		return world;
	}

}
