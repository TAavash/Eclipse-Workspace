package view;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
@SuppressWarnings("serial")
public class bookingpage extends JFrame implements ActionListener{

	    JLabel label1, label2, label3,label4,label5,label6,label7,label8,label9;
	    JButton button1,button2;

	    public bookingpage() {
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
	        
	        label6 = new JLabel("Single room");
	        label6.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        label6.setForeground(Color.WHITE);
	        panel5.add(label6);
	        label7 = new JLabel("Swimming pool");
	        label7.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        label7.setForeground(Color.WHITE);
	        panel6.add(label7);
	        label8 = new JLabel("Double room");
	        label8.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        label8.setForeground(Color.WHITE);
	        panel7.add(label8);
	        label9 = new JLabel("Twin room");
	        label9.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        label9.setForeground(Color.WHITE);
	        panel8.add(label9);
	        
	        JTextArea singlearea=new JTextArea("\nThis room is designed to accommodate a single guest. "
	        		+ "\nThese rooms are usually smaller in size than other room\ntypes and may include a single bed, a dresser or \nwardrobe, a small table or desk, and a chair."
	        		+ "\n\nSingle rooms may also include basic amenities such as a\ntelevision, telephone, and a private bathroom with \na shower, sink, and toilet."
	        		+ "\n\n\n Price per night: 200$",17,30);
	        singlearea.setEditable(false);
	        panel5.add(singlearea);
	        JTextArea swimmingarea=new JTextArea("Swimming pools can be a great way to relax and unwind\nafter a long day of sightseeing or business meetings. "
	        		+ "\nThey can also be a fun activity for families with children. "
	        		+ "\nSHotel offers swimming lessons or organized \nactivities in their pools.",17,30);
	        swimmingarea.setEditable(false);
	        panel6.add(swimmingarea);
	        JTextArea doublearea=new JTextArea("\nThis room is designed to accommodate two guests."
	        		+ "\nDouble room is a guest room that is designed \nto accommodate two guests and features a larger bed,\ntypically a queen or king-size bed."
	        		+ "\nThe room may have either a single large bed or two \nseparate beds for each guest."
	        		+ "\n\nIt may also have additional amenities such as \na seating area, desk, or mini-fridge."
	        		+ "\n\n\n Price per night: 240$",17,30);
	        doublearea.setEditable(false);
	        panel7.add(doublearea);
	        JTextArea twinarea=new JTextArea("\nThis room is designed to accommodate two guests."
	        		+ "\nA twin room is a room that typically has two separate \nbeds. "
	        		+ "These beds are usually arranged side by side \nor placed on opposite walls. "
	        		+ "\n\nTwin rooms are ideal for two guests who prefer separate \nbeds or for friends traveling together. "
	        		+ "The room is usually \nequipped with all necessary amenities, such as a \nprivate bathroom, a desk, a wardrobe, and a TV. "
	        		+ "\nSome twin rooms may also have a seating area \nor a balcony"
	        		+ "\n\n\n Price per night: 260$",17,30);
	        twinarea.setEditable(false);
	        panel8.add(twinarea);
	        
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

	        
	        button1 = new JButton("Login");
	        button1.setBounds(1200, 10, 100, 30);
	        button1.addActionListener(this);
	        add(button1);
	        
	        button2 =new JButton("Signup");
	        button2.setBounds(1350, 10, 100, 30);
	        button2.addActionListener(this);
	        add(button2);
	        
	        ImageIcon aaaa=new ImageIcon("..\\java_project/src/img/single room.jpg");
	        label2=new JLabel(aaaa);
			panel1.add(label2);
			
			ImageIcon aaa=new ImageIcon("..\\java_project/src/img/1pool.jpg");
	        label3=new JLabel(aaa);
			panel2.add(label3);
	       
	        ImageIcon aa=new ImageIcon("..\\java_project/src/img/1room.jpg");
	        label4=new JLabel(aa);
			panel3.add(label4);
			
			ImageIcon a=new ImageIcon("..\\java_project/src/img/1double room.jpg");
	        label5=new JLabel(a);
			panel4.add(label5);
	       

			setExtendedState(JFrame.MAXIMIZED_BOTH);
	        setLayout(null);
	        setVisible(true);
	    }
		
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1) {
		        new loginpage();
		    }
			else if (e.getSource() == button2){
				new registrationpage();
			}
		}
		 public static void main(String[] args) {
		       new bookingpage();
		    }	 
		}
	      



