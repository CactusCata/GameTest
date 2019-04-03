package fr.cactuscata.game.world;

import java.util.ArrayList;
import java.util.Collection;

import fr.cactuscata.game.entity.list.Player;
import fr.cactuscata.game.utils.registers.say.Namable;
import fr.cactuscata.game.world.block.Block;
import fr.cactuscata.game.world.location.BlockLocation;

public class World implements Namable {

	private final Block[][] blocks = new Block[Byte.MAX_VALUE][Byte.MAX_VALUE];
	private final String worldName;
	private final WorldType worldType;
	private final Collection<Player> playerList = new ArrayList<>();
	private boolean generated = false;

	public World(String worldName, WorldType worldType) {
		this.worldName = worldName;
		this.worldType = worldType;
	}

	public String getWorldName() {
		return this.worldName;
	}

	public WorldType getWorldType() {
		return this.worldType;
	}

	public Collection<Player> getPlayerList() {
		return this.playerList;
	}

	@Override
	public String getName() {
		return "{Worldname=" + this.worldName + ",WorldType=" + this.worldType.getName() + "}";
	}

	public void setBlock(Block block, BlockLocation blocLocation) {
		this.blocks[blocLocation.getX()][blocLocation.getY()] = block;
	}

	public void generate() {
		/*
		 * 
		 * GENERATION
		 * 
		 */

		this.generated = true;

	}

	public boolean isGenerated() {
		return generated;
	}

}
