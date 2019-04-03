package fr.cactuscata.game.utils.registers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import fr.cactuscata.game.utils.registers.say.Namable;
import fr.cactuscata.game.utils.registers.say.SayType;
import fr.cactuscata.game.utils.registers.say.Sayer;

public class Registerer<K, V extends Namable> {

	private final boolean sendMessageWhenRegister;
	private final List<V> registereds = new ArrayList<V>();
	private static final Map<Object, Object> container = new HashMap<>();

	public Registerer(boolean sendMessageWhenRegister) {
		this.sendMessageWhenRegister = sendMessageWhenRegister;
	}

	public Registerer() {
		this(true);
	}

	public void register(K key, V regsitered) {
		this.registereds.add(regsitered);
		container.put(key, regsitered);
		if (this.sendMessageWhenRegister)
			Sayer.say(SayType.CONSOLE, "Added: " + regsitered.getName());

	}

	public void unregister(V registered) {
		this.registereds.remove(registered);
		container.remove(registered);
		if (sendMessageWhenRegister)
			Sayer.say(SayType.CONSOLE, "Removed: " + registered.getName());
	}

	public List<V> getalues() {
		return this.registereds;
	}

}
