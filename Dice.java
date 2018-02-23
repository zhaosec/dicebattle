

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.sun.org.apache.bcel.internal.Constants;
import com.sun.prism.Graphics;

import javafx.animation.Animation;

public class Dice extends Thread{
	private Thread t;
	private BufferedImage die1;
	private BufferedImage die2;
	private BufferedImage die3;
	private BufferedImage die4;
	private BufferedImage die5;
	private BufferedImage die6;
    int DiceNumber;
    JLabel dieLabel=new JLabel();
	   public int result() {
	        Random random = new Random(); 
	        DiceNumber = random.nextInt(6) + 1; 
	        return DiceNumber;
	    }
	   public void dicesize() {
		   dieLabel.setBounds(60, 265, 20, 20);
	   }
	   public void intialNum() {
		   dieLabel.setIcon(new ImageIcon("die1.png"));
	   }
	   public int checkDiceNum() {
		   return this.result();
	   }
	    public void Roll  (){
	    dieLabel.setIcon(new ImageIcon("die" + DiceNumber + ".png"));
	    
	    }
	   
	   
}
	   
