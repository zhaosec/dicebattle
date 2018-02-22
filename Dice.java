package dice;

import java.util.Random;

public class Dice {
	   int numberShowing;
	    public int roll() {
	        Random random = new Random(); /* <-- this is a constructor */
	        numberShowing = random.nextInt(6) + 1; /* <-- look at the API doc for nextInt() to see why we give it 6 as and argument, and why we need to add 1 to the result */
	        return numberShowing;
	        
	    }
}
	   
