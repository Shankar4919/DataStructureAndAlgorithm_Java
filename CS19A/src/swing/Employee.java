package swing;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Employee {
	Login log = new Login();
}

class Login{
	
	Login(){
		
		JFrame f = new JFrame();
		JLabel lname, lcode, ldesignation, lsalary;
		JTextField tfname, tcode, tdesignation, tsalary;
		JPasswordField pfpsw;
		JButton btnSave, btnExit;
		
		luser = new JLabel("Username");
		f.add(luser);
		luser.setBounds(100, 50, 300, 50);
		
		tfuser = new JTextField("Username");
		f.add(tfuser);
		tfuser.setBounds(200, 65, 200, 20);
		
		lpsw = new JLabel("Password");
		f.add(lpsw);
		lpsw.setBounds(100, 100, 300, 50);
		
		pfpsw = new JPasswordField("Password");
		f.add(pfpsw);
		pfpsw.setBounds(200, 118, 200, 20);
		
		btnLogin = new JButton("Login");
		f.add(btnLogin);
		btnLogin.setBounds(200, 150, 200, 20);
		
		btnSignUp = new JButton("SignUp");
		f.add(btnSignUp);
		btnSignUp.setBounds(200, 180, 200, 20);
		
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(600, 600);
		f.setBackground(Color.black);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}

