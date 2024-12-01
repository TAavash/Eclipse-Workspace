package c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import m.model;
//import model.registermodel;

public class controller {
		
public boolean save(model account) {

				boolean result= false;

				String url="jdbc:mysql://localhost/luton_hotel";

				try {

				Connection conn = DriverManager.getConnection(url,"root","");

				String sql = "INSERT INTO customer(c_username,c_password,confirm_password) VALUES(?,?,?)";

				PreparedStatement stat = conn.prepareStatement(sql);

				stat.setString(1, account.getUsername());


				stat.setString(2, account.getPassword());

				stat.setString(3, account.getConfPassword());

//				

				stat.executeUpdate();

				stat.close();

				conn.close();

				result = true;

				}

				catch(Exception e) {

				System.out.println("Error: "+e.getMessage());
				}

				return result;

				}





			
		}