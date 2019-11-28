import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   Presents a main window GUI for the Hangman game.
*/
public class thirdWindow {
	/**
	 * Constructs a main window show up the chance number
	 * skill...
	 */
	public thirdWindow(){
		ImageIcon background = new ImageIcon("background3.jpg");
		background.setImage(background.getImage().getScaledInstance(860, 560, Image.SCALE_DEFAULT));
		JLabel backgroundL = new JLabel(background, JLabel.CENTER);
		JFrame frame = new JFrame();
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BorderLayout());
		mainPanel.add(backgroundL, BorderLayout.CENTER);
		
		JPanel title = new JPanel();
		title.add(new JLabel("Hangman"), BorderLayout.NORTH);
		title.add(new JLabel("Description"), BorderLayout.CENTER);
		descriptionField = new JTextArea(2,50);
		title.add(descriptionField, BorderLayout.SOUTH);
		
		JPanel chance = new JPanel();
		chance.add(new JLabel("Total Chance: "), BorderLayout.NORTH);
		chanceField = new JTextArea(2, 4);
		chance.add(chanceField, BorderLayout.CENTER);
		
		JPanel skill = new JPanel();
		skill.add(new JLabel("Skill: "), BorderLayout.WEST);
		skillField = new JTextArea(2, 4);
		skill.add(skillField, BorderLayout.SOUTH);
		
		JPanel enter = new JPanel();
		enterField = new JTextArea(4, 50);
		enter.add(enterField, BorderLayout.SOUTH);
		
		frame.add(title, BorderLayout.NORTH);
		frame.add(chance, BorderLayout.WEST);
		frame.add(mainPanel, BorderLayout.CENTER);
		frame.add(enter, BorderLayout.SOUTH);
		frame.add(skill, BorderLayout.EAST);
		frame.pack();
		frame.setSize(1500,800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	private JTextArea chanceField;
	private JTextArea skillField;
	private JTextArea enterField;
	private JTextArea descriptionField;
	
	public static void main(String[] arg) {
		new thirdWindow();
	}

}
