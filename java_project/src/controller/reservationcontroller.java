package controller;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import model.reservationmodel;
import model.test;
public class reservationcontroller {

		public boolean save(reservationmodel student) {

			boolean result= false;

			String url="jdbc:mysql://localhost/luton";

			try {

			Connection conn = DriverManager.getConnection(url,"root","");

			String sql = "INSERT INTO `booking`(room_type, room_service, floor_number, member_number, member_type, service_name, date_of_arrival, date_of_departure,manager_manager_id,customer_customer_id"
					+ ") VALUES (?,?,?,?,?,?,?,?,?,?);";

			PreparedStatement stat = conn.prepareStatement(sql);


			stat.setString(1, student.getRoomtype());
			
			stat.setString(2, student.getRoomservice());
			
			stat.setString(3, student.getFloornumber());
			
			stat.setString(4, student.getMembernumber());
			
			stat.setString(5, student.getType());
			
			stat.setString(6, student.getServiceName());

			stat.setString(7, student.getArrival());

			stat.setString(8, student.getDeparture());
			
			stat.setInt(9, student.getManagerid());
			
			stat.setInt(10, test.customer_customer_id);

			

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


