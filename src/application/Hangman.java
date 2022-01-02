package application;

public class Hangman {

	public void run() {
		generateWord();
		displayWord();
		getPlayerGuess();
		checkGuess();
	}
	
	private void generateWord() {
		RandomWord word = new RandomWord();
		word.selectWord();
	}
	
	private void displayWord() {
		System.out.println("display the word");
	}
	
	private void getPlayerGuess() {
		System.out.println("Enter your guess");
	}
	
	private void checkGuess() {
		System.out.println("check guess");
	}
	public void close() {
		//end the game
	}
}
