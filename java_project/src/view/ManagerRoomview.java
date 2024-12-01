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

import model.test;
import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

public class ManagerRoomview implements ActionListener{

	JFrame frame;
	JLabel label1;
	JButton updatebtn;
	JTextField bb;
	@SuppressWarnings("rawtypes")
	JComboBox availability;
	 private JTable table;
	    private DefaultTableModel tableModel;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ManagerRoomview() {		
		frame = new JFrame("Room Details");
		frame.setResizable(false);//Disable the resize button
		
		Image icon = Toolkit.getDefaultToolkit().getImage("..\\java_project/src/img/logos.jpg");    
   	    frame.setIconImage(icon);
		
		bb= new JTextField();
		bb.setVisible(false);
		bb.setBounds(0,0,120,12);
		frame.add(bb);
		
		label1 = new JLabel("Availability:");
		frame.add(label1);
		label1.setBounds(30,50,100,30);
		
		String available[]={"yes","no"};
		availability= new JComboBox(available);
		availability.setBounds(150,50,110,30);
		frame.add(availability);
		
		updatebtn = new JButton("Update");
		updatebtn.addActionListener(this);
		updatebtn.setBounds(30,150,90,30);
		frame.add(updatebtn);
		
		
		 tableModel = new DefaultTableModel();
	        tableModel.setColumnIdentifiers(new Object[]{"room id", "room number", "room type", "room service", "floor number", "room price", "availability"});

	        table = new JTable(tableModel);
	       table.addMouseListener( new MouseAdapter() {

	        	public void mouseClicked(MouseEvent arg0) {

	        	int i = table.getSelectedRow();


	        	bb.setText(table.getValueAt(i,0).toString());


	        	availability.setSelectedItem(table.getValueAt(i,1).toString());

	        	}});
	        String sql = "SELECT `room_id`, `room_number`, `room_type`, `room_service`, `floor_number`, `room_price`, `availability` FROM `room`;";
	        try {

				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/luton", "root","");

				PreparedStatement pstat = conn.prepareStatement(sql);

		//		pstat.setInt(1,test.customer_customer_id);

				ResultSet rs = pstat.executeQuery();

				while (rs.next()) {

					String roomId = rs.getString("room_id");

					String roomNumber = rs.getString("room_number");

					String roomType = rs.getString("room_type");

					String roomService = rs.getString("room_service");

					String floorNumber = rs.getString("floor_number");

					String roomPrice = rs.getString("room_price");
					
					String available1 = rs.getString("availability");

					tableModel.addRow(new Object [] {roomId,roomNumber,roomType,roomService,floorNumber, roomPrice,available1});



					}

				rs.close();

				pstat.close();

				conn.close();

			}

			catch(Exception ex) {

				System.out.println("Error "+ ex.getMessage());
			}

	        JScrollPane scrollPane = new JScrollPane(table);
scrollPane.setBounds(5,185,870,250);
	        frame.add(scrollPane);
		
		//properties of JFrame
		frame.setSize(900,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	   	

		public static void main(String[]args) {
		new ManagerRoomview();
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
		

if(e.getSource()==updatebtn) {
	int boid = Integer.parseInt(bb.getText()) ;
	
	String avai = (String) availability.getSelectedItem();
	
	int row = table.getSelectedRow();

	if(row==-1) {

	JOptionPane.showMessageDialog(null, "Please select specific row!");

	}


	tableModel.setValueAt(availability,row,1);
	

	String sql ="update room set availability=? where room_id=?;";

	try {

	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/luton", "root", "");

	PreparedStatement pstat=conn.prepareStatement(sql);

	pstat.setString(1, avai);

	pstat.setInt(2, boid);

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
}
	
}
		
		


		
	
