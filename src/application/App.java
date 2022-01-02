package application;

public class App {

	public static void main(String[] args) {
		/* Display the blank word and number of tries remaining
		 * Prompt the user for their input
		 * Check the user's input
		 * Either prompt again, user wins or user loses
		 */
		
		boolean runningGame = true;
		
		Hangman game = new Hangman();
		game.run();
		
		if(runningGame == false) {
			game.close();
		}
	}

}
