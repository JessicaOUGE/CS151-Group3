import java.io.IOException;
//import java.util.Scanner;

public class testHangman {

	public static void main(String[] args) throws IOException {
		Role aRole = new KingOfGame();
		Hangman game = new Hangman();
		System.out.println("word: " + game.getGuessingWord());
		//String word = game.getGuessingWord();
		//get word from dictionary
		//set up dictionary
		
		game.addRightLetters('n');
		game.addRightLetters('l');
		game.addRightLetters('n');
		
		//Scanner cin = new Scanner(System.in);
		//set up giant input loop
		//while(all letters guessed or all chances used)
		//ask player for letter
		//if loops for correct and incorrect
		//set up win and lose conditions
		game.addWrongLetters('a');
		game.addWrongLetters('b');
		game.addWrongLetters('z');
		game.addWrongLetters('a');
		
		game.addWrongLetters('c');
		game.addWrongLetters('d');
		game.addWrongLetters('e');
		game.addWrongLetters('f');
		game.addWrongLetters('g');
		game.addWrongLetters('h');
		game.addWrongLetters('i');
		game.addWrongLetters('j');
		game.addWrongLetters('k');
		game.addWrongLetters('l');
		game.addWrongLetters('m');
		game.addWrongLetters('n');
		game.addWrongLetters('o');
		game.addWrongLetters('p');
		game.addWrongLetters('q');
		game.addWrongLetters('x');
		game.addWrongLetters('y');
		aRole.getSkill(0, game);
	}

}
