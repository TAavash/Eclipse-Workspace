package registrationpage;
import sign.signin;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class reg extends JFrame implements ActionListener{


		JButton bt;
	public reg() {
		// TODO Auto-generated constructor stub
		
		// JFrame object
		super();
		
		
		JLabel Label1 = new JLabel("Luton Hotel");
		add(Label1);
		Label1.setBounds(250,5,180,30);
		
		JLabel signLabel = new JLabel("Registration Form");
		add(signLabel);
		signLabel.setBounds(60,30,130,30);
		
		JLabel sign = new JLabel("Room Requirements");
		add(sign);
		sign.setBounds(360,30,130,30);
		
		JLabel userLabel1 = new JLabel("Full Name:");
		add(userLabel1);
		userLabel1.setBounds(30,60,100,30);
		JLabel userLabe1 = new JLabel("Room Type:");
		add(userLabe1);
		userLabe1.setBounds(330,60,100,30);
		
		JLabel userLabel2 = new JLabel("Contact Number:");
		add(userLabel2);
		userLabel2.setBounds(30,90,100,30);
		JLabel userLabe2 = new JLabel("Room Service:");
		add(userLabe2);
		userLabe2.setBounds(330,90,100,30);
		
		JLabel userLabel3 = new JLabel("Date of Birth:");
		add(userLabel3);
		userLabel3.setBounds(30,120,100,30);
		JLabel userLabe3 = new JLabel("Floor Number:");
		add(userLabe3);
		userLabe3.setBounds(330,120,100,30);
		
		JLabel userLabel4= new JLabel("Email:");
		add(userLabel4);
		//Location and dimensions of JFrame
		//first two are location and rest two dimension from setBounds
		userLabel4.setBounds(30,150,100,30);
		JLabel userLabe4 = new JLabel("Members no:");
		add(userLabe4);
		userLabe4.setBounds(330,150,150,30);
		
		JLabel userLabel5 = new JLabel("Address:");
		add(userLabel5);
		userLabel5.setBounds(30,180,100,30);
		
		JLabel userLabel6 = new JLabel("Permanent Address:");
		add(userLabel6);
		userLabel6.setBounds(30,210,150,30);
		
		JLabel userLabel7 = new JLabel("Temporary Address:");
		add(userLabel7);
		userLabel7.setBounds(30,240,150,30);
		
		JLabel userLabel10 = new JLabel("Gender:");
		add(userLabel10);
		userLabel10.setBounds(30,270,100,30);
		JLabel userLabe5 = new JLabel("Member Type:");
		add(userLabe5);
		userLabe5.setBounds(330,270,120,30);
		
		JLabel userLabel11 = new JLabel("Date of Arrival:");
		add(userLabel11);
		userLabel11.setBounds(30,330,150,30);
		JLabel userLabe11 = new JLabel("Budget:");
		add(userLabe11);
		userLabe11.setBounds(330,330,150,30);
		
		JLabel userLabel12 = new JLabel("Date of Departure:");
		add(userLabel12);
		userLabel12.setBounds(30,360,150,30);
		
		JTextField table1= new JTextField();
		table1.setBounds(200, 60, 100, 30);
		add(table1);
		JTextField table2= new JTextField();
		table2.setBounds(200, 90, 100, 30);
		add(table2);
		JTextField table3= new JTextField();
		table3.setBounds(200, 120, 100, 30);
		add(table3);
		JTextField table4= new JTextField();
		table4.setBounds(200, 150, 100, 30);
		add(table4);
		JTextField table5= new JTextField();
		table5.setBounds(200, 210, 100, 30);
		add(table5);
		JTextField table6= new JTextField();
		table6.setBounds(200, 240, 100, 30);
		add(table6);
		JTextField table7= new JTextField();
		table7.setBounds(200, 330, 100, 30);
		add(table7);
		JTextField table8= new JTextField();
		table8.setBounds(200, 360, 100, 30);
		add(table8);
		JTextField table9= new JTextField();
		table9.setBounds(440, 330, 100, 30);
		add(table9);
		
		JCheckBox checkbox1= new JCheckBox("Male");
		checkbox1.setBounds(200, 270, 100, 30);
		add(checkbox1);
		JCheckBox checkbox2= new JCheckBox("Female");
		checkbox2.setBounds(200, 300, 100, 30);
		add(checkbox2);
		JCheckBox checkbox3= new JCheckBox("Individual");
		checkbox3.setBounds(440,270,100,30);
		add(checkbox3);
		JCheckBox checkbox4= new JCheckBox("Coorporate");
		checkbox4.setBounds(440, 300, 100, 30);
		add(checkbox4);
		
		String[] option1 = {"1","2","3","4","5","6","7","8","9","10","more"};  
	    JComboBox box1 = new JComboBox(option1);
	    add(box1);
	    box1.setBounds(440,150,60,30);
		
		String languages[]={"Single Room","Double Room","Twin Room"};
		JComboBox combobox1= new JComboBox(languages);
		combobox1.setBounds(440,60,110,30);
		add(combobox1);
		String languages2[]={"Normal","VIP"};
		JComboBox combobox2= new JComboBox(languages2);
		combobox2.setBounds(440,90,110,30);
		add(combobox2);
		String languages3[]={"Rooftop","4","3","2","1","Ground"};
		JComboBox combobox3= new JComboBox(languages3);
		combobox3.setBounds(440,120,110,30);
		add(combobox3);
		
		JButton btn=new JButton("Submit");
		btn.setBounds(30, 500, 90, 30);
		add(btn);
		
		 bt=new JButton("Cancel");
		bt.setBounds(130, 500, 90, 30);
		add(bt);
		//properties of JFrame
		
		setSize(600,600);
		setLayout(null);
		setVisible(true);
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== bt) {
			signin sgn = new signin();
			
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new reg();
	}

}
