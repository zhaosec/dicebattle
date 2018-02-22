package dice;

import java.awt.Dimension;
import java.awt.Font;//changing font
import java.awt.Graphics;//automatically apply paint()  
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;//get monitor's size 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;  
import java.awt.event.MouseListener;  
import java.awt.image.BufferedImage;//import pic for background
import java.io.File;  
import java.io.IOException;  
  
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;  


public class UI extends JFrame implements MouseListener{
	int width = Toolkit.getDefaultToolkit().getScreenSize().width;//wide
    int height = Toolkit.getDefaultToolkit().getScreenSize().height;//length
    Image img;
    //Dice dice = new Dice();    //havent complete
	File file = new File("C:\\Users\\zhao2\\eclipse-workspace\\Dicebattle\\thumb-350-370987.png");
    BufferedImage image = ImageIO.read(file);
    JLabel label = new JLabel(new ImageIcon(image));
    JButton roll = new JButton("Roll");
    JTextField diceresult= new JTextField();
    public UI() throws IOException { 
    	
        
          this.setLayout(new GridLayout(3, 3));
    	  this.setTitle("Dice Battle");  
          this.setSize(500,500);//setting the UI size
          this.setLocation((width-500)/2,(height-500)/2);// setting the panel go center  
          this.setResizable(true);// set UI size cannot be changed
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// close the code when click close
          this.getContentPane().add(diceresult);
          this.getContentPane().add(label);
          this.addMouseListener(this);  
          this.setVisible(true); 
          roll.setPreferredSize( new Dimension( 100, 25));
          roll.addActionListener(new ActionListener() {

       	   @Override
       	   public void actionPerformed(ActionEvent e) {
       		//diceresult.setText(String.valueOf(dice.roll()));
       	   }
       	});
         
         
      }  
      
    public void paint()//
    {  
    	//BackGround bg= new BackGround();
    }  
    
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}