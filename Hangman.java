import java.util.ArrayList;


public class Hangman {

	private String word;
	private ArrayList<Character> availableRightLetters = new ArrayList<Character>(20); //store the available right letters from the word
	private ArrayList<Character> availableWrongLetters = new ArrayList<Character>(26); //store the available wrong letters from alphabet beside the right letters
	private ArrayList<Character> rightLetters = new ArrayList<Character>(20); //store the right letters you guessed
	private ArrayList<Character> wrongLetters = new ArrayList<Character>(20); ////store the wrong letters you guessed
	private boolean win = false;
	private boolean lose = false;
	
	
	public Hangman()
	{
		word = new String("null");
		char ch;
		for(int i=0; i<word.length(); i++)
		{
			ch = word.charAt(i);
			if(!availableRightLetters.contains(ch))
			{
				availableRightLetters.add(ch);
			}
		}
		try
		{
			for(int i=0; i<26; i++)
			{
				availableWrongLetters.add((char) (97+i));
			}
			availableWrongLetters.removeAll(availableRightLetters);
		}
		catch(ClassCastException a)
		{
			System.out.println("cannot remove...");
		}
		catch(NullPointerException a)
		{
			System.out.println("Null Pointer....");
		}
		
		System.out.println("Available correct letters: ");
		for(int i=0; i<availableRightLetters.size(); i++)
		{
			System.out.print(availableRightLetters.get(i));
		}
		System.out.print('\n');
		
		System.out.println("Available wrong letters: ");
		for(int i=0; i<availableWrongLetters.size(); i++)
		{
			System.out.print(availableWrongLetters.get(i));
		}
		System.out.print('\n');
	}
	/**
	 * when Dr. Strange use skill, the game will restart. but for other roles, 
	 * it will start a new game (not restart) once you win or lose.
	 */
	void restart()
	{
		
	}
	/**
	 * get the word that you are guessing
	 * @return a string of the word
	 */
	String getGuessingWord()
	{
		return word;
	}
	/**
	 * every time, when you guess a right letter, it will be add to ArrayList of rightLetters
	 */
	void addRightLetters(char ch)
	{
		if(!rightLetters.contains(ch)) {rightLetters.add(ch);}//add the correct letter you just guessed
		System.out.println("The correct letter set: ");
		for(int i=0; i<rightLetters.size(); i++)
		{
			System.out.println(rightLetters.get(i));
		}
		
		for(int i=0; i<availableRightLetters.size(); i++) //remove the correct letter you just guessed from this set
		{
			if(availableRightLetters.get(i)==ch) {availableRightLetters.remove(i);}
		}
		
		System.out.println("The available correct letter set: ");
		for(int i=0; i<availableRightLetters.size(); i++)
		{
			System.out.print(availableRightLetters.get(i));
		}
		System.out.print('\n');
		
	}
	/**
	 * @return the available correct letters that you can guess...
	 */
	ArrayList<Character> getAvailableRightLetters()
	{
		return availableRightLetters;
	}
	/**
	 * @return the set of right letters you guess
	 */
	ArrayList<Character> getRightLetters()
	{
		return rightLetters;
	}
	/**
	 * every time, when you guess a wrong letter, it will be add to ArrayList of wrongLetters
	 */
	void addWrongLetters(char ch)
	{
		if(!wrongLetters.contains(ch)) {wrongLetters.add(ch); }//add the wrong letter you just guessed
		
		System.out.println("The wrong letter set: ");
		for(int i=0; i<wrongLetters.size(); i++) 
		{
			System.out.println(wrongLetters.get(i));
		}
		
		for(int i=0; i<availableWrongLetters.size(); i++) //remove the wrong letter you just guessed from this set
		{
			if(availableWrongLetters.get(i)==ch) {availableWrongLetters.remove(i);}
		}
		
		System.out.println("The available wrong letter set: ");
		for(int i=0; i<availableWrongLetters.size(); i++)
		{
			System.out.print(availableWrongLetters.get(i));
		}
		System.out.print('\n');
		
	}
	/**
	 * @return the available wrong letters that you can guess...
	 */
	ArrayList<Character> getAvailableWrongLetters()
	{
		return availableWrongLetters;
	}
	/**
	 * @return the set of wrong letters you guess
	 */
	ArrayList<Character> getWrongLetters()
	{
		return wrongLetters;
	}
	
	boolean checkWin()
	{
		return win;
	}
	boolean checkLose()
	{
		return lose;
	}
}
