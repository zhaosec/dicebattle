package dice;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.sun.prism.Graphics;

public class Dice {
	private BufferedImage die1;
	private BufferedImage die2;
	private BufferedImage die3;
	private BufferedImage die4;
	private BufferedImage die5;
	private BufferedImage die6;
	   int DiceNumber;
	    public int roll() {
	        Random random = new Random(); 
	        DiceNumber = random.nextInt(6) + 1; 
	        return DiceNumber;
	    }
	    public void DiceRoll(JLabel dieLabel){
	    dieLabel.setIcon(new ImageIcon("die" + DiceNumber + ".png"));
	    }
}
	   
