//import java.util.Random;
//
//import javax.swing.ImageIcon;
//
///**
//the role of King of Game
// */
//public class KingOfGameOld extends AbstractRole{
//
//	public KingOfGameOld()
//	{
//		System.out.println("here is King of Game");
//		roleName = "King of Game";
//		
//		description =new String("I will win the game: you always believe you will win the game."
//				+ " Your belief has touched the God of Game, "
//				+ "so God is going to give you two letters(one is right, another is wrong) to choose from.");
//						
//		image = new ImageIcon("King_of_Game.jpg");
//	}
//	
//	/**
//	 * using skill
//	 * @param conditon doesn't have condition for this role
//	 * 
//	 * when user click on "skill" button, it will show a dialog with description and a box ask
//	 * if you want to continue. As long as user click on "yes" button, the actionListner will call the 
//	 * event of getSkill. If the skill work (useOfSkill become true), then the skill will effect base on different roles
//	 * if the skill work, then system will show 2 choices of letters, one is true
//	 */
//	public void getSkill(int condition, Hangman game)
//	{
//		char choiceOfRightLetter='a';
//		char choiceOfWrongLetter='a';
//		int size1 = game.getGuessingWord().length(); //get the size of the guessing word that is assigned to you
//		int size2 = game.getRightLetters().size(); //get the size of the right letters you have already guessed
//		int size3 = game.getWrongLetters().size(); //get the size of the wrong letters you have already guessed
//		int randomNum1;
//		int randomNum2;
//		int i;
//		Random rand = new Random();
//		if(game.checkWin()==false && game.checkLose()==false)
//		{
//			try
//			{
//				boolean repeated = true;
//				while (repeated ==true)
//				{
//					randomNum1 = rand.nextInt(size1); // get a random number between 0 and size of the guessing word
//					choiceOfRightLetter = game.getGuessingWord().charAt(randomNum1); //try to find a letter in the guessing word as a correct case
//					System.out.println("right choose:"+choiceOfRightLetter);
//					repeated = false;
//					for(i=0; i<size2; i++) //check if the choice of right letter has been already guessed by you
//					{
//						if(choiceOfRightLetter == game.getRightLetters().get(i))
//						{
//							System.out.println(choiceOfRightLetter+" is repeating, generate another");
//							repeated = true;
//						}
//					}
//				}
//				String alphabets ="abcdefghijklmnopqrstuvwxyz"; 
//				repeated = true;	
//				while(repeated ==true)
//				{
//					randomNum2 = rand.nextInt(26); // get a random number between 0 and 26
//					choiceOfWrongLetter = alphabets.charAt(randomNum2); //try to find a letter from the alphabet table
//					System.out.println("wrong choose:"+choiceOfWrongLetter);
//					repeated = false;
//					for(i=0; i<size3; i++)  //check if the choice of wrong letter has been already guessed by you
//					{
//						if(choiceOfWrongLetter == game.getWrongLetters().get(i))
//						{
//							System.out.println(choiceOfWrongLetter+" is repeating, generate another");
//							repeated = true;
//						}
//					}
//					for(i=0; i<size1; i++)  //check if the choice of wrong letter has been already guessed by you
//					{
//						if(choiceOfWrongLetter == game.getGuessingWord().charAt(i))
//						{
//							System.out.println(choiceOfWrongLetter+" is repeating, generate another");
//							repeated = true;
//						}
//					}
//				}
//				System.out.println("The right letter for choice is: "+ choiceOfRightLetter+ '\n'+"The wrong letter for choice is: "+choiceOfWrongLetter);
//			}
//			catch(ArrayIndexOutOfBoundsException exception)
//			{
//				System.out.println("array index is out of bounds");
//			}
//		}
//		else {System.out.println("The game is end...you cannot use skill");}
//		
//	}
//
//}
