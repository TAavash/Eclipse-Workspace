package manager;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class RoomTableGUI extends JFrame {

    private static final String JDBC_URL = "jdbc:mysql://localhost/luton";
    private static final String JDBC_USER = "Manager";
    private static final String JDBC_PASSWORD = "password";
    private static final String SQL_QUERY = "SELECT room_number, room_type, room_service, floor_number, room_price, availability FROM room WHERE room_number=? AND room_type=? AND room_service=? AND floor_number=? AND room_price=? AND availability=?";

    private JTable table;
    private DefaultTableModel tableModel;
    private JButton refreshButton;

    public RoomTableGUI() {
        super("Room Table");

        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new Object[]{"Room Number", "Room Type", "Room Service", "Floor Number", "Room Price", "Availability"});

        table = new JTable(tableModel);

        refreshButton = new JButton("Refresh");
//        refreshButton.setBounds(100, 700, 70, 30);
        refreshButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				refreshTable();
			}
		});

        JScrollPane scrollPane = new JScrollPane(table);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(refreshButton, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        add(panel);

        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void refreshTable() {
        try {
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            PreparedStatement statement = connection.prepareStatement(SQL_QUERY);
            statement.setInt(1, 123);
            statement.setString(2, "Single");
            statement.setString(3, "Breakfast");
            statement.setInt(4, 2);
            statement.setDouble(5, 150.00);
            statement.setBoolean(6, true);

            ResultSet resultSet = statement.executeQuery();

            tableModel.setRowCount(0);

            while (resultSet.next()) {
                Object[] row = new Object[6];
                row[0] = resultSet.getInt("room_number");
                row[1] = resultSet.getString("room_type");
                row[2] = resultSet.getString("room_service");
                row[3] = resultSet.getInt("floor_number");
                row[4] = resultSet.getDouble("room_price");
                row[5] = resultSet.getBoolean("availability");
                tableModel.addRow(row);
            }

            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RoomTableGUI::new);
        new RoomTableGUI();
    }
}


