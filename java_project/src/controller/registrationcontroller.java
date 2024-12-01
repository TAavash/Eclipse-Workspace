package controller;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import model.registermodel;

public class registrationcontroller {
	
		public boolean save(registermodel student) {

			boolean result= false;

			String url="jdbc:mysql://localhost/luton";

			try {

			Connection conn = DriverManager.getConnection(url,"root","");

			String sql = "INSERT INTO customer(full_name, date_of_birth, email, phone, country, address, gender, username, password) VALUES(?,?,?,?,?,?,?,?,?)";

			PreparedStatement stat = conn.prepareStatement(sql);

			stat.setString(1, student.getFullName());


			stat.setString(2, student.getDateofBirth());

			stat.setString(3, student.getEmail());
			
			stat.setString(4, student.getContact());
			
			stat.setString(5, student.getCountry());
			
			stat.setString(6, student.getAddress());
			
			stat.setString(7, student.getGender());
			
			stat.setString(8, student.getUsername());
			
			stat.setString(9, student.getPassword());

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


