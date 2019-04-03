package fr.cactuscata.game.inventory;

import fr.cactuscata.game.entity.Entity;
import fr.cactuscata.game.inventory.armor.Armor;
import fr.cactuscata.game.inventory.item.Item;

public class Inventory {

	private final Item[] items;
	private final Armor armor;
	private final Entity owner;

	public Inventory(Entity owner, Item[] items, Armor armor) {
		this.owner = owner;
		this.items = items;
		this.armor = armor;
	}

	public Inventory(Inventory inventory) {
		this(inventory.getOwner(), inventory.getContents(), inventory.getArmor());
	}

	public Inventory(Entity owner, Armor armor) {
		this(owner, new Item[30], (armor == null ? new Armor() : armor));
	}

	public Inventory(Entity owner) {
		this(owner, null);
	}

	public Item[] getContents() {
		return this.items;
	}

	public Entity getOwner() {
		return this.owner;
	}

	public Armor getArmor() {
		return this.armor;
	}

	public void setItem(Item item, int slot) {
		this.items[slot] = item;
	}

	public void removeItem(int slot) {
		setItem(null, slot);
	}

}
