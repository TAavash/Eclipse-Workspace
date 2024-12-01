package view;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class amenitiesview implements ActionListener{

	JFrame frame;
	JLabel label1;
	JTextField bb;
	 private JTable table;
	    private DefaultTableModel tableModel;
	    
	public amenitiesview() {		
		frame = new JFrame("My Booking");
		frame.setResizable(false);//Disable the resize button
		
		Image icon = Toolkit.getDefaultToolkit().getImage("..\\java_project/src/img/logos.jpg");    
   	    frame.setIconImage(icon);
		
		bb= new JTextField();
		bb.setVisible(false);
		bb.setBounds(0,0,120,12);
		frame.add(bb);
		
		label1 = new JLabel("Amenities:");
		frame.add(label1);
		label1.setBounds(30,20,100,30);
		
		tableModel = new DefaultTableModel();
	    tableModel.setColumnIdentifiers(new Object[]{"Service id", "Service Type", "Service Name", "Service description", "Service price"});

	        table = new JTable(tableModel);
	        String sql = "SELECT `service_id`, `service_type`, `service_name`, `service_description`, `service_price` FROM `amenities`;";
	        try {

				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/luton", "root","");

				PreparedStatement pstat = conn.prepareStatement(sql);

				ResultSet rs = pstat.executeQuery();

				while (rs.next()) {

					String sid = rs.getString("service_id");

					String type = rs.getString("service_type");

					String name = rs.getString("service_name");

					String description = rs.getString("service_description");

					String price = rs.getString("service_price");

					tableModel.addRow(new Object [] {sid,type,name,description,price});



					}

				rs.close();

				pstat.close();

				conn.close();

			}

			catch(Exception ex) {

				System.out.println("Error "+ ex.getMessage());
			}

	        JScrollPane scrollPane = new JScrollPane(table);
scrollPane.setBounds(5,50,970,450);
	        frame.add(scrollPane);
		
		//properties of JFrame
		frame.setSize(1000,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	   	

		public static void main(String[]args) {
		new amenitiesview();
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
		


			}

			
		
		}
		


		
	
