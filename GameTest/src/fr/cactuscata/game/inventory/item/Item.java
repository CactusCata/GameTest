package fr.cactuscata.game.inventory.item;

public class Item {

	private final ItemType itemType;
	private final DamageValue damageValue;
	private final byte amount;

	public Item(ItemType itemType, byte amount, DamageValue damageValue) {
		this.itemType = itemType;
		this.amount = amount;
		this.damageValue = damageValue;
	}

	public Item(ItemType itemType) {
		this(itemType, (byte) 1, new DamageValue((byte) 0));
	}

	public Item(ItemType itemType, DamageValue damageValue) {
		this(itemType, (byte) 1, damageValue);
	}

	public Item(ItemType itemType, byte amount) {
		this(itemType, amount, new DamageValue((byte) 0));
	}

	public ItemType getItemType() {
		return itemType;
	}

	public DamageValue getDamageValue() {
		return damageValue;
	}

	public byte getAmount() {
		return amount;
	}

}
