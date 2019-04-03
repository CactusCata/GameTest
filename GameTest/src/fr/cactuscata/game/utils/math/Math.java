package fr.cactuscata.game.utils.math;

import java.util.Random;

public class Math {

	public static Number getRandomNumberBetweenTwoValues(int low, int hight) {
		return new Random().nextInt(hight - low) + low;
	}

}
