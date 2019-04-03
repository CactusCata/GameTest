package fr.cactuscata.game.utils.exceptions;

public class NameNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NameNotFoundException(String name, Class<?> clazz) {
		super("Le nom " + name + " n'a pas �t� trouv� par la class " + clazz.getName() + ".");
	}

}
