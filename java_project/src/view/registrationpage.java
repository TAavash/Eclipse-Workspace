package view;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.Timer;

import controller.registrationcontroller;
import model.registermodel;
public class registrationpage implements ActionListener{
	JFrame frame;
	JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11;
	JButton btn,bt;
	JPasswordField inputpassword;
	JRadioButton maleCheckbox,femaleCheckbox;
	ButtonGroup bg;
	JTextField table1,table2,table3,table4,table5,table6,table7;

	public registrationpage() {
		// TODO Auto-generated constructor stub
		
		// JFrame object
		frame= new JFrame("Luton Hotel");
		frame.setResizable(false);
		
		Image icon = Toolkit.getDefaultToolkit().getImage("..\\java_project/src/img/logos.jpg");    
   	    frame.setIconImage(icon);
		
		label2 = new JLabel("Registration Form");
		label2.setFont(new Font("Arial", Font.BOLD, 20));
		label2.setForeground(Color.WHITE);
		frame.add(label2);
		label2.setBounds(160, 10, 300, 50);
		Timer timer = new Timer(500, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				label2.setVisible(!label2.isVisible());

				}
		});

			timer.start();
		
		label3 = new JLabel("Full Name:");
		label3.setFont(new Font("Arial", Font.BOLD, 15));
		label3.setForeground(Color.WHITE);
		frame.add(label3);
		label3.setBounds(30,60,100,30);
		table1= new JTextField();
		table1.setBounds(200 ,60 ,100 ,30);
		frame.add(table1);
		
		label4 = new JLabel("Date of Birth:");
		label4.setFont(new Font("Arial", Font.BOLD, 15));
		label4.setForeground(Color.WHITE);
		frame.add(label4);
		label4.setBounds(30,100,100,30);
		
		table2= new JTextField();
		table2.setBounds(200, 100, 100, 30);
		frame.add(table2);
		
		label5 = new JLabel("Email:");
		label5.setFont(new Font("Arial", Font.BOLD, 15));
		label5.setForeground(Color.WHITE);
		frame.add(label5);
		label5.setBounds(30,140,100,30);
		table3= new JTextField();
		table3.setBounds(200, 140, 100, 30);
		frame.add(table3);
		
		label6 = new JLabel("Contact Number:");
		label6.setFont(new Font("Arial", Font.BOLD, 15));
		label6.setForeground(Color.WHITE);
		frame.add(label6);
		label6.setBounds(30,180,130,30);
		table4= new JTextField();
		table4.setBounds(200, 180, 100, 30);
		frame.add(table4);
		
		label7= new JLabel("Country:");
		label7.setFont(new Font("Arial", Font.BOLD, 15));
		label7.setForeground(Color.WHITE);
		frame.add(label7);
		label7.setBounds(30,220,100,30);
		table5= new JTextField();
		table5.setBounds(200, 220, 100, 30);
		frame.add(table5);
		
		label8 = new JLabel("Address:");
		label8.setFont(new Font("Arial", Font.BOLD, 15));
		label8.setForeground(Color.WHITE);
		frame.add(label8);
		label8.setBounds(30,260,100,30);
		table6= new JTextField();
		table6.setBounds(200, 260, 100, 30);
		frame.add(table6);
		
		label10 = new JLabel("Username :");
		label10.setFont(new Font("Arial", Font.BOLD, 15));
		label10.setForeground(Color.WHITE);
		frame.add(label10);
		label10.setBounds(30,340,150,30);
		table7= new JTextField();
		table7.setBounds(200, 340, 100, 30);
		frame.add(table7);
	
		label11 = new JLabel("Password :");
		label11.setFont(new Font("Arial", Font.BOLD, 15));
		label11.setForeground(Color.WHITE);
		frame.add(label11);
		label11.setBounds(30,380,150,30);
		inputpassword= new JPasswordField();
		inputpassword.setBounds(200, 380, 100, 30);
		frame.add(inputpassword);
	
		
		label9 = new JLabel("Gender:");
		label9.setFont(new Font("Arial", Font.BOLD, 15));
		label9.setForeground(Color.WHITE);
		frame.add(label9);
		label9.setBounds(30,300,100,30);
		
		
		maleCheckbox= new JRadioButton("Male");
		maleCheckbox.setFont(new Font("Arial", Font.BOLD, 10));
		maleCheckbox.setForeground(Color.WHITE);
		maleCheckbox.setBounds(200, 300, 50, 30);
		maleCheckbox.setOpaque(false);
		frame.add(maleCheckbox);
		femaleCheckbox= new JRadioButton("Female");
		femaleCheckbox.setFont(new Font("Arial", Font.BOLD, 10));
		femaleCheckbox.setForeground(Color.WHITE);
		femaleCheckbox.setBounds(250, 300, 100, 30);
		femaleCheckbox.setOpaque(false);
		frame.add(femaleCheckbox);
		bg=new ButtonGroup();    
		bg.add(maleCheckbox);bg.add(femaleCheckbox); 
		
		btn=new JButton("Submit");
		btn.setBounds(30, 500, 90, 30);
		btn.addActionListener(this);
		frame.add(btn);
		
		bt=new JButton("Cancel");
		bt.setBounds(130, 500, 90, 30);
		bt.addActionListener(this);
		frame.add(bt);
		
		ImageIcon aa=new ImageIcon("..\\java_project/src/img/life.jpg");
        label1=new JLabel(aa);
		label1.setBounds(0,0,500,600);
		frame.add(label1);
		
		//properties of JFrame
		frame.setSize(500,600);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	public static void main(String[] args) {
			new registrationpage();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bt) {
		    inputpassword.setText("");
		
	    	 table1.setText("");
	         table2.setText("");
	         table3.setText("");
	         table4.setText("");
	         table5.setText("");
	         table6.setText("");
	         table7.setText("");
	     }
		if (e.getSource() == btn) {
	      
		       String FullName = table1.getText();
		       String DateofBirth = table2.getText();
		       String Email = table3.getText();
		       String Contact = table4.getText();
//		       String Contact ;
//		       if(table4==10) {
//		    	   Contact = "Female";
//		       }
//		       else {
//		    	   Contact = "Male";
//		    	   JOptionPane.showMessageDialog(frame, "Error in phone"); 
//		       }
		       String Country = table5.getText();
		       String Address = table6.getText();
		       String Gender;
		       if(femaleCheckbox.isSelected()) {
		    	   Gender = "Female";
		       }
		       else {
		    	   Gender = "Male";
		       }
		       String Username = table7.getText();
		       String Password = inputpassword.getText();


		       
		       registermodel s1 = new registermodel(FullName,DateofBirth,Email,Contact,Country,Address,Gender,Username,Password);
		       registrationcontroller s2 = new registrationcontroller();
		       boolean result = s2.save(s1);
		     if (result == true) {
		       JOptionPane.showMessageDialog(frame,"Save record successful");
		        
		        new loginpage();
		        frame.dispose();
		        
		       }
		       else {
		        JOptionPane.showMessageDialog(frame, "error to save record");
		       }}
		     

}}


