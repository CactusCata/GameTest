package fr.cactuscata.game.utils.exceptions;

public class IDNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public IDNotFoundException(int id, Class<?> clazz) {
		super("L'ID " + id + " n'a pas été trouvé pour la class " + clazz.getName() + ".");
	}

}
