package  bar;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Bar extends JFrame implements ActionListener{

ImageIcon s[];
JLabel l;
JButton b1,b2;
int i,l1;
JPanel p;

public Bar()
{
	setTitle("Luton Bar");
	Image icon = Toolkit.getDefaultToolkit().getImage("..\\java_project/src/img/logos.jpg");    
	 setIconImage(icon);
   setLayout(new BorderLayout( ));
   setSize(300, 400);
   setVisible(true);
   JPanel p=new JPanel(new FlowLayout());
   b1=new JButton("<<");
   b2=new JButton(">>");
   p.add(b1);
   p.add(b2);
   add(p,BorderLayout.SOUTH);
   b1.addActionListener(this);
   b2.addActionListener(this);
   s = new ImageIcon[4]; 
   s[0] = new ImageIcon("..\\java_project/src/bar/bar.jpg");
   s[1] = new ImageIcon("..\\java_project/src/bar/bars.jpg");
   s[2] = new ImageIcon("..\\java_project/src/bar/menus.jpg");
   s[3] = new ImageIcon("..\\java_project/src/bar/champaign.jpg");
   l = new JLabel("",JLabel.CENTER); 
   add(l,BorderLayout.CENTER);
   l.setIcon(s[0]);
   
}
public  void actionPerformed(ActionEvent e)
{

   if(e.getSource()==b1)
   {
       if(i==0) {
    	   
       }
       else {
           i=i-1;
           l.setIcon(s[i]);
       }
   }
   if(e.getSource()==b2) {
       if(i==s.length-1) {
           JOptionPane.showMessageDialog(null,"This is LastImage");
       }
       else  {
           i=i+1;
           l.setIcon(s[i]);
           }
       }}
public static void main(String args[])
{
    new Bar();
}}