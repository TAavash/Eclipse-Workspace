package view;
import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import models.model;
import controllers.controller;
public class Student implements ActionListener{

		JLabel label1, label2, label3;
	    JTextField text1,text2,text3;
	    JButton button1;
	    JFrame frame= new JFrame();
		public Student() {

			label1 = new JLabel("ID");
	        label1.setBounds(30, 40, 150, 20);
	        frame.add(label1);
	        text1 = new JTextField();
	        text1.setBounds(140, 40, 150, 20);
	        frame.add(text1);
	        label2 = new JLabel("Name:");
	        label2.setBounds(30, 80, 100, 20);
	        frame.add(label2);
	        text2 = new JTextField();
	        text2.setBounds(140, 80, 150, 20);
	        frame.add(text2);
	        label3 = new JLabel("Course:");
	        label3.setBounds(30, 120, 100, 20);
	        frame.add(label3);
	        text3 = new JTextField();
	        text3.setBounds(140, 120, 150, 20);
	        frame.add(text3);
	        button1 = new JButton("Login");
	        button1.setBounds(50, 160, 80, 20);
	        frame.add(button1);
	        button1.addActionListener(this);
	       
			
			frame.setSize(400,400);
			frame.setLayout(null);
			frame.setVisible(true);
			
			
			
		}
				
		public static void main(String[] args) {
			// TODO Auto-generated method stub
				new Student();
		}
		
	

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1) {
			       
			       
				int sid = Integer.parseInt(text1.getText());
			       String name = text2.getText();
			       String course = text3.getText();
			       model s1 = new model(sid,name,course);
			       controller s2 = new controller();
			       boolean result = s2.save(s1);
			     if (result == true) {
			       JOptionPane.showMessageDialog(frame,"Save record successful");
			       text1.setText("");
			        text2.setText("");
			        text3.setText("");
			        
			       }
			       else {
			        JOptionPane.showMessageDialog(frame, "error to save record");
			       }
			       
			
		}

}
}