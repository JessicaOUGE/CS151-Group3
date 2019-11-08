import javax.swing.*;


/**
  the role Doctor Strange
 */
public class DrStrange extends AbstractRole{

	/**
	 * Construct a DrStrange Class
	 */
	public DrStrange()
	{
		System.out.println("here is Dr.Strange");
		roleName = "doctor strange";
		
		description =new String("time travel: every time when the player "
				+ "has one chance left and only need to guess one more letter to win,"
				+ " the player can choose to restart a new game. ");
		image = new ImageIcon("Dr_Strange.jpg");
	}
	
	/**
	 * using skill
	 * @param conditon = how many letters to go
	 * 
	 * when user click on "skill" button, it will show a dialog with description and a box ask
	 * if you want to continue. As long as user click on "yes" button, the actionListner will call the 
	 * event of getSkill. If the skill work (useOfSkill become true), then the skill will effect base on different roles
	 * if the skill work, the Player class should help reset the game chances
	 */
	public void getSkill(int condition, Hangman game) {
		if(skillChances > 0 && condition == 1)
		{
			setSkillChances(1);
			useOfSkill = true;
			game.restart();
		}
	}
}



