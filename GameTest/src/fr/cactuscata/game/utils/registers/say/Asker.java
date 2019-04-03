package fr.cactuscata.game.utils.registers.say;

import javax.swing.JOptionPane;

public class Asker {

	public static Number sendQuestion(String message) {
		return Integer.parseInt(sendStringQuestion(message));
	}

	public static String sendStringQuestion(String message) {
		String answer;
		do {
			answer = JOptionPane.showInputDialog(message);
		} while (answer == null || answer.equals(""));
		return answer;
	}

}
