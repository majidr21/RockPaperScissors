package Package;
import java.util.Random;
import javax.swing.JOptionPane;

public class RockPaperScissors {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Autio-generated method stub
int computerChoice = cpuChoice();
int userChoice = userChoice() ;
JOptionPane.showMessageDialog(null, "The Computer chose " + computerChoice);
winner(computerChoice,userChoice);
	
	
	
	}
	
	public static int cpuChoice () {
		Random r = new Random();
		int choice = r.nextInt(3) + 1;
		return choice;
	}
	
	public static int userChoice() {
		String input;
		input = JOptionPane.showInputDialog("Enter 1 for rock, 2 for scissors, or 3 for paper");
		int choice2 = Integer.parseInt(input);
		return choice2;
	}
public static void winner(int val1, int val2) {
	
		if (val1 == 1 && val2 == 2)
			JOptionPane.showMessageDialog(null, "You lost! Rocks smash scissors!");
		if (val1 == 2 && val2 == 1)
			JOptionPane.showMessageDialog(null, "You won! Rocks smash scissors!");
		if (val1 == 1 && val2 == 3)
			JOptionPane.showMessageDialog(null, "You won! Paper covers rock!");
		if (val1 == 3 && val2 == 1)
			
			JOptionPane.showMessageDialog(null, "PC won! Paper covers rock!!");
		if (val1 == 3 && val2 == 2)
			JOptionPane.showMessageDialog(null, "You won! Scissors cuts paper!");
		if (val1 == 2 && val2 == 3)
			JOptionPane.showMessageDialog(null, "PC won! Scissors cuts paper!");
		if (val1 == val2)
			JOptionPane.showMessageDialog(null, "It's a TIE!! GO AGAIN!");
}



}
