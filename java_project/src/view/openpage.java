package view;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class openpage extends JFrame implements ActionListener{

	    
	    JLabel label1, label2, label3, img;
	    JButton button1;

	    public openpage() {
	    	this.setResizable(false);
	    	getContentPane().setBackground(Color.BLACK);
	    	setTitle("Hotel Booking");
	    	
	    	Image icon = Toolkit.getDefaultToolkit().getImage("..\\java_project/src/img/logos.jpg");    
	    	 setIconImage(icon);
	        
	        label1 = new JLabel("Welcome To Luton Hotel");
	        label1.setForeground(Color.WHITE);
	        label1.setFont(new Font("Brush Script MT", Font.BOLD, 50));
	        label1.setBounds(900, 300, 500, 200);
	        add(label1);
	        Timer timer = new Timer(500, new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

					label1.setVisible(!label1.isVisible());

					}
			});

	        	timer.start();
	        
	        label2 = new JLabel("lutonhotel@gmail.com");
	        label2.setForeground(Color.WHITE);
	        label2.setFont(new Font("Times New Roman", Font.BOLD, 15));
	        label2.setBounds(1350, 720, 200, 30);
	        add(label2);
	        
	        label3 = new JLabel("+9xx xxxxx xxxxx");
	        label3.setForeground(Color.WHITE);
	        label3.setFont(new Font("Times New Roman", Font.BOLD, 15));
	        label3.setBounds(1350, 750, 200, 30);
	        add(label3);
	        
	        button1 = new JButton("Booking");
	        button1.setFont(new Font("Arial", Font.BOLD, 15));
	        button1.setBackground(Color.WHITE);
	        button1.setBounds(1300, 10, 100, 30);
	        button1.addActionListener(this);
	        add(button1);
	       
	        ImageIcon aa=new ImageIcon("..\\java_project/src/img/hotel pics.jpg");
	        img=new JLabel(aa);
			img.setBounds(100,0,600,934);
			add(img);
	       

	        setExtendedState(JFrame.MAXIMIZED_BOTH);
	        setLayout(null);
	        setVisible(true);
	        
	    }
		
		
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (e.getSource() == button1) {
		        new bookingpage();
		        dispose();
		    }
		}
		 public static void main(String[] args) {
		       openpage first=new openpage();
		       first.setVisible(true);
		    }
		}


