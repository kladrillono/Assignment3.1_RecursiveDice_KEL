import java.util.Random;
/**
 * This class implements a Die with a roll method.
 * @author Kendall E. Ladrillono
 *
 */
public class RecDieRoller {
	
	int n;
	
	/**Constructor for RecDieRoller. */
	public RecDieRoller() {
		
		n = 0;
		
	}//end empty-argument constructor
	
	/**This method simulates random rolling of a die with the goal of rolling a 2.
	  *@param n
	  *@return The random number of rolls until a 2 is rolled. 
	  */
	public int roll(int n) {
		
		Random rand = new Random();
		n = rand.nextInt(6);
		n = n + 1;
		
		if (n != 2) {
			System.out.println("You didn't roll a 2, you rolled a: "+n);
			roll(n);
		}
		else if	(n == 2){
			System.out.println("You rolled a: "+n+". GREAT JOB!");
		}
		return n;
	}// end roll
	
}// end class
