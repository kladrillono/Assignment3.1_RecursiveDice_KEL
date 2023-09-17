/**
 * This class simulates random rolls of a die.
 * @author Kendall E. Ladrillono
 *
 */
public class RecDieRollerDriver {

	public static void main(String[] args) {
		
		/**Instantiates a RecDieRoller object. */
		RecDieRoller die = new RecDieRoller();
		
		/**Test for roll method. The goal is to roll a two. */
		//die.roll();
		
		/**Test code for implementing roll() method 1000 times. 
		  *Records how many times a 2 is randomly rolled. */
		int number[] = new int[1000];
		int count2 = 0;
		int num = 0;
		
		for (int i=1; i<number.length; i++) {
			num = die.roll(num);
			if (num == 2) {
				
				count2++;
			}
			number[i] = num;
		}
		System.out.println("The die rolled a 2, "+count2+" times.");
		
		/**Test code for calculating the average number of rolls it takes to roll a 2. */
		int meanRolls = 1000/count2;
		System.out.println("It takes about "+meanRolls+" rolls to roll a 2.");
		
	}// end main

}// end class
