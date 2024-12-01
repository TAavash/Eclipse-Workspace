package manager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import model.test;
import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class RoomTableGUIs extends JFrame implements ActionListener{


    private JTable table;
    private DefaultTableModel tableModel;
    private JButton refreshButton;
JTextField b;
    public RoomTableGUIs() {
        super("Room Table");
        Image icon = Toolkit.getDefaultToolkit().getImage("..\\java_project/src/img/logos.jpg");    
   	    setIconImage(icon);
b= new JTextField();
b.setBounds(0,0,11,11);
b.setVisible(false);
add(b);
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new Object[]{"Booking id", "Date of Arrival", "Date of Departure","Status", "Room Type", "Room Service", "Floor Number"});

        table = new JTable(tableModel);
     /*   table.addMouseListener( new MouseAdapter() {

        	public void mouseClicked(MouseEvent arg0) {

        	int i = table.getSelectedRow();


        	b.setText(table.getValueAt(i,0).toString());

        	roomCategories.setSelectedItem(table.getValueAt(i,1).toString());

        	((JTextField)checkInDate.getDateEditor().getUiComponent()).setText(table.getValueAt(i,2).toString());

        	((JTextField)checkOutDate.getDateEditor().getUiComponent()).setText(table.getValueAt(i,3).toString());


        	roomPrice.setText(table.getValueAt(i,4).toString());

        	}});*/
        String sql = "SELECT `booking_id`, `date_of_arrival`, `date_of_departure`, `status`, `room_type`, `room_service`, `floor_number` FROM `booking` WHERE customer_customer_id = ?;";
        try {

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/luton", "root","");

			PreparedStatement pstat = conn.prepareStatement(sql);



			pstat.setInt(1,test.customer_customer_id);

			ResultSet rs = pstat.executeQuery();

			while (rs.next()) {

				String id = rs.getString("booking_id");

				String checkindate = rs.getString("date_of_arrival");

				String checkoutdate = rs.getString("date_of_departure");

				String status = rs.getString("status");

				String roomType = rs.getString("room_type");

				String roomService = rs.getString("room_service");
				
				String floorNumber = rs.getString("floor_number");

				tableModel.addRow(new Object [] {id,checkindate,checkoutdate,status,roomType, roomService,floorNumber});



				}

			rs.close();

			pstat.close();

			conn.close();

		}

		catch(Exception ex) {

			System.out.println("Error "+ ex.getMessage());

		}

        JScrollPane scrollPane = new JScrollPane(table);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);

        add(panel);

        setSize(700, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new RoomTableGUIs();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		/*

			if(e.getSource()==edit) {

			int bookid = Integer.parseInt(bidid.getText()) ;

			String customerType = (String) roomCategories.getSelectedItem();

			String checkindate = ((JTextField)checkInDate.getDateEditor().getUiComponent()).getText();

			String checkoutdate = ((JTextField)checkOutDate.getDateEditor().getUiComponent()).getText();


			String price = roomPrice.getText().toString();

			int row = bookingTable.getSelectedRow();

			if(row==-1) {

			UIManager.put("OptionPane.messageForeground", Color.black);

			UIManager.put("OptionPane.background", Color.darkGray);

			UIManager.put("Panel.background", Color.yellow);

			UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));

			JOptionPane.showMessageDialog(null, "Please select specific row!");

			}


			viewModel.setValueAt(checkindate,row,1);

			viewModel.setValueAt(checkoutdate,row,2);

			viewModel.setValueAt(customerType,row,3);

			viewModel.setValueAt(price,row,4);


			String sql ="update bookingtable set room_type=?, check_inDate=?,checkOutDate=?,roomTotalCost=? where booking_id=?;";

			try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/onlinehotelbookingsystem", "root", "");

			PreparedStatement pstat=conn.prepareStatement(sql);

			pstat.setString(1, customerType);

			pstat.setString(2, checkindate);


			pstat.setString(3, checkoutdate);

			pstat.setString(4, price);

			pstat.setInt(5, bookid);

			pstat.executeUpdate();

			pstat.close();

			conn.close();

			JOptionPane.showMessageDialog(null, "Update Sucess");

			}

			catch(Exception ex) {

			JOptionPane.showMessageDialog(null, "Update Unsucess");

			System.out.println("Error : "+ex.getMessage());

			}

			}

			if(e.getSource()==cancel) {

			if(bookingTable.getSelectedRow()==-1) {

			UIManager.put("OptionPane.messageForeground", Color.black);

			UIManager.put("OptionPane.background", Color.darkGray);

			UIManager.put("Panel.background", Color.yellow);

			UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.BOLD, 14));

			JOptionPane.showMessageDialog(null, "Please select specific data to delete" , "Error", JOptionPane.ERROR_MESSAGE);

			}

			else {

			int select = JOptionPane.showConfirmDialog(null, "Do you Want to delete this row", "Confirm", JOptionPane.YES_NO_OPTION);

			if(select == JOptionPane.YES_OPTION) {

			viewModel.removeRow(bookingTable.getSelectedRow());

			String sqlq = "delete from bookingtable where booking_id=?";

			int bkingid= Integer.parseInt(bidid.getText());

			try {

			Class.forName("com.mysql.cj.jdbc.Driver");//load database driver

			Connection conne = DriverManager.getConnection("jdbc:mysql://localhost/onlinehotelbookingsystem", "root", "");

			PreparedStatement pstate=conne.prepareStatement(sqlq);

			pstate.setInt(1, bkingid);

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
	}*/
	}
}


