package view;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controller.managercontroller;
import model.control;
import model.loginmodel;
import model.test;

public class loginpage implements ActionListener{

	JFrame frame;
	JLabel hotelLabel,signLabel,userLabel,passwordLabel,sig;
	JTextField inputUser; 
	JPasswordField inputpassword;
	JButton btn,bt,b;
	
	public loginpage() {		
		frame = new JFrame("Luton Hotel");
		frame.setResizable(false);//Disable the resize button
		
		Image icon = Toolkit.getDefaultToolkit().getImage("..\\java_project/src/img/logos.jpg");    
   	    frame.setIconImage(icon);
		
		hotelLabel = new JLabel("Login Page");
		hotelLabel.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(hotelLabel);
		hotelLabel.setBounds(100,30,200,30);
		//Location and dimensions of JFrame
		//first two are location and rest two dimension from setBounds
		
		ImageIcon aa=new ImageIcon("..\\java_project/src/img/logos.jpg");
		JLabel label = new JLabel(aa);
		label.setBounds(10,10,50,50);
		frame.add(label);
       		
		ImageIcon a=new ImageIcon("..\\java_project/src/img/hotel.jpg");
		JLabel label1 = new JLabel(a);
		label1.setBounds(300,10,400,500);
		frame.add(label1);
		
		
		userLabel = new JLabel("Username:");
		frame.add(userLabel);
		userLabel.setBounds(30,150,100,30);
		
		passwordLabel= new JLabel("Password:");
		frame.add(passwordLabel);
		passwordLabel.setBounds(30,210,100,30);
		
		inputUser= new JTextField();
		inputUser.setBounds(130, 150, 100, 30);
		frame.add(inputUser);
		inputpassword= new JPasswordField();
		inputpassword.setBounds(130, 210, 100, 30);
		frame.add(inputpassword);
		
		btn = new JButton("Submit");
		btn.addActionListener(this);
		btn.setBounds(30,300,90,30);
		frame.add(btn);
		
		bt=new JButton("Cancel");
		bt.setBounds(130, 300, 90, 30);
		bt.addActionListener(this);
		frame.add(bt);
		
		sig =new JLabel("Don't have an account:");
		frame.add(sig);
		sig.setBounds(30, 370, 200, 30);
		
		b=new JButton("Sign up");
		b.setBounds(90, 400, 90, 30);
		b.addActionListener(this);
		frame.add(b);
		
		
		
		//properties of JFrame
		frame.setSize(600,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	   	

		public static void main(String[]args) {
		new loginpage();
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b) {
	        new registrationpage();
	        frame.dispose();}
		if (e.getSource() == bt) {
			inputUser.setText("");
		    inputpassword.setText("");
		}
		if (e.getSource() == btn) {
					      
			
				       
			loginmodel s1 = new loginmodel();
			control con = new control();
			s1.setUsername(inputUser.getText());
			s1.setPassword(inputpassword.getText());
			con.setUser(s1);
			con.login();
			s1=con.getUser();
			managercontroller m2 = new managercontroller();
			  
			  boolean result1 = m2.save(s1);

	                 if (s1.getCustomerid() >=1 ) {
	    			test.customer_customer_id = s1.getCustomerid();
			       JOptionPane.showMessageDialog(frame,"login successfully");
			       
			        new customerpage();
			        frame.dispose();
	                 }
	                 else if (result1 == true) {
			        	JOptionPane.showMessageDialog(frame, "Welcome Mr.Manager");
			        	new managerpage();
			        	frame.dispose();
			        }
			        
			       
			       else {
			    	  
	    			   JOptionPane.showMessageDialog(frame,"Invalid username or password","Login Error",JOptionPane.ERROR_MESSAGE);	    		   
			       }
			}}
	
		}


		
	
