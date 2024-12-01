package controller;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.loginmodel;
public class logincontroller {

	public loginmodel login(loginmodel loog) {

	
		String url = "jdbc:mysql://localhost:/luton";
		try {
		Connection conn = DriverManager.getConnection(url, "root", "");
		String sql = "select * from customer where username=? and password=?;";
		PreparedStatement pstat = conn.prepareStatement(sql);

		pstat.setString(1, loog.getUsername());
		pstat.setString(2, loog.getPassword());
		ResultSet rs=pstat.executeQuery();//Save
		if (rs.next()) {
			loog.setCustomerid(rs.getInt("customer_id"));
		  
		}
		pstat.close();
		conn.close();
		}
		catch(Exception ex) {
		System.out.println("Error : "+ex.getMessage());
		}
		return loog;

		}

		}

