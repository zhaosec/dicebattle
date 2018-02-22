import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.*;
import java.io.*;
 
public class Signinpage extends Frame {
 
	String username1 = "";
	String username2 = "";
	
    public void Signinpage(String u1, String u2) {
    	
    
        setTitle("Signing In");
        setLocation(0, 100); 
        setLayout(null);
        setSize(400, 400); 
        
        
        setResizable(false); 
       
     
        Label Firstnamelabel = new Label("First Username : ");
        Label Firstpasslabel = new Label("First Password : ");
        Label Secnamelabel = new Label("Sec Username : ");
        Label Secpasslabel = new Label("Sec Password : ");
        
        Firstnamelabel.setSize(120,30);
        Firstpasslabel.setSize(120,30);
        Secnamelabel.setSize(120,30);
        Secpasslabel.setSize(120,30);
        Firstnamelabel.setLocation(25, 40);
        Firstpasslabel.setLocation(25, 100); 
        Secnamelabel.setLocation(25, 160);
        Secpasslabel.setLocation(25, 220);

        
        
        final TextField FuserText = new TextField(20);
        final TextField FpassText = new TextField(20);
        FpassText.setEchoChar('*');
        final TextField SuserText = new TextField(20);
        final TextField SpassText = new TextField(30);
        SpassText.setEchoChar('*');
        
        FuserText.setSize(120, 30);
        FpassText.setSize(120, 30);
        SuserText.setSize(120, 30);
        SpassText.setSize(120, 30);
        FuserText.setLocation(200, 40);
        FpassText.setLocation(200, 100);
        SuserText.setLocation(200, 160);
        SpassText.setLocation(200, 220);
 
       
        
        this.add(Firstnamelabel);       
        this.add(FuserText);
        this.add(Firstpasslabel);
        this.add(FpassText);        
        this.add(Secnamelabel);
        this.add(SuserText);        
        this.add(Secpasslabel);
        this.add(SpassText);        
        
      
        Button btn1 = new Button("Enter");
        Button btn2 = new Button("Back");
        btn1.setSize(40,30);
        btn2.setSize(40,30);
        btn1.setLocation(250, 300);
        btn2.setLocation(150, 300);
        
        add(btn2);
        add(btn1);
        
		btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            //	u1 = FuserText.getText();
            //	u2 = FuserText.getText();
            }
            
        });
		
		btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             dispose();
            }
        });		

        
		this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) { 
                    dispose();
            }
		});	
		
    	u1 = FuserText.getText();
    	u2 = FuserText.getText();
    	
        setVisible(true);
        
    }

}