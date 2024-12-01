package controller;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import model.paymentmodel;
import model.test;

public class paymentcontroller {


		public boolean save(paymentmodel student) {

			boolean result= false;

			String url="jdbc:mysql://localhost/luton";

			try {

			Connection conn = DriverManager.getConnection(url,"root","");

			String sql = "INSERT INTO `payment`(card_type, card_number, card_expiry, security_code,booking_booking_id ) VALUES (?,?,?,?,?);";

			PreparedStatement stat = conn.prepareStatement(sql);


			stat.setString(1, student.getCardtype());
			
			stat.setString(2, student.getCardnumber());
			
			stat.setString(3, student.getCardexpiry());
			
			stat.setString(4, student.getSecuritycode());
			
			stat.setInt(5, test.booking_booking_id);
			

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


