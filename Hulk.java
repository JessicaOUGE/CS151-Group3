import java.util.ArrayList;

import javax.swing.*;

/** 
 the role Hulk 
 */
public class Hulk extends AbstractRole{

	/**
	 * Construct a Hulk Class
	 */
	public Hulk()
	{
		System.out.println("here is Hulk");
		roleName = "Hulk";
		description =new String("Hulk goes on a rampage which causes one of two events to occur:"
				+ "you get 2 free letters because you beat up the person real bad or "
				+ "you lose 2 chances because you were too busy being crazy. High risk high reward.");
		image = new ImageIcon("src/Hulk.jpg");
	}
	@Override
	public void getSkill(Hangman game) 
	{
		ArrayList <Character> rightLetterSet = game.getAvailableRightLetters(); //get the right letters set from Hangman
		if(rightLetterSet.size()>=2 && skillChances >0 && game.getGameChances()>=2)
		{
			game.addRightLetters(rightLetterSet.get(0));
			game.addRightLetters(rightLetterSet.get(1));
			game.subGameChances(2);
			useOfSkill = true;
			setSkillChances(0);
		}
	}

}
