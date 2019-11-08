import javax.swing.*;

public interface Role {

	String getName();
	
	void getSkill(int condition, Hangman game);
	
	boolean checkIfSkillWork();
	
	String getDescription();
	
	void setSkillChances(int chances);
	
	int getSkillChances();
	
	Icon getImage();	
}
