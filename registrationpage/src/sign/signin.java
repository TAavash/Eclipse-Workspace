 package sign;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;

import controller.controllers;
import model.models;
import registrationpage.reg;
public class signin implements ActionListener{

	JFrame frame;
	JLabel hotelLabel,signLabel,userLabel,passwordLabel,sig;
	JTextField inputUser; 
	JPasswordField inputpassword;
	JButton btn,bt,b;
	
	public signin() {		
		frame = new JFrame();	
		hotelLabel = new JLabel("Luton Hotel");
		frame.add(hotelLabel);
		hotelLabel.setBounds(100,30,100,30);
		
		signLabel = new JLabel("Login Page");
		frame.add(signLabel);
		signLabel.setBounds(100,50,100,30);
		
		ImageIcon aa=new ImageIcon("..\\registrationpage/src/sign/logos.jpg");
		JLabel label = new JLabel(aa);
		label.setBounds(10,10,50,50);
		frame.add(label);
        		
		ImageIcon a=new ImageIcon("..\\registrationpage/src/sign/hotel.jpg");
		JLabel label1 = new JLabel(a);
		label1.setBounds(300,10,400,500);
		frame.add(label1);
		
		
		userLabel = new JLabel("Username:");
		frame.add(userLabel);
		userLabel.setBounds(30,150,100,30);
		
		passwordLabel= new JLabel("Password:");
		frame.add(passwordLabel);
		//Location and dimensions of JFrame
		//first two are location and rest two dimension from setBounds
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
		frame.add(bt);
		
		sig =new JLabel("Don't have an account:");
		frame.add(sig);
		sig.setBounds(30, 370, 200, 30);
		
		b=new JButton("Sign in");
		b.setBounds(90, 400, 90, 30);
		frame.add(b);
		
		
		
		//properties of JFrame
		//this.getContentPane().add(frame);
		frame.setSize(600,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	

//	    public void actionPerformed(ActionEvent ee) {
//		    if (ee.getSource() == btn) {
//		        new reg();
//		    }
//		}
	   


	       public static void main (String args[]) {
	        	new signin();
	     
	        }
//
//	
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			if(e.getSource() == btn) {
//			       
//				
//			       String user = inputUser.getText();
//			       String pass = inputpassword.getText();
//			       models s1 = new models();
//			       controllers s2 = new controllers();
//			       boolean result = s2.save(s1);
//			     if (result == true) {
//			       JOptionPane.showMessageDialog(frame," successful");
//			       inputUser.setText("");
//			       inputpassword.setText("");
//			       frame.dispose();
//			       
//			       reg r = new reg();
//			       r.setVisible(true);
//			       
//			        
//			       }
//			       else {
//			        JOptionPane.showMessageDialog(frame, "error to save record");
//			       }
//			       
//		}
//		}
//}
	       
	       private boolean checkLogin(String username, String password) {
	    	
	       
	    	   try {
	    		   String url="jdbc:mysql://localhost/hotel";
	    		   Connection conn = DriverManager.getConnection(url,"root","");
	    		   
	    		   String sql="SELECT *FROM customer WHERE Username=? AND Password=?";
	    		   PreparedStatement pstat = conn.prepareStatement(sql);
	    		   
	    		   pstat.setString(1,username);
	    		   pstat.setString(2,password);
	    		   
	    		   pstat.executeQuery();
	    		  
	    	   } catch(Exception e) {
	    		   e.printStackTrace();
	    		   System.out.println("Error: " +e.getMessage());
	    	   }
			return false;
	       }
	       
	       public void actionPerformed(ActionEvent e ) {
	    	   if(e.getSource() ==b) {
	    		   reg r= new reg();
	    		   r.setVisible(true);
	    		  frame.dispose();
	    	   }
	    	   else if(e.getSource()== btn) {
	    		   boolean loginSuccess = checkLogin(inputUser.getText(),inputpassword.getText());
	    		   if(loginSuccess) {
	    			   reg r= new reg();
		    		   r.setVisible(true);
		    		  frame.dispose();
	    		   }
	    		   else {
	    			   JOptionPane.showMessageDialog(frame,"Invalid username or password","Login Error",JOptionPane.ERROR_MESSAGE);
	    		   }
	    	   }
	       }
}

		
	
