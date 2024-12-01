package view;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.paymentcontroller;
import model.paymentmodel;

public class paymentpage implements ActionListener{

	JFrame frame;
	JButton btn,bt;
	@SuppressWarnings("rawtypes")
	JComboBox combobox1;
	JTextField table1,table2,table3;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public paymentpage() {
		// TODO Auto-generated constructor stub
		
		// JFrame object
		frame= new JFrame("Luton Hotel");
		frame.setResizable(false);
		
		Image icon = Toolkit.getDefaultToolkit().getImage("..\\java_project/src/img/logos.jpg");    
   	    frame.setIconImage(icon);
		
		JLabel signLabel = new JLabel("Payment Form");
		signLabel.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(signLabel);
		signLabel.setBounds(100, 10, 300, 50);
		JLabel notice =new JLabel ("(Not necessary to fill if Payment is in cash)");
		notice.setFont(new Font("Arial", Font.PLAIN, 10));
		frame.add(notice);
		notice.setBounds(30, 220, 500, 30);
		
		JLabel userLabel1 = new JLabel("Card Type:");
		frame.add(userLabel1);
		userLabel1.setBounds(30,60,100,30);
		String languages[]={"Mastercard","Maestro","Visa","American Express"};
		combobox1= new JComboBox(languages);
		combobox1.setBounds(200, 60, 120, 30);
		frame.add(combobox1);
		
		JLabel userLabel2 = new JLabel("Card Number:");
		frame.add(userLabel2);
		userLabel2.setBounds(30,90,100,30);
		table1= new JTextField();
		table1.setBounds(200, 90, 100, 30);
		frame.add(table1);
		
		JLabel userLabel3 = new JLabel("Card Expiry:");
		frame.add(userLabel3);
		userLabel3.setBounds(30,120,100,30);
		table2= new JTextField();
		table2.setBounds(200, 120, 100, 30);
		frame.add(table2);
		
		JLabel userLabel4= new JLabel("Security Code:");
		frame.add(userLabel4);
		userLabel4.setBounds(30,150,100,30);
		table3= new JTextField();
		table3.setBounds(200, 150, 100, 30);
		frame.add(table3);
		
		
		JLabel userLabe3 = new JLabel("The hotel accepts the following payment methods");
		frame.add(userLabe3);
		userLabe3.setBounds(30, 200, 500, 30);
		
		ImageIcon a=new ImageIcon("..\\java_project/src/img/Mastercard.png");
        JLabel label1=new JLabel(a);
		label1.setBounds(30,250,50,50);
		frame.add(label1);
		
		ImageIcon aa=new ImageIcon("..\\java_project/src/img/Maestro.png");
        JLabel label2=new JLabel(aa);
		label2.setBounds(100,250,50,50);
		frame.add(label2);
		
		ImageIcon aaa=new ImageIcon("..\\java_project/src/img/visa.jpg");
        JLabel label3=new JLabel(aaa);
		label3.setBounds(170,250,50,50);
		frame.add(label3);
		
		ImageIcon aaaa=new ImageIcon("..\\java_project/src/img/american express.png");
        JLabel label4=new JLabel(aaaa);
		label4.setBounds(240,250,50,50);
		frame.add(label4);
		
		btn=new JButton("Submit");
		btn.setBounds(30, 400, 90, 30);
		btn.addActionListener(this);
		frame.add(btn);
		
		bt=new JButton("Cancel");
		bt.setBounds(130, 400, 90, 30);
		frame.add(bt);
		
		//properties of JFrame
		frame.setSize(400,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
			new paymentpage();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btn) {
	  	      
			       String Cardtype = combobox1.getSelectedItem().toString();
			       String Cardnumber = table1.getText();
			       String Cardexpiry = table2.getText();
			       String Securitycode = table3.getText();
			       paymentmodel p1 = new paymentmodel (Cardtype,Cardnumber,Cardexpiry,Securitycode);
			       paymentcontroller p2 = new paymentcontroller();
			       boolean result = p2.save(p1);
			     if (result == true) {
			       JOptionPane.showMessageDialog(frame,"Save record successful");
			        
			        table1.setText("");
			        table2.setText("");
			        table3.setText("");
			        frame.dispose();
			        
			       }
			       else {
			        JOptionPane.showMessageDialog(frame, "error to save record");
			       }
			       
			}
	    }
		
	}

