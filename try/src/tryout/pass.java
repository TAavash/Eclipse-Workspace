package tryout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import c.controller;
import m.model;

public class pass implements ActionListener{

	JFrame frame;
	JLabel signLabel,userLabel,passwordLabel,passwordLabel1,sig;
	JTextField inputUser; 
	JPasswordField inputpassword,inputpassword1;
	JButton btn,bt,b;
	
	public pass() {		
		frame = new JFrame("Luton Hotel");
		frame.setResizable(false);
		
		signLabel = new JLabel("New Account");
		signLabel.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(signLabel);
		signLabel.setBounds(80,30,200,30);
		
		userLabel = new JLabel("Username:");
		frame.add(userLabel);
		userLabel.setBounds(30,150,100,30);
		
		passwordLabel= new JLabel("New Password:");
		frame.add(passwordLabel);
		passwordLabel.setBounds(30,210,150,30);
		
		passwordLabel1= new JLabel("Confirm Password:");
		frame.add(passwordLabel1);
		passwordLabel1.setBounds(30,240,150,30);
		
		inputUser= new JTextField();
		inputUser.setBounds(200, 150, 100, 30);
		frame.add(inputUser);
		inputpassword= new JPasswordField();
		inputpassword.setBounds(200, 210, 100, 30);
		frame.add(inputpassword);
		inputpassword1= new JPasswordField();
		inputpassword1.setBounds(200, 240, 100, 30);
		frame.add(inputpassword1);
		
		btn = new JButton("Submit");
		btn.addActionListener(this);
		btn.setBounds(30,330,90,30);
		frame.add(btn);
		
		bt=new JButton("Cancel");
		bt.setBounds(130, 330, 90, 30);
		frame.add(bt);
		
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setSize(400,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btn) {
			       String Username = inputUser.getText();
			       String NewPassword = inputpassword.getText();
			       String ConfirmPassword = inputpassword1.getText();
			       
			       model s1 = new model(Username,NewPassword,ConfirmPassword);
			       controller account = new controller() ;
			       boolean result = account.save(s1);
			     if (result == true) {
			       JOptionPane.showMessageDialog(frame,"Save record successful");
			       inputUser.setText("");
			       inputpassword.setText("");
			       inputpassword1.setText("");
//			       new loginpage();
//			        frame.dispose();
			       }
			       else {
			        JOptionPane.showMessageDialog(frame, "error to save record");
			       }
			}   
			
		}
		
	public static void main(String[] args) {
			// TODO Auto-generated method stub
				new pass();
}
		}

		
	
