package fr.cactuscata.game.inventory.item;

public class DamageValue {

	private byte damageValue;

	public DamageValue(byte damageValue) {
		this.setDamageValue(damageValue);
	}

	public byte getDamageValue() {
		return damageValue;
	}

	public void setDamageValue(byte damageValue) {
		this.damageValue = damageValue;
	}

	public void use() {
		this.damageValue--;
	}

}
