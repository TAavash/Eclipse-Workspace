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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import controller.reservationcontroller;
import model.reservationmodel;
public class reservationpage implements ActionListener{

	JFrame frame;
	JButton btn,bt;
	JTextField table1;
	JRadioButton radioButton1,radioButton2;
	JDateChooser calendar1,calendar2;
	@SuppressWarnings("rawtypes")
	JComboBox combobox1,combobox2,combobox3,combobox4;
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public reservationpage() {
		
		frame= new JFrame("Luton Hotel");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.white);
		
		Image icon = Toolkit.getDefaultToolkit().getImage("..\\java_project/src/img/logos.jpg");    
   	    frame.setIconImage(icon);
   	    
   	    ImageIcon b=new ImageIcon("..\\java_project/src/img/butlers.jpg");
        JLabel butler=new JLabel(b);
        butler.setBounds(310,70,295,500);
		frame.add(butler);
		
		JLabel Label1 = new JLabel("Reservation Page");
		Label1.setFont(new Font("Arial", Font.BOLD, 20));
		frame.add(Label1);
		Label1.setBounds(150,3,180,30);
		
		JLabel sign = new JLabel("Room Requirements");
		sign.setFont(new Font("Arial", Font.BOLD, 13));
		frame.add(sign);
		sign.setBounds(60,30,130,30);
		
		JLabel userLabe1 = new JLabel("Room Type:");
		frame.add(userLabe1);
		userLabe1.setBounds(30,60,100,30);
		
		JLabel userLabe2 = new JLabel("Room Service:");
		frame.add(userLabe2);
		userLabe2.setBounds(30,90,100,30);
		
		JLabel userLabe3 = new JLabel("Floor Number:");
		frame.add(userLabe3);
		userLabe3.setBounds(30,120,100,30);
		
		JLabel userLabel5 = new JLabel("Service Name:");
		frame.add(userLabel5);
		userLabel5.setBounds(30,270,100,30);
		
		JLabel userLabe4 = new JLabel("Members no:");
		frame.add(userLabe4);
		userLabe4.setBounds(30,180,100,30);
		
		JLabel userLabel10 = new JLabel("Member Type:");
		frame.add(userLabel10);
		userLabel10.setBounds(30,210,100,30);
		
		JLabel userLabel11 = new JLabel("Date of Arrival:");
		frame.add(userLabel11);
		userLabel11.setBounds(30,330,150,30);
		
		JLabel userLabel12 = new JLabel("Date of Departure:");
		frame.add(userLabel12);
		userLabel12.setBounds(30,360,150,30);
		
		table1= new JTextField();
		table1.setBounds(200, 270, 100, 30);
		frame.add(table1);

		calendar1 = new JDateChooser();
		calendar1.setBounds(200, 330, 100, 30);
		frame.add(calendar1);
		calendar2 = new JDateChooser();
		calendar2.setBounds(200, 360, 100, 30);
		frame.add(calendar2);
		
		radioButton1= new JRadioButton("Individual");
		radioButton1.setBounds(200, 210, 100, 30);
		radioButton1.addActionListener(this);
		frame.add(radioButton1);
		radioButton2= new JRadioButton("Coorporate");
		radioButton2.setBounds(200, 240, 100, 30);
		radioButton2.addActionListener(this);
		frame.add(radioButton2);
		ButtonGroup bg=new ButtonGroup();    
		bg.add(radioButton1);bg.add(radioButton2); 
		
		String languages[]={"Single Room","Double Room","Twin Room"};
		combobox1= new JComboBox(languages);
		combobox1.setBounds(200,60,110,30);
		frame.add(combobox1);
		String languages2[]={"Normal","VIP"};
		combobox2= new JComboBox(languages2);
		combobox2.setBounds(200,90,110,30);
		frame.add(combobox2);
		String languages3[]={"Rooftop","5","4","3","2","1"};
		combobox3= new JComboBox(languages3);
		combobox3.setBounds(200,120,110,30);
		frame.add(combobox3);
		String[] option1 = {"1","2","3","more"};  
	    combobox4 = new JComboBox(option1);
	    frame.add(combobox4);
	    combobox4.setBounds(200,180,60,30);
	    
	    
		   

		btn=new JButton("Submit");
		btn.addActionListener(this);
		btn.setBounds(30, 450, 90, 30);
		frame.add(btn);
		
		bt=new JButton("Cancel");
		bt.addActionListener(this);
		bt.setBounds(130, 450, 90, 30);
		frame.add(bt);
		
		//properties of JFrame
		frame.setSize(600,600);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
			new reservationpage();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bt){
	    	 table1.setText("");
	     }
		if (e.getSource() == btn) {
	      
		       String ServiceName = table1.getText();
		       String Arrival = ((JTextField)calendar1.getDateEditor().getUiComponent()).getText();
		       String Departure = ((JTextField)calendar2.getDateEditor().getUiComponent()).getText();
		       String Roomtype = combobox1.getSelectedItem().toString();
		       String type;
		       if(radioButton2.isSelected()) {
		    	   type = "Corporate";
		       }
		       else {
		    	   type = "Individual";
		       }
		       String Roomservice = combobox2.getSelectedItem().toString();
		       String Floornumber = combobox3.getSelectedItem().toString();
		       String Membernumber = combobox4.getSelectedItem().toString();
		       int manager = 1;
		       
		       reservationmodel r1 = new reservationmodel (manager, Roomtype,Roomservice,Floornumber,Membernumber,type,ServiceName,Arrival,Departure);
		       reservationcontroller r2 = new reservationcontroller();
		       boolean result = r2.save(r1);
		     if (result == true) {
		       JOptionPane.showMessageDialog(frame,"Save record successful");
		        new paymentpage();
		        frame.dispose();
		        
		       }
		       else {
		        JOptionPane.showMessageDialog(frame, "error to save record");
		       }
		}
	}
}
