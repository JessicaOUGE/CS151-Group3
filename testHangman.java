
import java.awt.*;
import java.io.IOException;
import javax.swing.*;

public class testHangman {

	public static void main(String[] args) throws IOException {
		Role aRole = new DrStrange();
		Hangman game = new Hangman();
		System.out.println("word: " + game.getGuessingWord());
		//String word = game.getGuessingWord();
		//get word from dictionary
		//set up dictionary
		
  //Scanner cin = new Scanner(System.in);
		//set up giant input loop
		//while(all letters guessed or all chances used)
		//ask player for letter
		//if loops for correct and incorrect
		//set up win and lose conditions
//		game.addRightLetters('n');
//		game.addRightLetters('l');
//		game.addRightLetters('n');
//		
//		game.addWrongLetters('a');
//		game.addWrongLetters('b');
//		game.addWrongLetters('z');
//		game.addWrongLetters('a');
//		
//		game.addWrongLetters('c');
//		game.addWrongLetters('d');
//		game.addWrongLetters('e');
//		game.addWrongLetters('f');
//		game.addWrongLetters('g');
//		game.addWrongLetters('h');
//		game.addWrongLetters('i');
//		game.addWrongLetters('j');
//		game.addWrongLetters('k');
//		game.addWrongLetters('l');
//		game.addWrongLetters('m');
//		game.addWrongLetters('n');
//		game.addWrongLetters('o');
//		game.addWrongLetters('p');
//		game.addWrongLetters('q');
//		game.addWrongLetters('x');
//		game.addWrongLetters('y');
//		aRole.getSkill(0, game);
		
		
		JFrame frame = new JFrame();
		frame.pack();
		frame.setSize(500,500);
		
		JPanel roleChoicePanel = new JPanel();
		roleChoicePanel.setLayout(new GridLayout(2,3));
		
		
		//JLabel pic = new JLabel(aRole.getImage());
		//JLabel pic = new JLabel(img);
		
		JButton b = new JButton(aRole.getImage());
		//b.setSize(100, 100);
		roleChoicePanel.add(b);
		
		JButton c = new JButton(aRole.getImage());
		c.setSize(100, 100);
		roleChoicePanel.add(c);
		
		JButton d = new JButton(aRole.getImage());
		d.setSize(100, 100);
		roleChoicePanel.add(d);
		
		
	
		frame.add(roleChoicePanel);
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
