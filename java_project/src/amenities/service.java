package amenities;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import bar.Bar;
import bar.pool;
import bar.restaurant;
import bar.spa;
    
public class service extends JFrame  implements ActionListener{    
  
JFrame frameObj; 
JButton btn1,btn2,btn3,btn4;
  
public service(){  
	setTitle("Facilities");
	setResizable(false);
	getContentPane().setBackground(Color.WHITE);
	
	Image icon = Toolkit.getDefaultToolkit().getImage("..\\java_project/src/img/logos.jpg");    
	 setIconImage(icon);
  
btn1 = new JButton("Luton Restaurant");    
btn2 = new JButton("Luton Bar");    
btn3 = new JButton("Luton Pool");    
btn4 = new JButton("Luton Spa"); 
    
add(btn1); add(btn2);
add(btn3); add(btn4); 

btn1.addActionListener(this);
btn2.addActionListener(this);
btn3.addActionListener(this);
btn4.addActionListener(this);

ImageIcon restaurant=new ImageIcon("..\\java_project/src/amenities/Luton Restaurant.png");
ImageIcon bar=new ImageIcon("..\\java_project/src/amenities/Luton Bar.png");
ImageIcon pool=new ImageIcon("..\\java_project/src/amenities/Luton Pool.png");
ImageIcon spa=new ImageIcon("..\\java_project/src/amenities/Luton Spa.png");

btn1.setIcon(restaurant);
btn2.setIcon(bar);
btn3.setIcon(pool);
btn4.setIcon(spa);

//setExtendedState(JFrame.MAXIMIZED_BOTH);
setLayout(new GridLayout(2, 2, 20, 25));    
setSize(900, 900);    
setVisible(true); 

}  
public static void main(String argvs[])   
{    
new service();    
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == btn1) {
        new restaurant();
    }
	else if (e.getSource() == btn2) {
        new Bar();
    }
	else if (e.getSource() == btn3) {
        new pool();
    }
	else {
        new spa();
    }
}}