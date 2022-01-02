package application;

import java.util.Random;

public class RandomWord {
	
	String[] words = {"someone", "enough", "completely", "honestly", "pretending", "matter", "around", "paradise", "balloons", "together", "direction"};
	String chosenWord;
	Random random = new Random();
	
	public void selectWord() {
		int selection = random.nextInt(words.length);
	}
}
