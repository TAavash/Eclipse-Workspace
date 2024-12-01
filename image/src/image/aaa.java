package image;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class aaa extends JFrame implements ActionListener{

ImageIcon s[];
JLabel l;
JButton b1,b2;
int i,l1;
JPanel p;

public aaa()
{
   setLayout(new BorderLayout( ));
   setSize(800, 700);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setVisible(true);
   JPanel p=new JPanel(new FlowLayout());
   b1=new JButton("<<");
   b2=new JButton(">>");
   p.add(b1);
   p.add(b2);
   add(p,BorderLayout.SOUTH);
   b1.addActionListener(this);
   b2.addActionListener(this);
   s = new ImageIcon[14]; 
   s[0] = new ImageIcon("..\\image/src/image/momos.jpg");
   s[1] = new ImageIcon("..\\image/src/image/breakfast.jpg");
   s[2] = new ImageIcon("..\\image/src/image/burger.jpg");
   s[3] = new ImageIcon("..\\image/src/image/chicken.jpg");
   s[4] = new ImageIcon("..\\image/src/image/corndog.jpg");
   s[5] = new ImageIcon("..\\image/src/image/dish.jpg");
   s[6] = new ImageIcon("..\\image/src/image/drink.jpg");
   s[7] = new ImageIcon("..\\image/src/image/dumplings.jpg");
   s[8] = new ImageIcon("..\\image/src/image/food.jpg");
   s[9] = new ImageIcon("..\\image/src/image/indianset.jpg");
   s[10] = new ImageIcon("..\\image/src/image/milkshake.jpg");
   s[11] = new ImageIcon("..\\image/src/image/momo.jpg");
   s[12] = new ImageIcon("..\\image/src/image/omlet.jpg");
   s[13] = new ImageIcon("..\\image/src/image/omuri.jpg");
   l = new JLabel("",JLabel.CENTER); 
   add(l,BorderLayout.CENTER);
   l.setIcon(s[0]);
   
}
public  void actionPerformed(ActionEvent e)
{

   if(e.getSource()==b1)
   {
       if(i==0)
       {
//           JOptionPane.showMessageDialog(null,"This is First Image");
           l.setIcon(s[2]);
       }
       else
           {
           i=i-1;
           l.setIcon(s[i]);
       }
   }
   if(e.getSource()==b2)
   {
       if(i==s.length-1)
       {
           JOptionPane.showMessageDialog(null,"This is LastImage");
       }
       else
           {
           i=i+1;
           l.setIcon(s[i]);
           }
       }

    }
public static void main(String args[])
{
    new aaa();
}
}