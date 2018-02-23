import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;
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
            	String fid = "";
            	String fpw = "";
            	String sid = "";
            	String spw = "";
            	
            	String fname1 = FuserText.getText()+".txt";
            	String fname2 = SuserText.getText()+".txt";
            	System.out.println(fname1);
            try {
            	      
            	      BufferedReader in = new BufferedReader(new FileReader(fname1));
            	      fid = in.readLine();
            	      fpw = in.readLine();
 
            	      in.close();	
            }catch(Exception wre) {
           	 wre.printStackTrace();
            }
            
          
            try {
      	      
      	      BufferedReader in = new BufferedReader(new FileReader(fname2));
      	      sid = in.readLine();
      	      spw = in.readLine();

      	      in.close();	
      }catch(Exception wre) {
     	 wre.printStackTrace();
      }       
            if(!(FpassText.getText().equals(fpw)))
            {
            	final Frame ffs = new Frame("Failed");
          	  ffs.setSize(300,300);
          	  ffs.setLocation(0, 100);
          	  ffs.setLayout(null);

          	  Label flb = new Label("1st User Login Failed");

          	  flb.setSize(200,200);
          	  flb.setLocation(50,50);
          	  ffs.add(flb);
          	  ffs.setVisible(true);
          	  ffs.addWindowListener(new WindowAdapter(){
                    public void windowClosing(WindowEvent e) { 
                            ffs.dispose();
                    }
        		});	
            	dispose();
            	
            } else if(!(SpassText.getText().equals(spw)))
            {
            	final Frame ffs2 = new Frame("Failed");
          	  ffs2.setSize(300,300);
          	  ffs2.setLocation(0, 100);
          	  ffs2.setLayout(null);

          	  Label flb = new Label("2nd User Login Failed");

          	  flb.setSize(200,200);
          	  flb.setLocation(50,50);
          	  ffs2.add(flb);
          	  ffs2.setVisible(true);
          	  ffs2.addWindowListener(new WindowAdapter(){
                    public void windowClosing(WindowEvent e) { 
                            ffs2.dispose();
                    }
        		});	
            	dispose();
            	
            }
            else {
            	final Frame ffs2 = new Frame("Login Success");
          	  ffs2.setSize(300,300);
          	  ffs2.setLocation(0, 100);
          	  ffs2.setLayout(null);

          	  Label flb = new Label("Login Successfully");

          	  flb.setSize(100,100);
          	  flb.setLocation(70,50);
          	  ffs2.add(flb);
          	  
             Button play1 = new Button("PLAY");
              play1.setSize(40,30);
              play1.setLocation(250, 200);
              
              ffs2.add(play1);
          	  
              play1.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                	try {
						UI dui = new UI();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                  }
                  });   
          	  
          	  ffs2.setVisible(true);
          	  
          	  
          	  ffs2.addWindowListener(new WindowAdapter(){
                    public void windowClosing(WindowEvent e) { 
                            ffs2.dispose();
                    }
        		});		
            }
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