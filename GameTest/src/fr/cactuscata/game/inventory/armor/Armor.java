package fr.cactuscata.game.inventory.armor;

import fr.cactuscata.game.inventory.item.Item;

public class Armor {

	private final Item[] armor;

	public Armor(Item[] armor) {
		if (armor.length != 4)
			throw new IllegalArgumentException("La taille du tableau doit être de 4.");
		this.armor = armor;
	}

	public Armor() {
		this.armor = new Item[4];
	}

	public void setHelmet(Item item) {
		this.armor[ArmorSlot.HELMET.slot] = item;
	}

	public void setChestplate(Item item) {
		this.armor[ArmorSlot.CHESTPLATE.slot] = item;
	}

	public void setLeggings(Item item) {
		this.armor[ArmorSlot.LEGGINGS.slot] = item;
	}

	public void setBoots(Item item) {
		this.armor[ArmorSlot.BOOTS.slot] = item;
	}

	public Item getHelmet() {
		return this.armor[ArmorSlot.HELMET.slot];
	}
	
	public Item getChestplate() {
		return this.armor[ArmorSlot.CHESTPLATE.slot];
	}
	
	public Item getLeggings() {
		return this.armor[ArmorSlot.LEGGINGS.slot];
	}
	
	public Item getBoots() {
		return this.armor[ArmorSlot.BOOTS.slot];
	}

	private enum ArmorSlot {

		HELMET((byte) 0),
		CHESTPLATE((byte) 1),
		LEGGINGS((byte) 2),
		BOOTS((byte) 3);

		private final byte slot;

		private ArmorSlot(byte slot) {
			this.slot = slot;
		}

	}

}
