package view;
	import java.awt.Color;
	import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JMenu;
	import javax.swing.JMenuBar;
	import javax.swing.JMenuItem;
	import javax.swing.JPanel;
	import javax.swing.JTextArea;

import amenities.service;
	@SuppressWarnings("serial")
	public class customerpage extends JFrame implements ActionListener{
		    
		    JLabel label1, label2, label3,label4,label5,label6,label7,label8,label9;
		    JButton button1,button2,button3,button4,button5;
		    JMenuBar mb;
		    JMenu about,account,help;
		    JMenuItem New,Logout,Switch;
		   
		    public customerpage() {
		    	 setTitle("Hotel Booking");
		    	 JPanel panel1=new JPanel ();
		    	 JPanel panel2=new JPanel ();
		    	 JPanel panel3=new JPanel ();
		    	 JPanel panel4=new JPanel ();
		    	 JPanel panel5=new JPanel ();
		    	 JPanel panel6=new JPanel ();
		    	 JPanel panel7=new JPanel ();
		    	 JPanel panel8=new JPanel ();

		    	 Image icon = Toolkit.getDefaultToolkit().getImage("..\\java_project/src/img/logos.jpg");    
		    	 setIconImage(icon);
		    	 
		        label1 = new JLabel("Welcome To Luton Hotel");
		        label1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		        label1.setBounds(650, 5, 300, 50);
		        add(label1);
		        
		        ImageIcon aaaa=new ImageIcon("..\\java_project/src/img/single room.jpg");
		        label2=new JLabel(aaaa);
				panel1.add(label2);
				
				ImageIcon aaa=new ImageIcon("..\\java_project/src/img/1pool.jpg");
		        label3=new JLabel(aaa);
				panel4.add(label3);
		       
		        ImageIcon aa=new ImageIcon("..\\java_project/src/img/1room.jpg");
		        label4=new JLabel(aa);
				panel3.add(label4);
				
				ImageIcon a=new ImageIcon("..\\java_project/src/img/1double room.jpg");
		        label5=new JLabel(a);
				panel2.add(label5);
		        
		        label6 = new JLabel("Single room");
		        label6.setFont(new Font("Times New Roman", Font.BOLD, 20));
		        label6.setForeground(Color.WHITE);
		        panel5.add(label6);
		        label7 = new JLabel("Swimming pool");
		        label7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		        label7.setForeground(Color.WHITE);
		        panel8.add(label7);
		        label8 = new JLabel("Double room");
		        label8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		        label8.setForeground(Color.WHITE);
		        panel7.add(label8);
		        label9 = new JLabel("Twin room");
		        label9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		        label9.setForeground(Color.WHITE);
		        panel6.add(label9);
		        
		        JTextArea singlearea=new JTextArea("\nThis room is designed to accommodate a single guest. "
		        		+ "\nThese rooms are usually smaller in size than other room\ntypes and may include a single bed, a dresser or \nwardrobe, a small table or desk, and a chair."
		        		+ "\n\nSingle rooms may also include basic amenities such as a\ntelevision, telephone, and a private bathroom with \na shower, sink, and toilet."
		        		+ "\n\n\n Price per night: 200$",15,30);
		        singlearea.setEditable(false);
		        panel5.add(singlearea);
		        JTextArea doublearea=new JTextArea("\nThis room is designed to accommodate two guests."
		        		+ "\nDouble room is a guest room that is designed \nto accommodate two guests and features a larger bed,\ntypically a queen or king-size bed."
		        		+ "\nThe room may have either a single large bed or two \nseparate beds for each guest."
		        		+ "\n\nIt may also have additional amenities such as \na seating area, desk, or mini-fridge."
		        		+ "\n\n\n Price per night: 240$",15,30);
		        doublearea.setEditable(false);
		        panel7.add(doublearea);
		        JTextArea twinarea=new JTextArea("\nThis room is designed to accommodate two guests."
		        		+ "\nA twin room is a room that typically has two separate \nbeds. "		        		+ "\n\nTwin rooms are ideal for two guests who prefer separate \nbeds or for friends traveling together. "
		        		+ "The room is usually \nequipped with all necessary amenities, such as a \nprivate bathroom, a desk, a wardrobe, and a TV. "
		        		+ "\nSome twin rooms may also have a seating area \nor a balcony"
		        		+ "\n\n\n Price per night: 260$",15,30);
		        twinarea.setEditable(false);
		        panel6.add(twinarea);
		        JTextArea swimmingarea=new JTextArea("Swimming pools can be a great way to relax and unwind\nafter a long day of sightseeing or business meetings. "
		        		+ "\nThey can also be a fun activity for families with children. "
		        		+ "\nHotel offers swimming lessons or organized \nactivities in their pools.",15,30);
		        swimmingarea.setEditable(false);
		        panel8.add(swimmingarea,button2);
		        
		        New=new JMenuItem("New account");
		        Switch=new JMenuItem("Switch account");
		        Logout=new JMenuItem("Log out");
		        
		        New.addActionListener(this);
		        Switch.addActionListener(this);
		        Logout.addActionListener(this);
		        
		        mb=new JMenuBar();
		        mb.setBackground(Color.black);
		        about=new JMenu("About");
		        about.setForeground(Color.WHITE);
		        account=new JMenu("Account");
		        account.setForeground(Color.WHITE);
		        help=new JMenu("Help");
		        help.setForeground(Color.WHITE);
		        
		        account.add(New);account.add(Switch);account.add(Logout);
		        mb.add(about);mb.add(account);mb.add(help);
		        this.add(mb);
		        this.setJMenuBar(mb);
		        
		        button1 = new JButton("My Booking");
		        button1.setBounds(10, 10, 100, 30);
		        button1.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						new viewBooking();}});
		        add(button1);
		        
		        button2 = new JButton("Book");
		        button2.setBounds(1200, 10, 100, 30);
		        button2.addActionListener(this);
		        panel5.add(button2);
		        button2.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						new reservationpage();}});
		        
		        button3 = new JButton("Book");
		        button3.setBounds(1200, 10, 100, 30);
		        button3.addActionListener(this);
		        panel6.add(button3);
		        button3.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						new reservationpage();}});
		        
		        button4 = new JButton("Book");
		        button4.setBounds(1200, 10, 100, 30);
		        button4.addActionListener(this);
		        panel7.add(button4);
		        button4.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						new reservationpage();}});
		        
		        button5 = new JButton("Pictures");
		        button5.setBounds(1200, 10, 100, 30);
		        button5.addActionListener(this);
		        panel8.add(button5);
		        button5.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						new service();}});
		        
		        panel1.setBounds(100,70,310,310);    
		        panel1.setBackground(Color.black);
		        add(panel1);
		        panel2.setBounds(100,420,310,310);    
		        panel2.setBackground(Color.black);
		        add(panel2);
		        panel3.setBounds(800,70,310,310);    
		        panel3.setBackground(Color.black);
		        add(panel3);
		        panel4.setBounds(800,420,310,310);    
		        panel4.setBackground(Color.black);
		        add(panel4);
		        panel5.setBounds(420,70,310,310);    
		        panel5.setBackground(Color.black);
		        add(panel5);
		        panel6.setBounds(420,420,310,310);    
		        panel6.setBackground(Color.black);
		        add(panel6);
		        panel7.setBounds(1120,70,310,310);    
		        panel7.setBackground(Color.black);
		        add(panel7);
		        panel8.setBounds(1120,420,310,310);    
		        panel8.setBackground(Color.black);
		        add(panel8);
		        
		        

				setExtendedState(JFrame.MAXIMIZED_BOTH);
		        setLayout(null);
		        setVisible(true);
		        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    }

			public void actionPerformed(ActionEvent ee) {
				if (ee.getSource() == New) {
			        new registrationpage();
		    }
				else if (ee.getSource() == Switch) {
			        new loginpage();
		    }
		    	else if (ee.getSource() == Logout) {
			        new bookingpage();
			        dispose();
		    }}
			
			 public static void main(String[] args) {
			       new customerpage();
			    }

			}


