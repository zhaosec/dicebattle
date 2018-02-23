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
 
public class MakeAccount extends Frame {
 
    public void MakeAccount() {
 
        setTitle("Signing Up"); 
        setLocation(0, 100); 
        setLayout(null);
        setSize(400, 400); 
        
        
        setResizable(false); 
        
     
        Label Unamelabel = new Label("Username : ");
        Label Passwordlabel = new Label("Password : ");
        Label Passcfmlabel = new Label("Pass.Confirmation : ");
        Label Emaillabel = new Label("Email : ");
        
        Unamelabel.setSize(120,30);
        Passwordlabel.setSize(120,30);
        Passcfmlabel.setSize(120,30);
        Emaillabel.setSize(120,30);
        Unamelabel.setLocation(25, 40);
        Passwordlabel.setLocation(25, 100); 
        Passcfmlabel.setLocation(25, 160);
        Emaillabel.setLocation(25, 220);

        
        
        final TextField userText = new TextField(20);
        final TextField passwordText = new TextField(20);
        passwordText.setEchoChar('*');
        final TextField passcfmText = new TextField(20);
        passcfmText.setEchoChar('*');
        final TextField emailText = new TextField(30);
        
        userText.setSize(120, 30);
        passwordText.setSize(120, 30);
        passcfmText.setSize(120, 30);
        emailText.setSize(120, 30);
        userText.setLocation(200, 40);
        passwordText.setLocation(200, 100);
        passcfmText.setLocation(200, 160);
        emailText.setLocation(200, 220);
 
       
        
        this.add(Unamelabel);       
        this.add(userText);
        this.add(Passwordlabel);
        this.add(passwordText);        
        this.add(Passcfmlabel);
        this.add(passcfmText);        
        this.add(Emaillabel);
        this.add(emailText);        
        
        

       
        //userText.setLocation(100, );
        
        
        Button btn1 = new Button(" Up");
        Button btn2 = new Button("Back");
        btn1.setSize(40,30);
        btn2.setSize(40,30);
        btn1.setLocation(250, 300);
        btn2.setLocation(150, 300);
        
        add(btn2);
        add(btn1);
        
		btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            String pass1 = passwordText.getText();
            String pass2 = passcfmText.getText();         	
              if(pass1.equals(pass2))
              {
            	  //write into database
            	  String filename = userText.getText()+".txt";
            	  //confirmation page
            	  final Frame cfs = new Frame("Confirmed");
            	  cfs.setSize(300,300);
            	  cfs.setLocation(0, 100);
            	  cfs.setLayout(null);
            	  Label clb = new Label("Signing up completely");
            	  clb.setSize(200,200);
            	  clb.setLocation(50,50);
            	  cfs.add(clb);
            	  cfs.setVisible(true);
            	  
                  // BufferedWriter 와 FileWriter를 조합하여 사용 (속도 향상)
                 try {
                	 BufferedWriter fw = new BufferedWriter(new FileWriter(filename, true));
                 
                  String txt = userText.getText()+"\n"+passwordText.getText(); 
                  // 파일안에 문자열 쓰기
                  fw.write(txt);
                  fw.flush();
       
                  // 객체 닫기
                  fw.close();
                 }catch(Exception savee) {
                	 savee.printStackTrace();
                 }
            	  cfs.addWindowListener(new WindowAdapter(){
                      public void windowClosing(WindowEvent e) { 
                              cfs.dispose();
                      }
          		});	
            	  
              }
              else {
            	  final Frame ffs = new Frame("Failed");
            	  ffs.setSize(300,300);
            	  ffs.setLocation(0, 100);
            	  ffs.setLayout(null);

            	  Label flb = new Label("Signing up Failed");

            	  flb.setSize(200,200);
            	  flb.setLocation(50,50);
            	  ffs.add(flb);
            	  ffs.setVisible(true);
            	  ffs.addWindowListener(new WindowAdapter(){
                      public void windowClosing(WindowEvent e) { 
                              ffs.dispose();
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
		
        setVisible(true);
        
    }

}