package fr.cactuscata.game.world.location;

import fr.cactuscata.game.world.World;

public class Location {

	private World world;
	private short x, y;
	private float yaw;

	public Location(World world, short x, short y, float yaw) {
		this.x = x;
		this.y = y;
		this.yaw = yaw;
		this.setWorld(world);
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

	public float getYaw() {
		return yaw;
	}

	public void setYaw(float yaw) {
		this.yaw = yaw;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

}
