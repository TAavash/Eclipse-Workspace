package c;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;
//
//import m.model;
import m.model1;

public class controller1 {
	
			public boolean save(model1 s1) {

				boolean result= false;

				String url="jdbc:mysql://localhost/luton_hotel";

				try {

				Connection conn = DriverManager.getConnection(url,"root","");

				String sql = "INSERT INTO customer(full_name, date_of_birth, email, phone, country, address, post_code) VALUES(?,?,?,?,?,?,?)";

				PreparedStatement stat = conn.prepareStatement(sql);

				stat.setString(1, s1.getFullName());


				stat.setString(2, s1.getDateofBirth());

				stat.setString(3, s1.getEmail());
				
				stat.setString(4, s1.getContact());
				
				stat.setString(5, s1.getCountry());
				
				stat.setString(6, s1.getAddress());
				
				stat.setString(7, s1.getPostCode());
//				
//				stat.setString(8, s1.getUsername());
//
//				stat.setString(9, s1.getPassword());
//
//				stat.setString(10, s1.getConfPassword());


				

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
