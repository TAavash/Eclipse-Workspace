package view;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import model.test;
import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

public class ManagerView implements ActionListener{

	JFrame frame;
	JLabel label1,label2,label3;
	JDateChooser input1,input2; 
	JButton bt;
	JButton updatebtn;
	JTextField bb;
	@SuppressWarnings("rawtypes")
	JComboBox combo,stats,number;
	 private JTable table;
	    private DefaultTableModel tableModel;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ManagerView() {		
		frame = new JFrame("My Booking");
		frame.setResizable(false);//Disable the resize button
		
		Image icon = Toolkit.getDefaultToolkit().getImage("..\\java_project/src/img/logos.jpg");    
   	    frame.setIconImage(icon);
		
		bb= new JTextField();
		bb.setVisible(false);
		bb.setBounds(0,0,120,12);
		frame.add(bb);
		
		label1 = new JLabel("Check in Date:");
		frame.add(label1);
		label1.setBounds(30,60,100,30);
		
		label2= new JLabel("Check out Date:");
		frame.add(label2);
		label2.setBounds(30,110,100,30);
		
		label3= new JLabel("Room no:");
		frame.add(label3);
		label3.setBounds(30,10,100,30);
		
		input1= new JDateChooser();
		input1.setBounds(130, 60, 100, 30);
		frame.add(input1);
		input2= new JDateChooser();
		input2.setBounds(130, 110, 100, 30);
		frame.add(input2);
		
		String languages[]={"Single Room","Double Room","Twin Room"};
		combo= new JComboBox(languages);
		combo.setBounds(250,60,110,30);
		frame.add(combo);
		
		String bookingStats[]={"pending","booked","cancelled"};
		stats= new JComboBox(bookingStats);
		stats.setBounds(250,110,110,30);
		frame.add(stats);
		
		String roomnumber[]={"pending","1","15","30","45","60","75","90","105","120","135","150","165","180","195","210","225","240","250"};
		number = new JComboBox(roomnumber);
		number.setBounds(130,10,110,30);
		frame.add(number);
		
		updatebtn = new JButton("Update");
		updatebtn.addActionListener(this);
		updatebtn.setBounds(30,150,90,30);
		frame.add(updatebtn);
		
		bt=new JButton("Cancel");
		bt.setBounds(130, 150, 90, 30);
		bt.addActionListener(this);
		frame.add(bt);
		
		
		
		
		 tableModel = new DefaultTableModel();
	        tableModel.setColumnIdentifiers(new Object[]{"Booking id", "Date of Arrival", "Date of Departure", "status", "Room Type","Room Number", "Room Service", "Floor Number"});

	        table = new JTable(tableModel);
	       table.addMouseListener( new MouseAdapter() {

	        	public void mouseClicked(MouseEvent arg0) {

	        	int i = table.getSelectedRow();


	        	bb.setText(table.getValueAt(i,0).toString());

	        	
	        	((JTextField)input1.getDateEditor().getUiComponent()).setText(table.getValueAt(i,1).toString());

	        	((JTextField)input2.getDateEditor().getUiComponent()).setText(table.getValueAt(i,2).toString());

	        	combo.setSelectedItem(table.getValueAt(i,3).toString());
	        	
	        	stats.setSelectedItem(table.getValueAt(i,4).toString());

	        	}});
	        String sql = "SELECT `booking_id`, `date_of_arrival`, `date_of_departure`, `status`, `room_type`, `room_number`, `room_service`, `floor_number` FROM `booking`;";
	        try {

				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/luton", "root","");

				PreparedStatement pstat = conn.prepareStatement(sql);



		//		pstat.setInt(1,test.customer_customer_id);

				ResultSet rs = pstat.executeQuery();

				while (rs.next()) {

					String mid = rs.getString("booking_id");

					String checkindate = rs.getString("date_of_arrival");

					String checkoutdate = rs.getString("date_of_departure");

					String status = rs.getString("status");

					String roomType = rs.getString("room_type");
					
					String roomNumber = rs.getString("room_number");

					String roomService = rs.getString("room_service");
					
					String floorNumber = rs.getString("floor_number");

					tableModel.addRow(new Object [] {mid,checkindate,checkoutdate,status,roomType,roomNumber, roomService,floorNumber});



					}

				rs.close();

				pstat.close();

				conn.close();

			}

			catch(Exception ex) {

				System.out.println("Error "+ ex.getMessage());
			}

	        JScrollPane scrollPane = new JScrollPane(table);
scrollPane.setBounds(5,185,920,250);
	        frame.add(scrollPane);
		
		//properties of JFrame
		frame.setSize(950,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	   	

		public static void main(String[]args) {
		new ManagerView();
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
		

if(e.getSource()==updatebtn) {
	int boid = Integer.parseInt(bb.getText()) ;

	

	String checkindateinput = ((JTextField)input1.getDateEditor().getUiComponent()).getText();

	String checkoutdateout = ((JTextField)input2.getDateEditor().getUiComponent()).getText();

	String roombb = (String) combo.getSelectedItem();

	String stat = (String) stats.getSelectedItem();
	
	String num = (String) number.getSelectedItem();
	
	int row = table.getSelectedRow();

	if(row==-1) {

	JOptionPane.showMessageDialog(null, "Please select specific row!");

	}


	tableModel.setValueAt(checkindateinput,row,1);
	tableModel.setValueAt(checkoutdateout,row,2);
	tableModel.setValueAt(stat,row,3);
	tableModel.setValueAt(roombb,row,4);
	tableModel.setValueAt(num,row,5);
	

	String sql ="update booking set date_of_arrival=? ,date_of_departure=?,status=?,room_type=?,room_number=? where booking_id=?;";

	try {

	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/luton", "root", "");

	PreparedStatement pstat=conn.prepareStatement(sql);

	pstat.setString(1, checkindateinput);

	pstat.setString(2, checkoutdateout);
	
	pstat.setString(3, stat);
	
	pstat.setString(4, roombb);
	
	pstat.setString(5, num);

	pstat.setInt(6, boid);

	pstat.executeUpdate();

	pstat.close();

	conn.close();

	JOptionPane.showMessageDialog(null, "Update Sucessful");

	}

	catch(Exception ex) {

	JOptionPane.showMessageDialog(null, "Update Unsucessful");

	System.out.println("Error : "+ex.getMessage());

	}

	}	
		if(e.getSource()==bt) {

			if(table.getSelectedRow()==-1) {


			JOptionPane.showMessageDialog(null, "Please select specific data to delete" , "Error", JOptionPane.ERROR_MESSAGE);

			}

			else {

			int select = JOptionPane.showConfirmDialog(null, "Do you Want to delete this row", "Confirm", JOptionPane.YES_NO_OPTION);

			if(select == JOptionPane.YES_OPTION) {

			tableModel.removeRow(table.getSelectedRow());

			String sql= "delete from booking where booking_id=?;";

			int bbid= Integer.parseInt(bb.getText());

			try {

			Class.forName("com.mysql.cj.jdbc.Driver");//load database driver

			Connection conne = DriverManager.getConnection("jdbc:mysql://localhost/luton", "root", "");

			PreparedStatement pstate=conne.prepareStatement(sql);

			pstate.setInt(1, bbid);

			pstate.executeUpdate();

			pstate.close();

			conne.close();

			JOptionPane.showMessageDialog(null, "Booking Cancled");


			}

			catch(Exception ex) {

			JOptionPane.showMessageDialog(null, "Error");

			System.out.println("Error : "+ex.getMessage());

			}

			}

			}
		}
		}
		}


		
	