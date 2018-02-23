
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;//改字体  
import java.awt.Graphics;//自动调用里面的paint()方法，需要重写  
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;//获取电脑屏幕的长和宽  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;  
import java.awt.event.MouseListener;  
import java.awt.image.BufferedImage;//导入图片作为背景(流)  
import java.io.File;  
import java.io.IOException;  
  
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;  
public class UI extends JFrame implements MouseListener{
	int width = Toolkit.getDefaultToolkit().getScreenSize().width;//屏幕的宽  
    int height = Toolkit.getDefaultToolkit().getScreenSize().height;//屏幕的长  
    Image img;
    Dice dice = new Dice();
	File file = new File("C:\\Users\\Jaimeen Ahn\\Downloads\\dicebattle-developer\\dicebattle-developer\\a4463cb4697364ede413369bd7f9f50d.jpg");
    BufferedImage image = ImageIO.read(file);
    JLabel label = new JLabel(new ImageIcon(image));
    JButton roll = new JButton("Roll");
    public UI() throws IOException { 
    	  this.setTitle("Dice Battle");  
    	  this.setSize(1000,1000);
    	  this.setLocation((width-1000)/2,(height-1000)/2);  
          this.setLayout(new BorderLayout(3, 3));
          this.setResizable(true);
          JButton roll1 =new JButton("Roll it");
          JButton roll2 =new JButton("Roll it");
          JButton On = new JButton("ON");
         		
          On.setBounds(800,10,70,50);
          this.add(On);
          On.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
               sound BGM = new sound();
               BGM.sound();
              }
          }); 
          
          
          
          roll1.setBounds(450, 50, 100, 70);
          roll2.setBounds(450, 850, 100, 70);
          this.add(roll1);
          this.add(roll2);
          this.add(label,BorderLayout.CENTER);
         
          ImageIcon icon = new ImageIcon("C:\\Users\\Jaimeen Ahn\\Downloads\\dicebattle-developer\\dicebattle-developer\\dice.png");
          Image resizeIcon=icon.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
          
          JLabel dice1 = new JLabel(new ImageIcon(resizeIcon));
          JLabel dice2=new JLabel(new ImageIcon(resizeIcon));
          dice1.setBounds(300, 450, 100,100 );
          dice2.setBounds(550, 450, 100, 100);
          this.add(dice1);
           this.add(dice2);
        
          
   
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
          this.getContentPane().add(label);
          this.addMouseListener(this);  
          this.setVisible(true); 
         
         
         
      }  
      
    public void paint()//程序会自动调用此方法  
    {  
    	BackGround bg= new BackGround();
    }  
    
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
