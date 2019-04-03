package fr.cactuscata.game.utils.registers.say;

import javax.swing.JOptionPane;

public class Sayer {

	public static void say(SayType sayType, String message) {

		switch (sayType) {
		case CONSOLE:
			System.out.println(message);
			break;

		case MESSAGE_BOX:
			JOptionPane.showMessageDialog(null, message);
			break;

		default:
			break;
		}

	}

	public static final void sendBoxMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	public static int sendIntQuestion(String message) {
		return Integer.parseInt(JOptionPane.showInputDialog(message));
	}

	public static String sendStringQuestion(String message) {
		return JOptionPane.showInputDialog(message);
	}

}
