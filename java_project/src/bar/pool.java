package bar;

import java.awt.*;
import javax.swing.*;

public class pool extends JFrame{

    public pool(){
    	setTitle("Luton Pool");
    	Image icon = Toolkit.getDefaultToolkit().getImage("..\\java_project/src/img/logos.jpg");    
   	 setIconImage(icon);
        ImageIcon img = new ImageIcon("..\\java_project/src/bar/pool.jpg");
        JLabel aaa = new JLabel(img);
        aaa.setBounds(0, 0, 500, 750);
        add(aaa); // add the label to the frame

        setLayout(null);
        setSize(500, 750);
        setVisible(true);
    }

    public static void main(String args[]){
        new pool();
    }
}
