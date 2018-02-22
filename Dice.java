package dice;

import java.util.Random;

public class Dice {
	   int numberShowing;
	    public int roll() {
	        Random random = new Random();
	        numberShowing = random.nextInt(6) + 1; 
	        return numberShowing;
	        
	    }
}
	   
