package fr.cactuscata.game.world.block;

public class Block {

	private final BlockType blockType;

	public Block(BlockType blockType) {
		this.blockType = blockType;
	}

	public BlockType getBlockType() {
		return blockType;
	}

}
