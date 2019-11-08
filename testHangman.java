
public class testHangman {

	public static void main(String[] args) {
		Role aRole = new KingOfGame();
		Hangman game = new Hangman();
		
		game.addRightLetters('n');
		game.addRightLetters('l');
		game.addRightLetters('n');
		
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
