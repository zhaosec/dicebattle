import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginGUI extends JFrame {
	JButton SignIn ,SignUp;
	
	public void LoginGUI(String u1, String u2)
	{
		
		Label welcome = new Label ("Welcome to be a DICER!!");
		welcome.setSize(220, 30);
		welcome.setLocation(130, 30);
		
		add(welcome);

		SignIn = new JButton("Sign In");
		
		SignIn.setSize(100,40);
		SignIn.setLocation(150, 100);
		SignUp = new JButton("Sign Up");
		SignUp.setSize(100,40);
		SignUp.setLocation(150, 200);

		SignUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              MakeAccount MA = new MakeAccount();
              MA.MakeAccount();
            }
        });

		SignIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              Signinpage sip = new Signinpage();
              sip.Signinpage(u1, u2);
            }
        });
		
		add(SignIn);
		add(SignUp);
		
		setLayout(null);	
		setSize(400,400);
		setLocation(100,100);
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		

}
