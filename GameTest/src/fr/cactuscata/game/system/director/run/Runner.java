package fr.cactuscata.game.system.director.run;

import fr.cactuscata.game.entity.list.Player;
import fr.cactuscata.game.utils.registers.Registerer;
import fr.cactuscata.game.utils.registers.say.Asker;
import fr.cactuscata.game.world.World;
import fr.cactuscata.game.world.WorldType;
import fr.cactuscata.game.world.location.Location;

public class Runner {

	private final Running running;

	public Runner(Running running) {
		this.running = running;
	}

	public void run() {

		init();

		while (this.running.isRunning()) {

		}

	}

	private void init() {

		Registerer<String, World> worldRegisterer = new Registerer<>();

		worldRegisterer.register("World: world", new World("world", WorldType.NORMAL));

		Registerer<String, Player> playerRegisterer = new Registerer<>();
		Player player = new Player(Asker.sendStringQuestion("Quel est votre pseudo ?"),
				new Location(worldRegisterer.getalues().get(0), (short) 50, (short) 50, 0.0f));

		playerRegisterer.register(player.getName(), player);

	}

}
